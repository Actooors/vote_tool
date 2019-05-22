package com.gmr.vote.model.entity;

public class VoteConfig {
    private Integer id;

    private String conferenceName;

    private String voteName;

    private Integer candicatenumber;

    private Integer electnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName == null ? null : conferenceName.trim();
    }

    public String getVoteName() {
        return voteName;
    }

    public void setVoteName(String voteName) {
        this.voteName = voteName == null ? null : voteName.trim();
    }

    public Integer getCandicatenumber() {
        return candicatenumber;
    }

    public void setCandicatenumber(Integer candicatenumber) {
        this.candicatenumber = candicatenumber;
    }

    public Integer getElectnumber() {
        return electnumber;
    }

    public void setElectnumber(Integer electnumber) {
        this.electnumber = electnumber;
    }
}