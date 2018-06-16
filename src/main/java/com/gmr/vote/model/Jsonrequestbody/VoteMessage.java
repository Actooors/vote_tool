package com.gmr.vote.model.Jsonrequestbody;

import lombok.Data;

/**
 * @program: vote
 * @description: 投票信息
 * @author: ggmr
 * @create: 2018-06-16 21:11
 */
@Data
public class VoteMessage {
    private Boolean voted;
    private String name;
}
