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
    // 1投票 2反对 3弃权
    private Integer voted;
    private String name;
}
