package com.gmr.vote.model.entity;

public class GroupCandidate implements Comparable<GroupCandidate> {
    private String groupCandidateName;

    private Integer votesNumber;

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
    public int compareTo(GroupCandidate groupCandidate) {
        return groupCandidate.getVotesNumber().compareTo(this.getVotesNumber());
    }
}