package com.gmr.vote.model.OV;

import lombok.Data;

/**
 * @program: vote
 * @description: 登录接口返回信息
 * @author: ggmr
 * @create: 2018-06-17 02:18
 */
@Data
public class TokenResponse {
    private Integer identity;
    private String token;
    private VoteMaxNum voteMaxNum;
}
