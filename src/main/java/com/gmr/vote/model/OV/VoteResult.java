package com.gmr.vote.model.OV;

import com.gmr.vote.model.Jsonrequestbody.VoteMessage;

import java.util.List;

/**
 * @program: vote
 * @description: 获取投票返回信息
 * @author: ggmr
 * @create: 2018-06-16 22:19
 */

public class VoteResult {
    public List<VoteMessage> getVoteMessageList() {
        return voteMessageList;
    }

    public void setVoteMessageList(List<VoteMessage> voteMessageList) {
        this.voteMessageList = voteMessageList;
    }

    List<VoteMessage> voteMessageList;
}
