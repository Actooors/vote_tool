package com.gmr.vote.model.entity;

public class PartyCandidate implements Comparable<PartyCandidate> {
    private String partyCandidateName;

    private Integer votesNumber;

    public String getPartyCandidateName() {
        return partyCandidateName;
    }

    public void setPartyCandidateName(String partyCandidateName) {
        this.partyCandidateName = partyCandidateName == null ? null : partyCandidateName.trim();
    }

    public Integer getVotesNumber() {
        return votesNumber;
    }

    public void setVotesNumber(Integer votesNumber) {
        this.votesNumber = votesNumber;
    }



    @Override
    public int compareTo(PartyCandidate partyCandidate) {
        return partyCandidate.getVotesNumber().compareTo(this.getVotesNumber());
    }
}