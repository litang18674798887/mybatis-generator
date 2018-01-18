package com.pagoda.eshop.goods.entity.gcard;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GcardExample {
    /**
     * gcard
     */
    protected String orderByClause;

    /**
     * gcard
     */
    protected boolean distinct;

    /**
     * gcard
     */
    protected List<Criteria> oredCriteria;

    /**
     * GcardExample
     */
    public GcardExample() {
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
     * gcard 2018-01-17
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

        public Criteria andWxCardIdIsNull() {
            addCriterion("wxCardId is null");
            return (Criteria) this;
        }

        public Criteria andWxCardIdIsNotNull() {
            addCriterion("wxCardId is not null");
            return (Criteria) this;
        }

        public Criteria andWxCardIdEqualTo(String value) {
            addCriterion("wxCardId =", value, "wxCardId");
            return (Criteria) this;
        }

        public Criteria andWxCardIdNotEqualTo(String value) {
            addCriterion("wxCardId <>", value, "wxCardId");
            return (Criteria) this;
        }

        public Criteria andWxCardIdGreaterThan(String value) {
            addCriterion("wxCardId >", value, "wxCardId");
            return (Criteria) this;
        }

        public Criteria andWxCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("wxCardId >=", value, "wxCardId");
            return (Criteria) this;
        }

        public Criteria andWxCardIdLessThan(String value) {
            addCriterion("wxCardId <", value, "wxCardId");
            return (Criteria) this;
        }

        public Criteria andWxCardIdLessThanOrEqualTo(String value) {
            addCriterion("wxCardId <=", value, "wxCardId");
            return (Criteria) this;
        }

        public Criteria andWxCardIdLike(String value) {
            addCriterion("wxCardId like", value, "wxCardId");
            return (Criteria) this;
        }

        public Criteria andWxCardIdNotLike(String value) {
            addCriterion("wxCardId not like", value, "wxCardId");
            return (Criteria) this;
        }

        public Criteria andWxCardIdIn(List<String> values) {
            addCriterion("wxCardId in", values, "wxCardId");
            return (Criteria) this;
        }

        public Criteria andWxCardIdNotIn(List<String> values) {
            addCriterion("wxCardId not in", values, "wxCardId");
            return (Criteria) this;
        }

        public Criteria andWxCardIdBetween(String value1, String value2) {
            addCriterion("wxCardId between", value1, value2, "wxCardId");
            return (Criteria) this;
        }

        public Criteria andWxCardIdNotBetween(String value1, String value2) {
            addCriterion("wxCardId not between", value1, value2, "wxCardId");
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

        public Criteria andPicUrlIsNull() {
            addCriterion("picUrl is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("picUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("picUrl =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("picUrl <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("picUrl >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("picUrl >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("picUrl <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("picUrl <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("picUrl like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("picUrl not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("picUrl in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("picUrl not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("picUrl between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("picUrl not between", value1, value2, "picUrl");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNull() {
            addCriterion("notice is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNotNull() {
            addCriterion("notice is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeEqualTo(String value) {
            addCriterion("notice =", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotEqualTo(String value) {
            addCriterion("notice <>", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThan(String value) {
            addCriterion("notice >", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("notice >=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThan(String value) {
            addCriterion("notice <", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThanOrEqualTo(String value) {
            addCriterion("notice <=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLike(String value) {
            addCriterion("notice like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotLike(String value) {
            addCriterion("notice not like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeIn(List<String> values) {
            addCriterion("notice in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotIn(List<String> values) {
            addCriterion("notice not in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeBetween(String value1, String value2) {
            addCriterion("notice between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotBetween(String value1, String value2) {
            addCriterion("notice not between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
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

        public Criteria andCardCheckStatusIsNull() {
            addCriterion("cardCheckStatus is null");
            return (Criteria) this;
        }

        public Criteria andCardCheckStatusIsNotNull() {
            addCriterion("cardCheckStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCardCheckStatusEqualTo(String value) {
            addCriterion("cardCheckStatus =", value, "cardCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCardCheckStatusNotEqualTo(String value) {
            addCriterion("cardCheckStatus <>", value, "cardCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCardCheckStatusGreaterThan(String value) {
            addCriterion("cardCheckStatus >", value, "cardCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCardCheckStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cardCheckStatus >=", value, "cardCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCardCheckStatusLessThan(String value) {
            addCriterion("cardCheckStatus <", value, "cardCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCardCheckStatusLessThanOrEqualTo(String value) {
            addCriterion("cardCheckStatus <=", value, "cardCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCardCheckStatusLike(String value) {
            addCriterion("cardCheckStatus like", value, "cardCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCardCheckStatusNotLike(String value) {
            addCriterion("cardCheckStatus not like", value, "cardCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCardCheckStatusIn(List<String> values) {
            addCriterion("cardCheckStatus in", values, "cardCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCardCheckStatusNotIn(List<String> values) {
            addCriterion("cardCheckStatus not in", values, "cardCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCardCheckStatusBetween(String value1, String value2) {
            addCriterion("cardCheckStatus between", value1, value2, "cardCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCardCheckStatusNotBetween(String value1, String value2) {
            addCriterion("cardCheckStatus not between", value1, value2, "cardCheckStatus");
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
     * gcard
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * gcard 2018-01-17
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