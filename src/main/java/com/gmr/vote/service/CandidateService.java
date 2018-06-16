package com.gmr.vote.service;

import com.gmr.vote.dao.CandidateMapper;
import com.gmr.vote.model.Jsonrequestbody.CandidateVote;
import com.gmr.vote.model.Jsonrequestbody.VoteMessage;
import com.gmr.vote.model.OV.Result;
import com.gmr.vote.model.OV.VoteInformation;
import com.gmr.vote.model.ResultTool;
import com.gmr.vote.model.entity.Candidate;
import com.gmr.vote.model.entity.CandidateExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: vote
 * @description: 投票service的实现
 * @author: ggmr
 * @create: 2018-06-16 20:32
 */
@Service
public class CandidateService {

    @Resource
    private CandidateMapper candidateMapper;

    /**
     * @Description: 具体实现类
     * @Param: [voteList]
     * @Return: com.gmr.vote.model.OV.Result
     * @Author: ggmr
     * @Date: 18-6-16
     */
    public Result vote(CandidateVote vote) {
        List<VoteMessage> voteList = vote.getVoteMessageList();
        if(voteList.isEmpty()) {
            return ResultTool.error("给予的投票内容为空");
        }
        for(VoteMessage voteMessage : voteList) {
            if(voteMessage.getVoted().equals(true)) {
                Candidate candidate = candidateMapper.selectByPrimaryKey(voteMessage.getName());
                candidate.setVotesNumber(candidate.getVotesNumber() + 1);
                candidateMapper.updateByPrimaryKeySelective(candidate);
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
        CandidateExample candidateExample = new CandidateExample();
        candidateExample.createCriteria()
                .andCandidateNameIsNotNull();
        List<Candidate> candidateList = candidateMapper.selectByExample(candidateExample);

        if(judge.equals(1)) {
            Collections.sort(candidateList);
        }

        List<VoteInformation> voteInformationList = new ArrayList<>();
        for(Candidate candidate : candidateList) {
            VoteInformation voteInformation = new VoteInformation();
            voteInformation.setName(candidate.getCandidateName());
            voteInformation.setNum(candidate.getVotesNumber());
            voteInformationList.add(voteInformation);
        }
        return ResultTool.success(voteInformationList);
    }

}
