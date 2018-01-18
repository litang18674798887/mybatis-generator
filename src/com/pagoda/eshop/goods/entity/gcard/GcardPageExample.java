package com.pagoda.eshop.goods.entity.gcard;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GcardPageExample {
    /**
     * gcard_page
     */
    protected String orderByClause;

    /**
     * gcard_page
     */
    protected boolean distinct;

    /**
     * gcard_page
     */
    protected List<Criteria> oredCriteria;

    /**
     * GcardPageExample
     */
    public GcardPageExample() {
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
     * gcard_page 2018-01-17
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

        public Criteria andWxPageIdIsNull() {
            addCriterion("wxPageId is null");
            return (Criteria) this;
        }

        public Criteria andWxPageIdIsNotNull() {
            addCriterion("wxPageId is not null");
            return (Criteria) this;
        }

        public Criteria andWxPageIdEqualTo(String value) {
            addCriterion("wxPageId =", value, "wxPageId");
            return (Criteria) this;
        }

        public Criteria andWxPageIdNotEqualTo(String value) {
            addCriterion("wxPageId <>", value, "wxPageId");
            return (Criteria) this;
        }

        public Criteria andWxPageIdGreaterThan(String value) {
            addCriterion("wxPageId >", value, "wxPageId");
            return (Criteria) this;
        }

        public Criteria andWxPageIdGreaterThanOrEqualTo(String value) {
            addCriterion("wxPageId >=", value, "wxPageId");
            return (Criteria) this;
        }

        public Criteria andWxPageIdLessThan(String value) {
            addCriterion("wxPageId <", value, "wxPageId");
            return (Criteria) this;
        }

        public Criteria andWxPageIdLessThanOrEqualTo(String value) {
            addCriterion("wxPageId <=", value, "wxPageId");
            return (Criteria) this;
        }

        public Criteria andWxPageIdLike(String value) {
            addCriterion("wxPageId like", value, "wxPageId");
            return (Criteria) this;
        }

        public Criteria andWxPageIdNotLike(String value) {
            addCriterion("wxPageId not like", value, "wxPageId");
            return (Criteria) this;
        }

        public Criteria andWxPageIdIn(List<String> values) {
            addCriterion("wxPageId in", values, "wxPageId");
            return (Criteria) this;
        }

        public Criteria andWxPageIdNotIn(List<String> values) {
            addCriterion("wxPageId not in", values, "wxPageId");
            return (Criteria) this;
        }

        public Criteria andWxPageIdBetween(String value1, String value2) {
            addCriterion("wxPageId between", value1, value2, "wxPageId");
            return (Criteria) this;
        }

        public Criteria andWxPageIdNotBetween(String value1, String value2) {
            addCriterion("wxPageId not between", value1, value2, "wxPageId");
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

        public Criteria andPageTitleIsNull() {
            addCriterion("pageTitle is null");
            return (Criteria) this;
        }

        public Criteria andPageTitleIsNotNull() {
            addCriterion("pageTitle is not null");
            return (Criteria) this;
        }

        public Criteria andPageTitleEqualTo(String value) {
            addCriterion("pageTitle =", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotEqualTo(String value) {
            addCriterion("pageTitle <>", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleGreaterThan(String value) {
            addCriterion("pageTitle >", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("pageTitle >=", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleLessThan(String value) {
            addCriterion("pageTitle <", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleLessThanOrEqualTo(String value) {
            addCriterion("pageTitle <=", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleLike(String value) {
            addCriterion("pageTitle like", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotLike(String value) {
            addCriterion("pageTitle not like", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleIn(List<String> values) {
            addCriterion("pageTitle in", values, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotIn(List<String> values) {
            addCriterion("pageTitle not in", values, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleBetween(String value1, String value2) {
            addCriterion("pageTitle between", value1, value2, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotBetween(String value1, String value2) {
            addCriterion("pageTitle not between", value1, value2, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andBannerPicUrlIsNull() {
            addCriterion("bannerPicUrl is null");
            return (Criteria) this;
        }

        public Criteria andBannerPicUrlIsNotNull() {
            addCriterion("bannerPicUrl is not null");
            return (Criteria) this;
        }

        public Criteria andBannerPicUrlEqualTo(String value) {
            addCriterion("bannerPicUrl =", value, "bannerPicUrl");
            return (Criteria) this;
        }

        public Criteria andBannerPicUrlNotEqualTo(String value) {
            addCriterion("bannerPicUrl <>", value, "bannerPicUrl");
            return (Criteria) this;
        }

        public Criteria andBannerPicUrlGreaterThan(String value) {
            addCriterion("bannerPicUrl >", value, "bannerPicUrl");
            return (Criteria) this;
        }

        public Criteria andBannerPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("bannerPicUrl >=", value, "bannerPicUrl");
            return (Criteria) this;
        }

        public Criteria andBannerPicUrlLessThan(String value) {
            addCriterion("bannerPicUrl <", value, "bannerPicUrl");
            return (Criteria) this;
        }

        public Criteria andBannerPicUrlLessThanOrEqualTo(String value) {
            addCriterion("bannerPicUrl <=", value, "bannerPicUrl");
            return (Criteria) this;
        }

        public Criteria andBannerPicUrlLike(String value) {
            addCriterion("bannerPicUrl like", value, "bannerPicUrl");
            return (Criteria) this;
        }

        public Criteria andBannerPicUrlNotLike(String value) {
            addCriterion("bannerPicUrl not like", value, "bannerPicUrl");
            return (Criteria) this;
        }

        public Criteria andBannerPicUrlIn(List<String> values) {
            addCriterion("bannerPicUrl in", values, "bannerPicUrl");
            return (Criteria) this;
        }

        public Criteria andBannerPicUrlNotIn(List<String> values) {
            addCriterion("bannerPicUrl not in", values, "bannerPicUrl");
            return (Criteria) this;
        }

        public Criteria andBannerPicUrlBetween(String value1, String value2) {
            addCriterion("bannerPicUrl between", value1, value2, "bannerPicUrl");
            return (Criteria) this;
        }

        public Criteria andBannerPicUrlNotBetween(String value1, String value2) {
            addCriterion("bannerPicUrl not between", value1, value2, "bannerPicUrl");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNull() {
            addCriterion("servicePhone is null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNotNull() {
            addCriterion("servicePhone is not null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneEqualTo(String value) {
            addCriterion("servicePhone =", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotEqualTo(String value) {
            addCriterion("servicePhone <>", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThan(String value) {
            addCriterion("servicePhone >", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("servicePhone >=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThan(String value) {
            addCriterion("servicePhone <", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThanOrEqualTo(String value) {
            addCriterion("servicePhone <=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLike(String value) {
            addCriterion("servicePhone like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotLike(String value) {
            addCriterion("servicePhone not like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIn(List<String> values) {
            addCriterion("servicePhone in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotIn(List<String> values) {
            addCriterion("servicePhone not in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneBetween(String value1, String value2) {
            addCriterion("servicePhone between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotBetween(String value1, String value2) {
            addCriterion("servicePhone not between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andBizDescriptionIsNull() {
            addCriterion("bizDescription is null");
            return (Criteria) this;
        }

        public Criteria andBizDescriptionIsNotNull() {
            addCriterion("bizDescription is not null");
            return (Criteria) this;
        }

        public Criteria andBizDescriptionEqualTo(String value) {
            addCriterion("bizDescription =", value, "bizDescription");
            return (Criteria) this;
        }

        public Criteria andBizDescriptionNotEqualTo(String value) {
            addCriterion("bizDescription <>", value, "bizDescription");
            return (Criteria) this;
        }

        public Criteria andBizDescriptionGreaterThan(String value) {
            addCriterion("bizDescription >", value, "bizDescription");
            return (Criteria) this;
        }

        public Criteria andBizDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("bizDescription >=", value, "bizDescription");
            return (Criteria) this;
        }

        public Criteria andBizDescriptionLessThan(String value) {
            addCriterion("bizDescription <", value, "bizDescription");
            return (Criteria) this;
        }

        public Criteria andBizDescriptionLessThanOrEqualTo(String value) {
            addCriterion("bizDescription <=", value, "bizDescription");
            return (Criteria) this;
        }

        public Criteria andBizDescriptionLike(String value) {
            addCriterion("bizDescription like", value, "bizDescription");
            return (Criteria) this;
        }

        public Criteria andBizDescriptionNotLike(String value) {
            addCriterion("bizDescription not like", value, "bizDescription");
            return (Criteria) this;
        }

        public Criteria andBizDescriptionIn(List<String> values) {
            addCriterion("bizDescription in", values, "bizDescription");
            return (Criteria) this;
        }

        public Criteria andBizDescriptionNotIn(List<String> values) {
            addCriterion("bizDescription not in", values, "bizDescription");
            return (Criteria) this;
        }

        public Criteria andBizDescriptionBetween(String value1, String value2) {
            addCriterion("bizDescription between", value1, value2, "bizDescription");
            return (Criteria) this;
        }

        public Criteria andBizDescriptionNotBetween(String value1, String value2) {
            addCriterion("bizDescription not between", value1, value2, "bizDescription");
            return (Criteria) this;
        }

        public Criteria andSupportBuyForSelfIsNull() {
            addCriterion("supportBuyForSelf is null");
            return (Criteria) this;
        }

        public Criteria andSupportBuyForSelfIsNotNull() {
            addCriterion("supportBuyForSelf is not null");
            return (Criteria) this;
        }

        public Criteria andSupportBuyForSelfEqualTo(String value) {
            addCriterion("supportBuyForSelf =", value, "supportBuyForSelf");
            return (Criteria) this;
        }

        public Criteria andSupportBuyForSelfNotEqualTo(String value) {
            addCriterion("supportBuyForSelf <>", value, "supportBuyForSelf");
            return (Criteria) this;
        }

        public Criteria andSupportBuyForSelfGreaterThan(String value) {
            addCriterion("supportBuyForSelf >", value, "supportBuyForSelf");
            return (Criteria) this;
        }

        public Criteria andSupportBuyForSelfGreaterThanOrEqualTo(String value) {
            addCriterion("supportBuyForSelf >=", value, "supportBuyForSelf");
            return (Criteria) this;
        }

        public Criteria andSupportBuyForSelfLessThan(String value) {
            addCriterion("supportBuyForSelf <", value, "supportBuyForSelf");
            return (Criteria) this;
        }

        public Criteria andSupportBuyForSelfLessThanOrEqualTo(String value) {
            addCriterion("supportBuyForSelf <=", value, "supportBuyForSelf");
            return (Criteria) this;
        }

        public Criteria andSupportBuyForSelfLike(String value) {
            addCriterion("supportBuyForSelf like", value, "supportBuyForSelf");
            return (Criteria) this;
        }

        public Criteria andSupportBuyForSelfNotLike(String value) {
            addCriterion("supportBuyForSelf not like", value, "supportBuyForSelf");
            return (Criteria) this;
        }

        public Criteria andSupportBuyForSelfIn(List<String> values) {
            addCriterion("supportBuyForSelf in", values, "supportBuyForSelf");
            return (Criteria) this;
        }

        public Criteria andSupportBuyForSelfNotIn(List<String> values) {
            addCriterion("supportBuyForSelf not in", values, "supportBuyForSelf");
            return (Criteria) this;
        }

        public Criteria andSupportBuyForSelfBetween(String value1, String value2) {
            addCriterion("supportBuyForSelf between", value1, value2, "supportBuyForSelf");
            return (Criteria) this;
        }

        public Criteria andSupportBuyForSelfNotBetween(String value1, String value2) {
            addCriterion("supportBuyForSelf not between", value1, value2, "supportBuyForSelf");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptIsNull() {
            addCriterion("needReceipt is null");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptIsNotNull() {
            addCriterion("needReceipt is not null");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptEqualTo(String value) {
            addCriterion("needReceipt =", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptNotEqualTo(String value) {
            addCriterion("needReceipt <>", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptGreaterThan(String value) {
            addCriterion("needReceipt >", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptGreaterThanOrEqualTo(String value) {
            addCriterion("needReceipt >=", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptLessThan(String value) {
            addCriterion("needReceipt <", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptLessThanOrEqualTo(String value) {
            addCriterion("needReceipt <=", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptLike(String value) {
            addCriterion("needReceipt like", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptNotLike(String value) {
            addCriterion("needReceipt not like", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptIn(List<String> values) {
            addCriterion("needReceipt in", values, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptNotIn(List<String> values) {
            addCriterion("needReceipt not in", values, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptBetween(String value1, String value2) {
            addCriterion("needReceipt between", value1, value2, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptNotBetween(String value1, String value2) {
            addCriterion("needReceipt not between", value1, value2, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andCellTitle1IsNull() {
            addCriterion("cellTitle1 is null");
            return (Criteria) this;
        }

        public Criteria andCellTitle1IsNotNull() {
            addCriterion("cellTitle1 is not null");
            return (Criteria) this;
        }

        public Criteria andCellTitle1EqualTo(String value) {
            addCriterion("cellTitle1 =", value, "cellTitle1");
            return (Criteria) this;
        }

        public Criteria andCellTitle1NotEqualTo(String value) {
            addCriterion("cellTitle1 <>", value, "cellTitle1");
            return (Criteria) this;
        }

        public Criteria andCellTitle1GreaterThan(String value) {
            addCriterion("cellTitle1 >", value, "cellTitle1");
            return (Criteria) this;
        }

        public Criteria andCellTitle1GreaterThanOrEqualTo(String value) {
            addCriterion("cellTitle1 >=", value, "cellTitle1");
            return (Criteria) this;
        }

        public Criteria andCellTitle1LessThan(String value) {
            addCriterion("cellTitle1 <", value, "cellTitle1");
            return (Criteria) this;
        }

        public Criteria andCellTitle1LessThanOrEqualTo(String value) {
            addCriterion("cellTitle1 <=", value, "cellTitle1");
            return (Criteria) this;
        }

        public Criteria andCellTitle1Like(String value) {
            addCriterion("cellTitle1 like", value, "cellTitle1");
            return (Criteria) this;
        }

        public Criteria andCellTitle1NotLike(String value) {
            addCriterion("cellTitle1 not like", value, "cellTitle1");
            return (Criteria) this;
        }

        public Criteria andCellTitle1In(List<String> values) {
            addCriterion("cellTitle1 in", values, "cellTitle1");
            return (Criteria) this;
        }

        public Criteria andCellTitle1NotIn(List<String> values) {
            addCriterion("cellTitle1 not in", values, "cellTitle1");
            return (Criteria) this;
        }

        public Criteria andCellTitle1Between(String value1, String value2) {
            addCriterion("cellTitle1 between", value1, value2, "cellTitle1");
            return (Criteria) this;
        }

        public Criteria andCellTitle1NotBetween(String value1, String value2) {
            addCriterion("cellTitle1 not between", value1, value2, "cellTitle1");
            return (Criteria) this;
        }

        public Criteria andCellUrl1IsNull() {
            addCriterion("cellUrl1 is null");
            return (Criteria) this;
        }

        public Criteria andCellUrl1IsNotNull() {
            addCriterion("cellUrl1 is not null");
            return (Criteria) this;
        }

        public Criteria andCellUrl1EqualTo(String value) {
            addCriterion("cellUrl1 =", value, "cellUrl1");
            return (Criteria) this;
        }

        public Criteria andCellUrl1NotEqualTo(String value) {
            addCriterion("cellUrl1 <>", value, "cellUrl1");
            return (Criteria) this;
        }

        public Criteria andCellUrl1GreaterThan(String value) {
            addCriterion("cellUrl1 >", value, "cellUrl1");
            return (Criteria) this;
        }

        public Criteria andCellUrl1GreaterThanOrEqualTo(String value) {
            addCriterion("cellUrl1 >=", value, "cellUrl1");
            return (Criteria) this;
        }

        public Criteria andCellUrl1LessThan(String value) {
            addCriterion("cellUrl1 <", value, "cellUrl1");
            return (Criteria) this;
        }

        public Criteria andCellUrl1LessThanOrEqualTo(String value) {
            addCriterion("cellUrl1 <=", value, "cellUrl1");
            return (Criteria) this;
        }

        public Criteria andCellUrl1Like(String value) {
            addCriterion("cellUrl1 like", value, "cellUrl1");
            return (Criteria) this;
        }

        public Criteria andCellUrl1NotLike(String value) {
            addCriterion("cellUrl1 not like", value, "cellUrl1");
            return (Criteria) this;
        }

        public Criteria andCellUrl1In(List<String> values) {
            addCriterion("cellUrl1 in", values, "cellUrl1");
            return (Criteria) this;
        }

        public Criteria andCellUrl1NotIn(List<String> values) {
            addCriterion("cellUrl1 not in", values, "cellUrl1");
            return (Criteria) this;
        }

        public Criteria andCellUrl1Between(String value1, String value2) {
            addCriterion("cellUrl1 between", value1, value2, "cellUrl1");
            return (Criteria) this;
        }

        public Criteria andCellUrl1NotBetween(String value1, String value2) {
            addCriterion("cellUrl1 not between", value1, value2, "cellUrl1");
            return (Criteria) this;
        }

        public Criteria andCellTitle2IsNull() {
            addCriterion("cellTitle2 is null");
            return (Criteria) this;
        }

        public Criteria andCellTitle2IsNotNull() {
            addCriterion("cellTitle2 is not null");
            return (Criteria) this;
        }

        public Criteria andCellTitle2EqualTo(String value) {
            addCriterion("cellTitle2 =", value, "cellTitle2");
            return (Criteria) this;
        }

        public Criteria andCellTitle2NotEqualTo(String value) {
            addCriterion("cellTitle2 <>", value, "cellTitle2");
            return (Criteria) this;
        }

        public Criteria andCellTitle2GreaterThan(String value) {
            addCriterion("cellTitle2 >", value, "cellTitle2");
            return (Criteria) this;
        }

        public Criteria andCellTitle2GreaterThanOrEqualTo(String value) {
            addCriterion("cellTitle2 >=", value, "cellTitle2");
            return (Criteria) this;
        }

        public Criteria andCellTitle2LessThan(String value) {
            addCriterion("cellTitle2 <", value, "cellTitle2");
            return (Criteria) this;
        }

        public Criteria andCellTitle2LessThanOrEqualTo(String value) {
            addCriterion("cellTitle2 <=", value, "cellTitle2");
            return (Criteria) this;
        }

        public Criteria andCellTitle2Like(String value) {
            addCriterion("cellTitle2 like", value, "cellTitle2");
            return (Criteria) this;
        }

        public Criteria andCellTitle2NotLike(String value) {
            addCriterion("cellTitle2 not like", value, "cellTitle2");
            return (Criteria) this;
        }

        public Criteria andCellTitle2In(List<String> values) {
            addCriterion("cellTitle2 in", values, "cellTitle2");
            return (Criteria) this;
        }

        public Criteria andCellTitle2NotIn(List<String> values) {
            addCriterion("cellTitle2 not in", values, "cellTitle2");
            return (Criteria) this;
        }

        public Criteria andCellTitle2Between(String value1, String value2) {
            addCriterion("cellTitle2 between", value1, value2, "cellTitle2");
            return (Criteria) this;
        }

        public Criteria andCellTitle2NotBetween(String value1, String value2) {
            addCriterion("cellTitle2 not between", value1, value2, "cellTitle2");
            return (Criteria) this;
        }

        public Criteria andCellUrl2IsNull() {
            addCriterion("cellUrl2 is null");
            return (Criteria) this;
        }

        public Criteria andCellUrl2IsNotNull() {
            addCriterion("cellUrl2 is not null");
            return (Criteria) this;
        }

        public Criteria andCellUrl2EqualTo(String value) {
            addCriterion("cellUrl2 =", value, "cellUrl2");
            return (Criteria) this;
        }

        public Criteria andCellUrl2NotEqualTo(String value) {
            addCriterion("cellUrl2 <>", value, "cellUrl2");
            return (Criteria) this;
        }

        public Criteria andCellUrl2GreaterThan(String value) {
            addCriterion("cellUrl2 >", value, "cellUrl2");
            return (Criteria) this;
        }

        public Criteria andCellUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("cellUrl2 >=", value, "cellUrl2");
            return (Criteria) this;
        }

        public Criteria andCellUrl2LessThan(String value) {
            addCriterion("cellUrl2 <", value, "cellUrl2");
            return (Criteria) this;
        }

        public Criteria andCellUrl2LessThanOrEqualTo(String value) {
            addCriterion("cellUrl2 <=", value, "cellUrl2");
            return (Criteria) this;
        }

        public Criteria andCellUrl2Like(String value) {
            addCriterion("cellUrl2 like", value, "cellUrl2");
            return (Criteria) this;
        }

        public Criteria andCellUrl2NotLike(String value) {
            addCriterion("cellUrl2 not like", value, "cellUrl2");
            return (Criteria) this;
        }

        public Criteria andCellUrl2In(List<String> values) {
            addCriterion("cellUrl2 in", values, "cellUrl2");
            return (Criteria) this;
        }

        public Criteria andCellUrl2NotIn(List<String> values) {
            addCriterion("cellUrl2 not in", values, "cellUrl2");
            return (Criteria) this;
        }

        public Criteria andCellUrl2Between(String value1, String value2) {
            addCriterion("cellUrl2 between", value1, value2, "cellUrl2");
            return (Criteria) this;
        }

        public Criteria andCellUrl2NotBetween(String value1, String value2) {
            addCriterion("cellUrl2 not between", value1, value2, "cellUrl2");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNull() {
            addCriterion("syncStatus is null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNotNull() {
            addCriterion("syncStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusEqualTo(String value) {
            addCriterion("syncStatus =", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotEqualTo(String value) {
            addCriterion("syncStatus <>", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThan(String value) {
            addCriterion("syncStatus >", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThanOrEqualTo(String value) {
            addCriterion("syncStatus >=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThan(String value) {
            addCriterion("syncStatus <", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThanOrEqualTo(String value) {
            addCriterion("syncStatus <=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLike(String value) {
            addCriterion("syncStatus like", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotLike(String value) {
            addCriterion("syncStatus not like", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIn(List<String> values) {
            addCriterion("syncStatus in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotIn(List<String> values) {
            addCriterion("syncStatus not in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusBetween(String value1, String value2) {
            addCriterion("syncStatus between", value1, value2, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotBetween(String value1, String value2) {
            addCriterion("syncStatus not between", value1, value2, "syncStatus");
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
     * gcard_page
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * gcard_page 2018-01-17
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