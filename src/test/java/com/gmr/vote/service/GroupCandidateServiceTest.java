package com.gmr.vote.service;

import com.gmr.vote.model.Jsonrequestbody.CandidateVote;
import com.gmr.vote.model.Jsonrequestbody.VoteMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupCandidateServiceTest {

    @Resource
    private GroupCandidateService groupCandidateService;
    @Test
    public void getGroupPercent() throws UnsupportedEncodingException {
        VoteMessage voteMessage = new VoteMessage();
        voteMessage.setName("于伟");
        voteMessage.setVoted(1);
        CandidateVote candidateVote = new CandidateVote();
        List<VoteMessage> list = new ArrayList<>();
        list.add(voteMessage);
        candidateVote.setData(list);
        groupCandidateService.groupVote("16122131",candidateVote);
    }
}