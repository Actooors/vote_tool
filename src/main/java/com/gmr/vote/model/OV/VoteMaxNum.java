package com.gmr.vote.model.OV;

import lombok.Data;

/**
 * @program: vote
 * @description:
 * @author: ggmr
 * @create: 2018-06-27 10:13
 */

public class VoteMaxNum {
    public Integer getPartMaxVoteNum() {
        return partMaxVoteNum;
    }

    public void setPartMaxVoteNum(Integer partMaxVoteNum) {
        this.partMaxVoteNum = partMaxVoteNum;
    }

    public Integer getGroupMaxVoteNum() {
        return groupMaxVoteNum;
    }

    public void setGroupMaxVoteNum(Integer groupMaxVoteNum) {
        this.groupMaxVoteNum = groupMaxVoteNum;
    }

    private Integer partMaxVoteNum;
    private Integer groupMaxVoteNum;
}
