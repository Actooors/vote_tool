package com.gmr.vote.model.OV;

import lombok.Data;

/**
 * @program: vote
 * @description: 候选人姓名
 * @author: ggmr
 * @create: 2018-06-17 01:49
 */
public class Voters {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
