package com.gmr.vote.service;

import com.gmr.vote.dao.GroupCandidateMapper;
import com.gmr.vote.model.Jsonrequestbody.CandidateVote;
import com.gmr.vote.model.Jsonrequestbody.Order;
import com.gmr.vote.model.Jsonrequestbody.VoteMessage;
import com.gmr.vote.model.OV.Result;
import com.gmr.vote.model.OV.VoteInformation;
import com.gmr.vote.model.OV.Voters;
import com.gmr.vote.model.ResultTool;
import com.gmr.vote.model.entity.GroupCandidate;
import com.gmr.vote.model.entity.GroupCandidateExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    /**
     * @Description: 具体实现类
     * @Param: [voteList]
     * @Return: com.gmr.vote.model.OV.Result
     * @Author: ggmr
     * @Date: 18-6-16
     */
    public Result groupVote(CandidateVote vote) {
        List<VoteMessage> voteList = vote.getData();
        if(voteList.isEmpty()) {
            return ResultTool.error("给予的投票内容为空");
        }
        for(VoteMessage voteMessage : voteList) {
            if(voteMessage.getVoted().equals(true)) {
                GroupCandidate groupCandidate = groupCandidateMapper.selectByPrimaryKey(voteMessage.getName());
                groupCandidate.setVotesNumber(groupCandidate.getVotesNumber() + 1);
                groupCandidateMapper.updateByPrimaryKeySelective(groupCandidate);
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
            voteInformation.setNum(groupCandidate.getVotesNumber());
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
