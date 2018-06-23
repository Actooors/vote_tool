package com.gmr.vote.model.entity;

import java.util.ArrayList;
import java.util.List;

public class GroupCandidateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupCandidateExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGroupCandidateNameIsNull() {
            addCriterion("group_candidate_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupCandidateNameIsNotNull() {
            addCriterion("group_candidate_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCandidateNameEqualTo(String value) {
            addCriterion("group_candidate_name =", value, "groupCandidateName");
            return (Criteria) this;
        }

        public Criteria andGroupCandidateNameNotEqualTo(String value) {
            addCriterion("group_candidate_name <>", value, "groupCandidateName");
            return (Criteria) this;
        }

        public Criteria andGroupCandidateNameGreaterThan(String value) {
            addCriterion("group_candidate_name >", value, "groupCandidateName");
            return (Criteria) this;
        }

        public Criteria andGroupCandidateNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_candidate_name >=", value, "groupCandidateName");
            return (Criteria) this;
        }

        public Criteria andGroupCandidateNameLessThan(String value) {
            addCriterion("group_candidate_name <", value, "groupCandidateName");
            return (Criteria) this;
        }

        public Criteria andGroupCandidateNameLessThanOrEqualTo(String value) {
            addCriterion("group_candidate_name <=", value, "groupCandidateName");
            return (Criteria) this;
        }

        public Criteria andGroupCandidateNameLike(String value) {
            addCriterion("group_candidate_name like", value, "groupCandidateName");
            return (Criteria) this;
        }

        public Criteria andGroupCandidateNameNotLike(String value) {
            addCriterion("group_candidate_name not like", value, "groupCandidateName");
            return (Criteria) this;
        }

        public Criteria andGroupCandidateNameIn(List<String> values) {
            addCriterion("group_candidate_name in", values, "groupCandidateName");
            return (Criteria) this;
        }

        public Criteria andGroupCandidateNameNotIn(List<String> values) {
            addCriterion("group_candidate_name not in", values, "groupCandidateName");
            return (Criteria) this;
        }

        public Criteria andGroupCandidateNameBetween(String value1, String value2) {
            addCriterion("group_candidate_name between", value1, value2, "groupCandidateName");
            return (Criteria) this;
        }

        public Criteria andGroupCandidateNameNotBetween(String value1, String value2) {
            addCriterion("group_candidate_name not between", value1, value2, "groupCandidateName");
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