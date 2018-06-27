package com.gmr.vote.model.entity;

public class User {
    private String userId;

    private Integer type;

    private Integer partyCountNum;

    private Integer groupCountNum;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPartyCountNum() {
        return partyCountNum;
    }

    public void setPartyCountNum(Integer partyCountNum) {
        this.partyCountNum = partyCountNum;
    }

    public Integer getGroupCountNum() {
        return groupCountNum;
    }

    public void setGroupCountNum(Integer groupCountNum) {
        this.groupCountNum = groupCountNum;
    }
}