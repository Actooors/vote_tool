package com.gmr.vote.model.OV;

import lombok.Data;

/**
 * @program: vote
 * @description: 登录接口返回信息
 * @author: ggmr
 * @create: 2018-06-17 02:18
 */

public class TokenResponse {
    private Integer identity;

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public VoteMaxNum getVoteMaxNum() {
        return voteMaxNum;
    }

    public void setVoteMaxNum(VoteMaxNum voteMaxNum) {
        this.voteMaxNum = voteMaxNum;
    }

    private String token;
    private VoteMaxNum voteMaxNum;
}
