package com.gmr.vote.model.entity;

import java.util.ArrayList;
import java.util.List;

public class PartyCandidateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartyCandidateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPartyCandidateNameIsNull() {
            addCriterion("party_candidate_name is null");
            return (Criteria) this;
        }

        public Criteria andPartyCandidateNameIsNotNull() {
            addCriterion("party_candidate_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartyCandidateNameEqualTo(String value) {
            addCriterion("party_candidate_name =", value, "partyCandidateName");
            return (Criteria) this;
        }

        public Criteria andPartyCandidateNameNotEqualTo(String value) {
            addCriterion("party_candidate_name <>", value, "partyCandidateName");
            return (Criteria) this;
        }

        public Criteria andPartyCandidateNameGreaterThan(String value) {
            addCriterion("party_candidate_name >", value, "partyCandidateName");
            return (Criteria) this;
        }

        public Criteria andPartyCandidateNameGreaterThanOrEqualTo(String value) {
            addCriterion("party_candidate_name >=", value, "partyCandidateName");
            return (Criteria) this;
        }

        public Criteria andPartyCandidateNameLessThan(String value) {
            addCriterion("party_candidate_name <", value, "partyCandidateName");
            return (Criteria) this;
        }

        public Criteria andPartyCandidateNameLessThanOrEqualTo(String value) {
            addCriterion("party_candidate_name <=", value, "partyCandidateName");
            return (Criteria) this;
        }

        public Criteria andPartyCandidateNameLike(String value) {
            addCriterion("party_candidate_name like", value, "partyCandidateName");
            return (Criteria) this;
        }

        public Criteria andPartyCandidateNameNotLike(String value) {
            addCriterion("party_candidate_name not like", value, "partyCandidateName");
            return (Criteria) this;
        }

        public Criteria andPartyCandidateNameIn(List<String> values) {
            addCriterion("party_candidate_name in", values, "partyCandidateName");
            return (Criteria) this;
        }

        public Criteria andPartyCandidateNameNotIn(List<String> values) {
            addCriterion("party_candidate_name not in", values, "partyCandidateName");
            return (Criteria) this;
        }

        public Criteria andPartyCandidateNameBetween(String value1, String value2) {
            addCriterion("party_candidate_name between", value1, value2, "partyCandidateName");
            return (Criteria) this;
        }

        public Criteria andPartyCandidateNameNotBetween(String value1, String value2) {
            addCriterion("party_candidate_name not between", value1, value2, "partyCandidateName");
            return (Criteria) this;
        }

        public Criteria andVotesNumberIsNull() {
            addCriterion("votes_number is null");
            return (Criteria) this;
        }

        public Criteria andVotesNumberIsNotNull() {
            addCriterion("votes_number is not null");
            return (Criteria) this;
        }

        public Criteria andVotesNumberEqualTo(Integer value) {
            addCriterion("votes_number =", value, "votesNumber");
            return (Criteria) this;
        }

        public Criteria andVotesNumberNotEqualTo(Integer value) {
            addCriterion("votes_number <>", value, "votesNumber");
            return (Criteria) this;
        }

        public Criteria andVotesNumberGreaterThan(Integer value) {
            addCriterion("votes_number >", value, "votesNumber");
            return (Criteria) this;
        }

        public Criteria andVotesNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("votes_number >=", value, "votesNumber");
            return (Criteria) this;
        }

        public Criteria andVotesNumberLessThan(Integer value) {
            addCriterion("votes_number <", value, "votesNumber");
            return (Criteria) this;
        }

        public Criteria andVotesNumberLessThanOrEqualTo(Integer value) {
            addCriterion("votes_number <=", value, "votesNumber");
            return (Criteria) this;
        }

        public Criteria andVotesNumberIn(List<Integer> values) {
            addCriterion("votes_number in", values, "votesNumber");
            return (Criteria) this;
        }

        public Criteria andVotesNumberNotIn(List<Integer> values) {
            addCriterion("votes_number not in", values, "votesNumber");
            return (Criteria) this;
        }

        public Criteria andVotesNumberBetween(Integer value1, Integer value2) {
            addCriterion("votes_number between", value1, value2, "votesNumber");
            return (Criteria) this;
        }

        public Criteria andVotesNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("votes_number not between", value1, value2, "votesNumber");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}