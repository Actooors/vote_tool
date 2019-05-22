package com.gmr.vote.model.Jsonrequestbody;


import java.util.List;

/**
 * @program: vote
 * @description: 投票情况
 * @author: ggmr
 * @create: 2018-06-16 21:14
 */

public class CandidateVote {
    public List<VoteMessage> getData() {
        return data;
    }

    public void setData(List<VoteMessage> data) {
        this.data = data;
    }

    List<VoteMessage> data;
}
