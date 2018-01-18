package com.pagoda.eshop.goods.entity.gcard;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GcardThemeCardRelExample {
    /**
     * gcard_theme_card_rel
     */
    protected String orderByClause;

    /**
     * gcard_theme_card_rel
     */
    protected boolean distinct;

    /**
     * gcard_theme_card_rel
     */
    protected List<Criteria> oredCriteria;

    /**
     * GcardThemeCardRelExample
     */
    public GcardThemeCardRelExample() {
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
     * gcard_theme_card_rel 2018-01-17
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

        public Criteria andThemeIdIsNull() {
            addCriterion("themeId is null");
            return (Criteria) this;
        }

        public Criteria andThemeIdIsNotNull() {
            addCriterion("themeId is not null");
            return (Criteria) this;
        }

        public Criteria andThemeIdEqualTo(Long value) {
            addCriterion("themeId =", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdNotEqualTo(Long value) {
            addCriterion("themeId <>", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdGreaterThan(Long value) {
            addCriterion("themeId >", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("themeId >=", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdLessThan(Long value) {
            addCriterion("themeId <", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdLessThanOrEqualTo(Long value) {
            addCriterion("themeId <=", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdIn(List<Long> values) {
            addCriterion("themeId in", values, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdNotIn(List<Long> values) {
            addCriterion("themeId not in", values, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdBetween(Long value1, Long value2) {
            addCriterion("themeId between", value1, value2, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdNotBetween(Long value1, Long value2) {
            addCriterion("themeId not between", value1, value2, "themeId");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("cardId is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("cardId is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Long value) {
            addCriterion("cardId =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Long value) {
            addCriterion("cardId <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Long value) {
            addCriterion("cardId >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cardId >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Long value) {
            addCriterion("cardId <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Long value) {
            addCriterion("cardId <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Long> values) {
            addCriterion("cardId in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Long> values) {
            addCriterion("cardId not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Long value1, Long value2) {
            addCriterion("cardId between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Long value1, Long value2) {
            addCriterion("cardId not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardNickNameIsNull() {
            addCriterion("cardNickName is null");
            return (Criteria) this;
        }

        public Criteria andCardNickNameIsNotNull() {
            addCriterion("cardNickName is not null");
            return (Criteria) this;
        }

        public Criteria andCardNickNameEqualTo(String value) {
            addCriterion("cardNickName =", value, "cardNickName");
            return (Criteria) this;
        }

        public Criteria andCardNickNameNotEqualTo(String value) {
            addCriterion("cardNickName <>", value, "cardNickName");
            return (Criteria) this;
        }

        public Criteria andCardNickNameGreaterThan(String value) {
            addCriterion("cardNickName >", value, "cardNickName");
            return (Criteria) this;
        }

        public Criteria andCardNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("cardNickName >=", value, "cardNickName");
            return (Criteria) this;
        }

        public Criteria andCardNickNameLessThan(String value) {
            addCriterion("cardNickName <", value, "cardNickName");
            return (Criteria) this;
        }

        public Criteria andCardNickNameLessThanOrEqualTo(String value) {
            addCriterion("cardNickName <=", value, "cardNickName");
            return (Criteria) this;
        }

        public Criteria andCardNickNameLike(String value) {
            addCriterion("cardNickName like", value, "cardNickName");
            return (Criteria) this;
        }

        public Criteria andCardNickNameNotLike(String value) {
            addCriterion("cardNickName not like", value, "cardNickName");
            return (Criteria) this;
        }

        public Criteria andCardNickNameIn(List<String> values) {
            addCriterion("cardNickName in", values, "cardNickName");
            return (Criteria) this;
        }

        public Criteria andCardNickNameNotIn(List<String> values) {
            addCriterion("cardNickName not in", values, "cardNickName");
            return (Criteria) this;
        }

        public Criteria andCardNickNameBetween(String value1, String value2) {
            addCriterion("cardNickName between", value1, value2, "cardNickName");
            return (Criteria) this;
        }

        public Criteria andCardNickNameNotBetween(String value1, String value2) {
            addCriterion("cardNickName not between", value1, value2, "cardNickName");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("sequence is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Integer value) {
            addCriterion("sequence =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Integer value) {
            addCriterion("sequence <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Integer value) {
            addCriterion("sequence >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sequence >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Integer value) {
            addCriterion("sequence <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("sequence <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Integer> values) {
            addCriterion("sequence in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Integer> values) {
            addCriterion("sequence not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Integer value1, Integer value2) {
            addCriterion("sequence between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("sequence not between", value1, value2, "sequence");
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
     * gcard_theme_card_rel
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * gcard_theme_card_rel 2018-01-17
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