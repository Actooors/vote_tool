package com.gmr.vote.model.Jsonrequestbody;

import lombok.Data;

/**
 * @program: vote
 * @description: 投票信息
 * @author: ggmr
 * @create: 2018-06-16 21:11
 */

public class VoteMessage {
<<<<<<< HEAD
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
=======
>>>>>>> c2b63351b236d105ed8c211c5c3c6e5bb83aa8be
    private Integer voted;
    private String name;
}
