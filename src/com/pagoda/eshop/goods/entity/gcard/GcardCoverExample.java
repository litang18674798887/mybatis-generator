package com.pagoda.eshop.goods.entity.gcard;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GcardCoverExample {
    /**
     * gcard_cover
     */
    protected String orderByClause;

    /**
     * gcard_cover
     */
    protected boolean distinct;

    /**
     * gcard_cover
     */
    protected List<Criteria> oredCriteria;

    /**
     * GcardCoverExample
     */
    public GcardCoverExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * setOrderByClause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * getOrderByClause
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * setDistinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * isDistinct
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * getOredCriteria
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * or
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * or
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * createCriteria
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * createCriteriaInternal
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * clear
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * gcard_cover 2018-01-17
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBackgroundPicUrlIsNull() {
            addCriterion("backgroundPicUrl is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundPicUrlIsNotNull() {
            addCriterion("backgroundPicUrl is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundPicUrlEqualTo(String value) {
            addCriterion("backgroundPicUrl =", value, "backgroundPicUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundPicUrlNotEqualTo(String value) {
            addCriterion("backgroundPicUrl <>", value, "backgroundPicUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundPicUrlGreaterThan(String value) {
            addCriterion("backgroundPicUrl >", value, "backgroundPicUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("backgroundPicUrl >=", value, "backgroundPicUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundPicUrlLessThan(String value) {
            addCriterion("backgroundPicUrl <", value, "backgroundPicUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundPicUrlLessThanOrEqualTo(String value) {
            addCriterion("backgroundPicUrl <=", value, "backgroundPicUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundPicUrlLike(String value) {
            addCriterion("backgroundPicUrl like", value, "backgroundPicUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundPicUrlNotLike(String value) {
            addCriterion("backgroundPicUrl not like", value, "backgroundPicUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundPicUrlIn(List<String> values) {
            addCriterion("backgroundPicUrl in", values, "backgroundPicUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundPicUrlNotIn(List<String> values) {
            addCriterion("backgroundPicUrl not in", values, "backgroundPicUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundPicUrlBetween(String value1, String value2) {
            addCriterion("backgroundPicUrl between", value1, value2, "backgroundPicUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundPicUrlNotBetween(String value1, String value2) {
            addCriterion("backgroundPicUrl not between", value1, value2, "backgroundPicUrl");
            return (Criteria) this;
        }

        public Criteria andDefaultGiftingMsgIsNull() {
            addCriterion("defaultGiftingMsg is null");
            return (Criteria) this;
        }

        public Criteria andDefaultGiftingMsgIsNotNull() {
            addCriterion("defaultGiftingMsg is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultGiftingMsgEqualTo(String value) {
            addCriterion("defaultGiftingMsg =", value, "defaultGiftingMsg");
            return (Criteria) this;
        }

        public Criteria andDefaultGiftingMsgNotEqualTo(String value) {
            addCriterion("defaultGiftingMsg <>", value, "defaultGiftingMsg");
            return (Criteria) this;
        }

        public Criteria andDefaultGiftingMsgGreaterThan(String value) {
            addCriterion("defaultGiftingMsg >", value, "defaultGiftingMsg");
            return (Criteria) this;
        }

        public Criteria andDefaultGiftingMsgGreaterThanOrEqualTo(String value) {
            addCriterion("defaultGiftingMsg >=", value, "defaultGiftingMsg");
            return (Criteria) this;
        }

        public Criteria andDefaultGiftingMsgLessThan(String value) {
            addCriterion("defaultGiftingMsg <", value, "defaultGiftingMsg");
            return (Criteria) this;
        }

        public Criteria andDefaultGiftingMsgLessThanOrEqualTo(String value) {
            addCriterion("defaultGiftingMsg <=", value, "defaultGiftingMsg");
            return (Criteria) this;
        }

        public Criteria andDefaultGiftingMsgLike(String value) {
            addCriterion("defaultGiftingMsg like", value, "defaultGiftingMsg");
            return (Criteria) this;
        }

        public Criteria andDefaultGiftingMsgNotLike(String value) {
            addCriterion("defaultGiftingMsg not like", value, "defaultGiftingMsg");
            return (Criteria) this;
        }

        public Criteria andDefaultGiftingMsgIn(List<String> values) {
            addCriterion("defaultGiftingMsg in", values, "defaultGiftingMsg");
            return (Criteria) this;
        }

        public Criteria andDefaultGiftingMsgNotIn(List<String> values) {
            addCriterion("defaultGiftingMsg not in", values, "defaultGiftingMsg");
            return (Criteria) this;
        }

        public Criteria andDefaultGiftingMsgBetween(String value1, String value2) {
            addCriterion("defaultGiftingMsg between", value1, value2, "defaultGiftingMsg");
            return (Criteria) this;
        }

        public Criteria andDefaultGiftingMsgNotBetween(String value1, String value2) {
            addCriterion("defaultGiftingMsg not between", value1, value2, "defaultGiftingMsg");
            return (Criteria) this;
        }

        public Criteria andLifeStatusIsNull() {
            addCriterion("lifeStatus is null");
            return (Criteria) this;
        }

        public Criteria andLifeStatusIsNotNull() {
            addCriterion("lifeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andLifeStatusEqualTo(String value) {
            addCriterion("lifeStatus =", value, "lifeStatus");
            return (Criteria) this;
        }

        public Criteria andLifeStatusNotEqualTo(String value) {
            addCriterion("lifeStatus <>", value, "lifeStatus");
            return (Criteria) this;
        }

        public Criteria andLifeStatusGreaterThan(String value) {
            addCriterion("lifeStatus >", value, "lifeStatus");
            return (Criteria) this;
        }

        public Criteria andLifeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("lifeStatus >=", value, "lifeStatus");
            return (Criteria) this;
        }

        public Criteria andLifeStatusLessThan(String value) {
            addCriterion("lifeStatus <", value, "lifeStatus");
            return (Criteria) this;
        }

        public Criteria andLifeStatusLessThanOrEqualTo(String value) {
            addCriterion("lifeStatus <=", value, "lifeStatus");
            return (Criteria) this;
        }

        public Criteria andLifeStatusLike(String value) {
            addCriterion("lifeStatus like", value, "lifeStatus");
            return (Criteria) this;
        }

        public Criteria andLifeStatusNotLike(String value) {
            addCriterion("lifeStatus not like", value, "lifeStatus");
            return (Criteria) this;
        }

        public Criteria andLifeStatusIn(List<String> values) {
            addCriterion("lifeStatus in", values, "lifeStatus");
            return (Criteria) this;
        }

        public Criteria andLifeStatusNotIn(List<String> values) {
            addCriterion("lifeStatus not in", values, "lifeStatus");
            return (Criteria) this;
        }

        public Criteria andLifeStatusBetween(String value1, String value2) {
            addCriterion("lifeStatus between", value1, value2, "lifeStatus");
            return (Criteria) this;
        }

        public Criteria andLifeStatusNotBetween(String value1, String value2) {
            addCriterion("lifeStatus not between", value1, value2, "lifeStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("lastUpdate is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("lastUpdate is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterion("lastUpdate =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterion("lastUpdate <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterion("lastUpdate >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastUpdate >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterion("lastUpdate <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("lastUpdate <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterion("lastUpdate in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterion("lastUpdate not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterion("lastUpdate between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("lastUpdate not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }
    }

    /**
     * gcard_cover
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * gcard_cover 2018-01-17
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