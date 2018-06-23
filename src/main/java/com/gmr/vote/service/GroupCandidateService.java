package com.gmr.vote.service;

import com.gmr.vote.dao.GroupCandidateMapper;
import com.gmr.vote.dao.UserMapper;
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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: vote
 * @description: 团代表service
 * @author: ggmr
 * @create: 2018-06-17 00:57
 */
@Service
public class GroupCandidateService {
    @Resource
    private GroupCandidateMapper groupCandidateMapper;

    @Resource
    private VoteNumberMapper voteNumberMapper;

    @Resource
    private UserMapper userMapper;
    /**
     * @Description: 具体实现类
     * @Param: [voteList]
     * @Return: com.gmr.vote.model.OV.Result
     * @Author: ggmr
     * @Date: 18-6-16
     */
    public Result groupVote(String userId, CandidateVote vote) {
        List<VoteMessage> voteList = vote.getData();
        if(voteList.isEmpty()) {
            return ResultTool.error("给予的投票内容为空");
        }
        int count = 0;
        for(VoteMessage voteMessage : voteList) {
            if(voteMessage.getVoted().equals(true)) {
                count++;
                GroupCandidateExample groupCandidateExample = new GroupCandidateExample();
                groupCandidateExample.createCriteria()
                        .andGroupCandidateNameEqualTo(voteMessage.getName());
                GroupCandidate groupCandidate = groupCandidateMapper.selectByExample(groupCandidateExample).get(0);
                groupCandidate.setVotesNumber(groupCandidate.getVotesNumber() + 1);
                groupCandidateMapper.updateByPrimaryKeySelective(groupCandidate);
            }
        }
        User user = userMapper.selectByPrimaryKey(userId);
        user.setGroupCountNum(user.getGroupCountNum() + 1);
        userMapper.updateByPrimaryKeySelective(user);

        VoteNumber voteNumber = voteNumberMapper.selectByPrimaryKey(-1);
        voteNumber.setGroupNum(voteNumber.getGroupNum() + count);
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
    public Result getAllGroupVoteNum() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdIsNotNull();
        List<User> userList = userMapper.selectByExample(userExample);
        int count = 0;
        for(User user : userList) {
            count += user.getGroupCountNum();
        }
        return ResultTool.success(count);
    }


    public Result getGroupPercent(Order order) {

        Integer all = voteNumberMapper.selectByPrimaryKey(-1).getGroupNum();
        Integer judge = order.getOrder();
        GroupCandidateExample groupCandidateExample = new GroupCandidateExample();
        groupCandidateExample.createCriteria()
                .andGroupCandidateNameIsNotNull();
        List<GroupCandidate> groupCandidatesList = groupCandidateMapper.selectByExample(groupCandidateExample);

        if(judge.equals(1)) {
            Collections.sort(groupCandidatesList);
        }

        List<VoteInformation> voteInformationList = new ArrayList<>();
        for(GroupCandidate groupCandidate : groupCandidatesList) {
            VoteInformation voteInformation = new VoteInformation();
            voteInformation.setName(groupCandidate.getGroupCandidateName());
            double percentage;
            if(all != 0) {
                percentage = (double)groupCandidate.getVotesNumber()/all*100;
                DecimalFormat df = new DecimalFormat("0.0");
                voteInformation.setNum(df.format(percentage));
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
        GroupCandidateExample groupCandidateExample = new GroupCandidateExample();
        groupCandidateExample.createCriteria()
                .andGroupCandidateNameIsNotNull();
        List<GroupCandidate> groupCandidatesList = groupCandidateMapper.selectByExample(groupCandidateExample);

        if(judge.equals(1)) {
            Collections.sort(groupCandidatesList);
        }

        List<VoteInformation> voteInformationList = new ArrayList<>();
        for(GroupCandidate groupCandidate : groupCandidatesList) {
            VoteInformation voteInformation = new VoteInformation();
            voteInformation.setName(groupCandidate.getGroupCandidateName());
            voteInformation.setNum(groupCandidate.getVotesNumber().toString());
            voteInformationList.add(voteInformation);
        }
        return ResultTool.success(voteInformationList);
    }


    public Result getName() {
        GroupCandidateExample groupCandidateExample = new GroupCandidateExample();
        groupCandidateExample.createCriteria()
                .andGroupCandidateNameIsNotNull();
        List<GroupCandidate> groupCandidatesList = groupCandidateMapper.selectByExample(groupCandidateExample);


        List<Voters> votersList = new ArrayList<>();
        for(GroupCandidate groupCandidate : groupCandidatesList) {
            Voters voters = new Voters();
            voters.setName(groupCandidate.getGroupCandidateName());
            votersList.add(voters);
        }
        return ResultTool.success(votersList);
    }

}
