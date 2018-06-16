package com.gmr.vote.model.Jsonrequestbody;

import lombok.Data;

import java.util.List;

/**
 * @program: vote
 * @description: 投票情况
 * @author: ggmr
 * @create: 2018-06-16 21:14
 */
@Data
public class CandidateVote {
    List<VoteMessage> data;
}
