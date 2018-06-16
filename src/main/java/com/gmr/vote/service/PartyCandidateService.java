package com.gmr.vote.service;

import com.gmr.vote.dao.PartyCandidateMapper;
import com.gmr.vote.model.Jsonrequestbody.CandidateVote;
import com.gmr.vote.model.Jsonrequestbody.VoteMessage;
import com.gmr.vote.model.OV.Result;
import com.gmr.vote.model.OV.VoteInformation;
import com.gmr.vote.model.ResultTool;
import com.gmr.vote.model.entity.PartyCandidate;
import com.gmr.vote.model.entity.PartyCandidateExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    /**
     * @Description: 具体实现类
     * @Param: [voteList]
     * @Return: com.gmr.vote.model.OV.Result
     * @Author: ggmr
     * @Date: 18-6-16
     */
    public Result partyVote(CandidateVote vote) {
        List<VoteMessage> voteList = vote.getVoteMessageList();
        if(voteList.isEmpty()) {
            return ResultTool.error("给予的投票内容为空");
        }
        for(VoteMessage voteMessage : voteList) {
            if(voteMessage.getVoted().equals(true)) {
                PartyCandidate partyCandidate = partyCandidateMapper.selectByPrimaryKey(voteMessage.getName());
                partyCandidate.setVotesNumber(partyCandidate.getVotesNumber() + 1);
                partyCandidateMapper.updateByPrimaryKeySelective(partyCandidate);
            }
        }
        return ResultTool.success();
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
    public Result getVotes(Integer judge) {
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
            voteInformation.setNum(partyCandidate.getVotesNumber());
            voteInformationList.add(voteInformation);
        }
        return ResultTool.success(voteInformationList);
    }

}
