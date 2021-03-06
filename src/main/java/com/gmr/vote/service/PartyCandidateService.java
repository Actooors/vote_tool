package com.gmr.vote.service;

import com.gmr.vote.dao.PartyCandidateMapper;
import com.gmr.vote.dao.UserMapper;
import com.gmr.vote.dao.VoteConfigMapper;
import com.gmr.vote.dao.VoteNumberMapper;
import com.gmr.vote.model.Jsonrequestbody.CandidateVote;
import com.gmr.vote.model.Jsonrequestbody.Order;
import com.gmr.vote.model.Jsonrequestbody.VoteMessage;
import com.gmr.vote.model.OV.Result;
import com.gmr.vote.model.OV.VoteInformation;
import com.gmr.vote.model.OV.Voters;
import com.gmr.vote.model.ResultTool;
import com.gmr.vote.model.entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: vote
 * @description: 党代表service
 * @author: ggmr
 * @create: 2018-06-16 20:32
 */
@Service
public class PartyCandidateService {

    @Resource
    private PartyCandidateMapper partyCandidateMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private VoteNumberMapper voteNumberMapper;

    @Resource
    private VoteConfigMapper voteConfigMapper;

    /**
     * @Description: 具体实现类
     * @Param: [voteList]
     * @Return: com.gmr.vote.model.OV.Result
     * @Author: ggmr
     * @Date: 18-6-16
     */
    public Result partyVote(String userId, CandidateVote vote) throws UnsupportedEncodingException {
        List<VoteMessage> voteList = vote.getData();
        if(voteList.isEmpty()) {
            return ResultTool.error("给予的投票内容为空");
        }
        int cou = 0;
        for(VoteMessage voteMessage : voteList) {
            if(voteMessage.getVoted() == 0) {
                cou++;
            }
        }
        VoteConfig voteConfig = voteConfigMapper.selectByPrimaryKey(1);
        if(cou > voteConfig.getCandicatenumber()) {
            return ResultTool.error("投赞成人数不能多于" +  voteConfig.getElectnumber());
        }

        int count = 0;

        for(VoteMessage voteMessage : voteList) {
            PartyCandidateExample partyCandidateExample = new PartyCandidateExample();
            partyCandidateExample.createCriteria()
                    .andPartyCandidateNameEqualTo(java.net.URLDecoder.decode(voteMessage.getName(), "utf-8"));
            PartyCandidate partyCandidate = partyCandidateMapper.selectByExample(partyCandidateExample).get(0);
            switch (voteMessage.getVoted()) {
                case 0 : {
                    count++;
                    partyCandidate.setVotesNumber(partyCandidate.getVotesNumber() + 1);
                    break;
                }
                case 1 : {
                    partyCandidate.setVotesAgainstNumber(partyCandidate.getVotesAgainstNumber() + 1);
                    break;
                }
                case 2: {
                    partyCandidate.setVotesAbandonNumber(partyCandidate.getVotesAbandonNumber() + 1);
                    break;
                }
                default:
            }
            partyCandidateMapper.updateByPrimaryKeySelective(partyCandidate);
        }
        User user = userMapper.selectByPrimaryKey(userId);
        user.setPartyCountNum(user.getPartyCountNum() + 1);
        userMapper.updateByPrimaryKeySelective(user);

        VoteNumber voteNumber = voteNumberMapper.selectByPrimaryKey(-1);
        voteNumber.setPartyNum(voteNumber.getPartyNum() + count);
        voteNumberMapper.updateByPrimaryKeySelective(voteNumber);
        return ResultTool.success();
    }


    /**
     * @Description: 获得所有的投票数
     * @Param: []
     * @Return: com.gmr.vote.model.OV.Result
     * @Author: ggmr
     * @Date: 18-6-21
     */
    public Result getAllPartyVoteNum() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdIsNotNull();
        List<User> userList = userMapper.selectByExample(userExample);
        int count = 0;
        for(User user : userList) {
            count += user.getPartyCountNum();
        }
        return ResultTool.success(count);
    }


    public Result getPartyPercent(Order order) {
        Integer all = voteNumberMapper.selectByPrimaryKey(-1).getPartyNum();
        Integer judge = order.getOrder();
        PartyCandidateExample partyCandidateExample = new PartyCandidateExample();
        partyCandidateExample.createCriteria()
                .andPartyCandidateNameIsNotNull();
        List<PartyCandidate> partyCandidatesList = partyCandidateMapper.selectByExample(partyCandidateExample);

        if(judge.equals(1)) {
            Collections.sort(partyCandidatesList);
        }

        List<VoteInformation> voteInformationList = new ArrayList<>();
        for(PartyCandidate partyCandidate : partyCandidatesList) {
            VoteInformation voteInformation = new VoteInformation();
            voteInformation.setName(partyCandidate.getPartyCandidateName());
            double percentage;
            if(all != 0) {
                percentage = (double)partyCandidate.getVotesNumber()/all;
                if(percentage == 0) {
                    voteInformation.setNum("0%");
                } else {
                    DecimalFormat df = new DecimalFormat("0.00%");
                    voteInformation.setNum(df.format(percentage));
                }
//                System.out.println(df.format(0.1234));
//                DecimalFormat df = new DecimalFormat("0.0");
            } else {
                voteInformation.setNum("0");
            }
            voteInformationList.add(voteInformation);
        }
        return ResultTool.success(voteInformationList);
    }


    /**
     * @Description: 返回候选人得票信息。
     *               根据judge判断是否需要对候选人根据票数进行排序，
     *               0是无需排序，1是需要排序
     * @Param: []
     * @Return: com.gmr.vote.model.OV.Result
     * @Author: ggmr
     * @Date: 18-6-16
     */
    public Result getVotes(Order order) {
        Integer judge = order.getOrder();
        PartyCandidateExample partyCandidateExample = new PartyCandidateExample();
        partyCandidateExample.createCriteria()
                .andPartyCandidateNameIsNotNull();
        List<PartyCandidate> partyCandidatesList = partyCandidateMapper.selectByExample(partyCandidateExample);

        if(judge.equals(1)) {
            Collections.sort(partyCandidatesList);
        }

        List<VoteInformation> voteInformationList = new ArrayList<>();
        for(PartyCandidate partyCandidate : partyCandidatesList) {
            VoteInformation voteInformation = new VoteInformation();
            voteInformation.setName(partyCandidate.getPartyCandidateName());
            voteInformation.setNum(partyCandidate.getVotesNumber().toString());
            voteInformation.setNum1(partyCandidate.getVotesAgainstNumber().toString());
            voteInformation.setNum2(partyCandidate.getVotesAbandonNumber().toString());
            voteInformationList.add(voteInformation);
        }
        return ResultTool.success(voteInformationList);
    }

    public Result getName() {
        PartyCandidateExample partyCandidateExample = new PartyCandidateExample();
        partyCandidateExample.createCriteria()
                .andPartyCandidateNameIsNotNull();
        List<PartyCandidate> partyCandidatesList = partyCandidateMapper.selectByExample(partyCandidateExample);


        List<Voters> votersList = new ArrayList<>();
        for(PartyCandidate partyCandidate : partyCandidatesList) {
            Voters voters = new Voters();
            voters.setName(partyCandidate.getPartyCandidateName());
            votersList.add(voters);
        }
        return ResultTool.success(votersList);
    }

}
