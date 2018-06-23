package com.gmr.vote.model.entity;

public class GroupCandidate implements Comparable<GroupCandidate>{
    private Integer id;

    private String groupCandidateName;

    private Integer votesNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupCandidateName() {
        return groupCandidateName;
    }

    public void setGroupCandidateName(String groupCandidateName) {
        this.groupCandidateName = groupCandidateName == null ? null : groupCandidateName.trim();
    }

    public Integer getVotesNumber() {
        return votesNumber;
    }

    public void setVotesNumber(Integer votesNumber) {
        this.votesNumber = votesNumber;
    }

    @Override
    public int compareTo(GroupCandidate o) {
        return o.getVotesNumber().compareTo(this.getVotesNumber());
    }
}