package com.landasoft.xysh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TScreenHzExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
    public TScreenHzExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
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

        public Criteria andSIdIsNull() {
            addCriterion("S_ID is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("S_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(String value) {
            addCriterion("S_ID =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(String value) {
            addCriterion("S_ID <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(String value) {
            addCriterion("S_ID >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(String value) {
            addCriterion("S_ID >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(String value) {
            addCriterion("S_ID <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(String value) {
            addCriterion("S_ID <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLike(String value) {
            addCriterion("S_ID like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotLike(String value) {
            addCriterion("S_ID not like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<String> values) {
            addCriterion("S_ID in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<String> values) {
            addCriterion("S_ID not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(String value1, String value2) {
            addCriterion("S_ID between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(String value1, String value2) {
            addCriterion("S_ID not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("S_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("S_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("S_NAME =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("S_NAME <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("S_NAME >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("S_NAME >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("S_NAME <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("S_NAME <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("S_NAME like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("S_NAME not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("S_NAME in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("S_NAME not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("S_NAME between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("S_NAME not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSCreatedIsNull() {
            addCriterion("S_CREATED is null");
            return (Criteria) this;
        }

        public Criteria andSCreatedIsNotNull() {
            addCriterion("S_CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andSCreatedEqualTo(Date value) {
            addCriterion("S_CREATED =", value, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedNotEqualTo(Date value) {
            addCriterion("S_CREATED <>", value, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedGreaterThan(Date value) {
            addCriterion("S_CREATED >", value, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("S_CREATED >=", value, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedLessThan(Date value) {
            addCriterion("S_CREATED <", value, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedLessThanOrEqualTo(Date value) {
            addCriterion("S_CREATED <=", value, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedIn(List<Date> values) {
            addCriterion("S_CREATED in", values, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedNotIn(List<Date> values) {
            addCriterion("S_CREATED not in", values, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedBetween(Date value1, Date value2) {
            addCriterion("S_CREATED between", value1, value2, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedNotBetween(Date value1, Date value2) {
            addCriterion("S_CREATED not between", value1, value2, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedIsNull() {
            addCriterion("S_UPDATED is null");
            return (Criteria) this;
        }

        public Criteria andSUpdatedIsNotNull() {
            addCriterion("S_UPDATED is not null");
            return (Criteria) this;
        }

        public Criteria andSUpdatedEqualTo(Date value) {
            addCriterion("S_UPDATED =", value, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedNotEqualTo(Date value) {
            addCriterion("S_UPDATED <>", value, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedGreaterThan(Date value) {
            addCriterion("S_UPDATED >", value, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("S_UPDATED >=", value, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedLessThan(Date value) {
            addCriterion("S_UPDATED <", value, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("S_UPDATED <=", value, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedIn(List<Date> values) {
            addCriterion("S_UPDATED in", values, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedNotIn(List<Date> values) {
            addCriterion("S_UPDATED not in", values, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedBetween(Date value1, Date value2) {
            addCriterion("S_UPDATED between", value1, value2, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("S_UPDATED not between", value1, value2, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSFblHIsNull() {
            addCriterion("S_FBL_H is null");
            return (Criteria) this;
        }

        public Criteria andSFblHIsNotNull() {
            addCriterion("S_FBL_H is not null");
            return (Criteria) this;
        }

        public Criteria andSFblHEqualTo(String value) {
            addCriterion("S_FBL_H =", value, "sFblH");
            return (Criteria) this;
        }

        public Criteria andSFblHNotEqualTo(String value) {
            addCriterion("S_FBL_H <>", value, "sFblH");
            return (Criteria) this;
        }

        public Criteria andSFblHGreaterThan(String value) {
            addCriterion("S_FBL_H >", value, "sFblH");
            return (Criteria) this;
        }

        public Criteria andSFblHGreaterThanOrEqualTo(String value) {
            addCriterion("S_FBL_H >=", value, "sFblH");
            return (Criteria) this;
        }

        public Criteria andSFblHLessThan(String value) {
            addCriterion("S_FBL_H <", value, "sFblH");
            return (Criteria) this;
        }

        public Criteria andSFblHLessThanOrEqualTo(String value) {
            addCriterion("S_FBL_H <=", value, "sFblH");
            return (Criteria) this;
        }

        public Criteria andSFblHLike(String value) {
            addCriterion("S_FBL_H like", value, "sFblH");
            return (Criteria) this;
        }

        public Criteria andSFblHNotLike(String value) {
            addCriterion("S_FBL_H not like", value, "sFblH");
            return (Criteria) this;
        }

        public Criteria andSFblHIn(List<String> values) {
            addCriterion("S_FBL_H in", values, "sFblH");
            return (Criteria) this;
        }

        public Criteria andSFblHNotIn(List<String> values) {
            addCriterion("S_FBL_H not in", values, "sFblH");
            return (Criteria) this;
        }

        public Criteria andSFblHBetween(String value1, String value2) {
            addCriterion("S_FBL_H between", value1, value2, "sFblH");
            return (Criteria) this;
        }

        public Criteria andSFblHNotBetween(String value1, String value2) {
            addCriterion("S_FBL_H not between", value1, value2, "sFblH");
            return (Criteria) this;
        }

        public Criteria andSFblWIsNull() {
            addCriterion("S_FBL_W is null");
            return (Criteria) this;
        }

        public Criteria andSFblWIsNotNull() {
            addCriterion("S_FBL_W is not null");
            return (Criteria) this;
        }

        public Criteria andSFblWEqualTo(String value) {
            addCriterion("S_FBL_W =", value, "sFblW");
            return (Criteria) this;
        }

        public Criteria andSFblWNotEqualTo(String value) {
            addCriterion("S_FBL_W <>", value, "sFblW");
            return (Criteria) this;
        }

        public Criteria andSFblWGreaterThan(String value) {
            addCriterion("S_FBL_W >", value, "sFblW");
            return (Criteria) this;
        }

        public Criteria andSFblWGreaterThanOrEqualTo(String value) {
            addCriterion("S_FBL_W >=", value, "sFblW");
            return (Criteria) this;
        }

        public Criteria andSFblWLessThan(String value) {
            addCriterion("S_FBL_W <", value, "sFblW");
            return (Criteria) this;
        }

        public Criteria andSFblWLessThanOrEqualTo(String value) {
            addCriterion("S_FBL_W <=", value, "sFblW");
            return (Criteria) this;
        }

        public Criteria andSFblWLike(String value) {
            addCriterion("S_FBL_W like", value, "sFblW");
            return (Criteria) this;
        }

        public Criteria andSFblWNotLike(String value) {
            addCriterion("S_FBL_W not like", value, "sFblW");
            return (Criteria) this;
        }

        public Criteria andSFblWIn(List<String> values) {
            addCriterion("S_FBL_W in", values, "sFblW");
            return (Criteria) this;
        }

        public Criteria andSFblWNotIn(List<String> values) {
            addCriterion("S_FBL_W not in", values, "sFblW");
            return (Criteria) this;
        }

        public Criteria andSFblWBetween(String value1, String value2) {
            addCriterion("S_FBL_W between", value1, value2, "sFblW");
            return (Criteria) this;
        }

        public Criteria andSFblWNotBetween(String value1, String value2) {
            addCriterion("S_FBL_W not between", value1, value2, "sFblW");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_screen_hz
     *
     * @mbggenerated do_not_delete_during_merge Fri Apr 24 14:37:14 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_screen_hz
     *
     * @mbggenerated Fri Apr 24 14:37:14 CST 2020
     */
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