package com.gmr.vote.model.Jsonrequestbody;


/**
 * @program: vote
 * @description: 投票信息
 * @author: ggmr
 * @create: 2018-06-16 21:11
 */

public class VoteMessage {

    public Integer getVoted() {
        return voted;
    }

    public void setVoted(Integer voted) {
        this.voted = voted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 0投票 1反对 2弃权
    private Integer voted;
    private String name;
}
