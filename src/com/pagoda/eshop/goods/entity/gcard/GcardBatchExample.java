package com.pagoda.eshop.goods.entity.gcard;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GcardBatchExample {
    /**
     * gcard_batch
     */
    protected String orderByClause;

    /**
     * gcard_batch
     */
    protected boolean distinct;

    /**
     * gcard_batch
     */
    protected List<Criteria> oredCriteria;

    /**
     * GcardBatchExample
     */
    public GcardBatchExample() {
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
     * gcard_batch 2018-01-17
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

        public Criteria andBatchIdIsNull() {
            addCriterion("batchId is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batchId is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(String value) {
            addCriterion("batchId =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(String value) {
            addCriterion("batchId <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(String value) {
            addCriterion("batchId >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("batchId >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(String value) {
            addCriterion("batchId <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(String value) {
            addCriterion("batchId <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLike(String value) {
            addCriterion("batchId like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotLike(String value) {
            addCriterion("batchId not like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<String> values) {
            addCriterion("batchId in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<String> values) {
            addCriterion("batchId not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(String value1, String value2) {
            addCriterion("batchId between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(String value1, String value2) {
            addCriterion("batchId not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("cardType is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("cardType is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("cardType =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("cardType <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("cardType >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cardType >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("cardType <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("cardType <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("cardType like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("cardType not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("cardType in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("cardType not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("cardType between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("cardType not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andInitBalanceIsNull() {
            addCriterion("initBalance is null");
            return (Criteria) this;
        }

        public Criteria andInitBalanceIsNotNull() {
            addCriterion("initBalance is not null");
            return (Criteria) this;
        }

        public Criteria andInitBalanceEqualTo(Integer value) {
            addCriterion("initBalance =", value, "initBalance");
            return (Criteria) this;
        }

        public Criteria andInitBalanceNotEqualTo(Integer value) {
            addCriterion("initBalance <>", value, "initBalance");
            return (Criteria) this;
        }

        public Criteria andInitBalanceGreaterThan(Integer value) {
            addCriterion("initBalance >", value, "initBalance");
            return (Criteria) this;
        }

        public Criteria andInitBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("initBalance >=", value, "initBalance");
            return (Criteria) this;
        }

        public Criteria andInitBalanceLessThan(Integer value) {
            addCriterion("initBalance <", value, "initBalance");
            return (Criteria) this;
        }

        public Criteria andInitBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("initBalance <=", value, "initBalance");
            return (Criteria) this;
        }

        public Criteria andInitBalanceIn(List<Integer> values) {
            addCriterion("initBalance in", values, "initBalance");
            return (Criteria) this;
        }

        public Criteria andInitBalanceNotIn(List<Integer> values) {
            addCriterion("initBalance not in", values, "initBalance");
            return (Criteria) this;
        }

        public Criteria andInitBalanceBetween(Integer value1, Integer value2) {
            addCriterion("initBalance between", value1, value2, "initBalance");
            return (Criteria) this;
        }

        public Criteria andInitBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("initBalance not between", value1, value2, "initBalance");
            return (Criteria) this;
        }

        public Criteria andInitQuantityIsNull() {
            addCriterion("initQuantity is null");
            return (Criteria) this;
        }

        public Criteria andInitQuantityIsNotNull() {
            addCriterion("initQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andInitQuantityEqualTo(Integer value) {
            addCriterion("initQuantity =", value, "initQuantity");
            return (Criteria) this;
        }

        public Criteria andInitQuantityNotEqualTo(Integer value) {
            addCriterion("initQuantity <>", value, "initQuantity");
            return (Criteria) this;
        }

        public Criteria andInitQuantityGreaterThan(Integer value) {
            addCriterion("initQuantity >", value, "initQuantity");
            return (Criteria) this;
        }

        public Criteria andInitQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("initQuantity >=", value, "initQuantity");
            return (Criteria) this;
        }

        public Criteria andInitQuantityLessThan(Integer value) {
            addCriterion("initQuantity <", value, "initQuantity");
            return (Criteria) this;
        }

        public Criteria andInitQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("initQuantity <=", value, "initQuantity");
            return (Criteria) this;
        }

        public Criteria andInitQuantityIn(List<Integer> values) {
            addCriterion("initQuantity in", values, "initQuantity");
            return (Criteria) this;
        }

        public Criteria andInitQuantityNotIn(List<Integer> values) {
            addCriterion("initQuantity not in", values, "initQuantity");
            return (Criteria) this;
        }

        public Criteria andInitQuantityBetween(Integer value1, Integer value2) {
            addCriterion("initQuantity between", value1, value2, "initQuantity");
            return (Criteria) this;
        }

        public Criteria andInitQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("initQuantity not between", value1, value2, "initQuantity");
            return (Criteria) this;
        }

        public Criteria andHasUsedIsNull() {
            addCriterion("hasUsed is null");
            return (Criteria) this;
        }

        public Criteria andHasUsedIsNotNull() {
            addCriterion("hasUsed is not null");
            return (Criteria) this;
        }

        public Criteria andHasUsedEqualTo(Integer value) {
            addCriterion("hasUsed =", value, "hasUsed");
            return (Criteria) this;
        }

        public Criteria andHasUsedNotEqualTo(Integer value) {
            addCriterion("hasUsed <>", value, "hasUsed");
            return (Criteria) this;
        }

        public Criteria andHasUsedGreaterThan(Integer value) {
            addCriterion("hasUsed >", value, "hasUsed");
            return (Criteria) this;
        }

        public Criteria andHasUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("hasUsed >=", value, "hasUsed");
            return (Criteria) this;
        }

        public Criteria andHasUsedLessThan(Integer value) {
            addCriterion("hasUsed <", value, "hasUsed");
            return (Criteria) this;
        }

        public Criteria andHasUsedLessThanOrEqualTo(Integer value) {
            addCriterion("hasUsed <=", value, "hasUsed");
            return (Criteria) this;
        }

        public Criteria andHasUsedIn(List<Integer> values) {
            addCriterion("hasUsed in", values, "hasUsed");
            return (Criteria) this;
        }

        public Criteria andHasUsedNotIn(List<Integer> values) {
            addCriterion("hasUsed not in", values, "hasUsed");
            return (Criteria) this;
        }

        public Criteria andHasUsedBetween(Integer value1, Integer value2) {
            addCriterion("hasUsed between", value1, value2, "hasUsed");
            return (Criteria) this;
        }

        public Criteria andHasUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("hasUsed not between", value1, value2, "hasUsed");
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
     * gcard_batch
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * gcard_batch 2018-01-17
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