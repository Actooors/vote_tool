package com.gmr.vote.model.entity;

public class Candidate implements Comparable<Candidate> {
    private String candidateName;

    private Integer votesNumber;

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName == null ? null : candidateName.trim();
    }

    public Integer getVotesNumber() {
        return votesNumber;
    }

    public void setVotesNumber(Integer votesNumber) {
        this.votesNumber = votesNumber;
    }

    @Override
    public int compareTo(Candidate candidate) {
        return candidate.getVotesNumber().compareTo(this.getVotesNumber());
    }
}