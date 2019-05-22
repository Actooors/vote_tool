package com.gmr.vote.model.entity;

import java.util.ArrayList;
import java.util.List;

public class VoteConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VoteConfigExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andConferenceNameIsNull() {
            addCriterion("conference_name is null");
            return (Criteria) this;
        }

        public Criteria andConferenceNameIsNotNull() {
            addCriterion("conference_name is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceNameEqualTo(String value) {
            addCriterion("conference_name =", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameNotEqualTo(String value) {
            addCriterion("conference_name <>", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameGreaterThan(String value) {
            addCriterion("conference_name >", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameGreaterThanOrEqualTo(String value) {
            addCriterion("conference_name >=", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameLessThan(String value) {
            addCriterion("conference_name <", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameLessThanOrEqualTo(String value) {
            addCriterion("conference_name <=", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameLike(String value) {
            addCriterion("conference_name like", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameNotLike(String value) {
            addCriterion("conference_name not like", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameIn(List<String> values) {
            addCriterion("conference_name in", values, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameNotIn(List<String> values) {
            addCriterion("conference_name not in", values, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameBetween(String value1, String value2) {
            addCriterion("conference_name between", value1, value2, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameNotBetween(String value1, String value2) {
            addCriterion("conference_name not between", value1, value2, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andVoteNameIsNull() {
            addCriterion("vote_name is null");
            return (Criteria) this;
        }

        public Criteria andVoteNameIsNotNull() {
            addCriterion("vote_name is not null");
            return (Criteria) this;
        }

        public Criteria andVoteNameEqualTo(String value) {
            addCriterion("vote_name =", value, "voteName");
            return (Criteria) this;
        }

        public Criteria andVoteNameNotEqualTo(String value) {
            addCriterion("vote_name <>", value, "voteName");
            return (Criteria) this;
        }

        public Criteria andVoteNameGreaterThan(String value) {
            addCriterion("vote_name >", value, "voteName");
            return (Criteria) this;
        }

        public Criteria andVoteNameGreaterThanOrEqualTo(String value) {
            addCriterion("vote_name >=", value, "voteName");
            return (Criteria) this;
        }

        public Criteria andVoteNameLessThan(String value) {
            addCriterion("vote_name <", value, "voteName");
            return (Criteria) this;
        }

        public Criteria andVoteNameLessThanOrEqualTo(String value) {
            addCriterion("vote_name <=", value, "voteName");
            return (Criteria) this;
        }

        public Criteria andVoteNameLike(String value) {
            addCriterion("vote_name like", value, "voteName");
            return (Criteria) this;
        }

        public Criteria andVoteNameNotLike(String value) {
            addCriterion("vote_name not like", value, "voteName");
            return (Criteria) this;
        }

        public Criteria andVoteNameIn(List<String> values) {
            addCriterion("vote_name in", values, "voteName");
            return (Criteria) this;
        }

        public Criteria andVoteNameNotIn(List<String> values) {
            addCriterion("vote_name not in", values, "voteName");
            return (Criteria) this;
        }

        public Criteria andVoteNameBetween(String value1, String value2) {
            addCriterion("vote_name between", value1, value2, "voteName");
            return (Criteria) this;
        }

        public Criteria andVoteNameNotBetween(String value1, String value2) {
            addCriterion("vote_name not between", value1, value2, "voteName");
            return (Criteria) this;
        }

        public Criteria andCandicatenumberIsNull() {
            addCriterion("candicatenumber is null");
            return (Criteria) this;
        }

        public Criteria andCandicatenumberIsNotNull() {
            addCriterion("candicatenumber is not null");
            return (Criteria) this;
        }

        public Criteria andCandicatenumberEqualTo(Integer value) {
            addCriterion("candicatenumber =", value, "candicatenumber");
            return (Criteria) this;
        }

        public Criteria andCandicatenumberNotEqualTo(Integer value) {
            addCriterion("candicatenumber <>", value, "candicatenumber");
            return (Criteria) this;
        }

        public Criteria andCandicatenumberGreaterThan(Integer value) {
            addCriterion("candicatenumber >", value, "candicatenumber");
            return (Criteria) this;
        }

        public Criteria andCandicatenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("candicatenumber >=", value, "candicatenumber");
            return (Criteria) this;
        }

        public Criteria andCandicatenumberLessThan(Integer value) {
            addCriterion("candicatenumber <", value, "candicatenumber");
            return (Criteria) this;
        }

        public Criteria andCandicatenumberLessThanOrEqualTo(Integer value) {
            addCriterion("candicatenumber <=", value, "candicatenumber");
            return (Criteria) this;
        }

        public Criteria andCandicatenumberIn(List<Integer> values) {
            addCriterion("candicatenumber in", values, "candicatenumber");
            return (Criteria) this;
        }

        public Criteria andCandicatenumberNotIn(List<Integer> values) {
            addCriterion("candicatenumber not in", values, "candicatenumber");
            return (Criteria) this;
        }

        public Criteria andCandicatenumberBetween(Integer value1, Integer value2) {
            addCriterion("candicatenumber between", value1, value2, "candicatenumber");
            return (Criteria) this;
        }

        public Criteria andCandicatenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("candicatenumber not between", value1, value2, "candicatenumber");
            return (Criteria) this;
        }

        public Criteria andElectnumberIsNull() {
            addCriterion("electnumber is null");
            return (Criteria) this;
        }

        public Criteria andElectnumberIsNotNull() {
            addCriterion("electnumber is not null");
            return (Criteria) this;
        }

        public Criteria andElectnumberEqualTo(Integer value) {
            addCriterion("electnumber =", value, "electnumber");
            return (Criteria) this;
        }

        public Criteria andElectnumberNotEqualTo(Integer value) {
            addCriterion("electnumber <>", value, "electnumber");
            return (Criteria) this;
        }

        public Criteria andElectnumberGreaterThan(Integer value) {
            addCriterion("electnumber >", value, "electnumber");
            return (Criteria) this;
        }

        public Criteria andElectnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("electnumber >=", value, "electnumber");
            return (Criteria) this;
        }

        public Criteria andElectnumberLessThan(Integer value) {
            addCriterion("electnumber <", value, "electnumber");
            return (Criteria) this;
        }

        public Criteria andElectnumberLessThanOrEqualTo(Integer value) {
            addCriterion("electnumber <=", value, "electnumber");
            return (Criteria) this;
        }

        public Criteria andElectnumberIn(List<Integer> values) {
            addCriterion("electnumber in", values, "electnumber");
            return (Criteria) this;
        }

        public Criteria andElectnumberNotIn(List<Integer> values) {
            addCriterion("electnumber not in", values, "electnumber");
            return (Criteria) this;
        }

        public Criteria andElectnumberBetween(Integer value1, Integer value2) {
            addCriterion("electnumber between", value1, value2, "electnumber");
            return (Criteria) this;
        }

        public Criteria andElectnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("electnumber not between", value1, value2, "electnumber");
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