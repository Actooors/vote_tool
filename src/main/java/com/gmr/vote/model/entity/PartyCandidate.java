package com.gmr.vote.model.entity;

public class PartyCandidate  implements Comparable<PartyCandidate> {
    private Integer id;

    private String partyCandidateName;

    private Integer votesNumber;

    private Integer votesAgainstNumber;

    private Integer votesAbandonNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getVotesAgainstNumber() {
        return votesAgainstNumber;
    }

    public void setVotesAgainstNumber(Integer votesAgainstNumber) {
        this.votesAgainstNumber = votesAgainstNumber;
    }

    public Integer getVotesAbandonNumber() {
        return votesAbandonNumber;
    }

    public void setVotesAbandonNumber(Integer votesAbandonNumber) {
        this.votesAbandonNumber = votesAbandonNumber;
    }

    @Override
    public int compareTo(PartyCandidate o) {
        return o.getVotesNumber().compareTo(this.getVotesNumber());
    }
}