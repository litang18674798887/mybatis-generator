package com.pagoda.eshop.goods.entity.gcard;

import java.util.Date;

public class Gcard {
    /**
     * id
     */
    private Long id;

    /**
     * 礼品卡类型 (GIFT_CARD礼品卡、VOUCHER兑换卡)
     */
    private String cardType;

    /**
     * 礼品卡卡券Id（创建礼品卡成功后腾讯返回）
     */
    private String wxCardId;

    /**
     * 礼品卡背景图片
     */
    private String backgroundPicUrl;

    /**
     * 缩略图，1000像素*600像素以下
     */
    private String picUrl;

    /**
     * 初始余额(面额)
     */
    private Integer initBalance;

    /**
     * 礼品卡价格（售价）
     */
    private Integer price;

    /**
     * 券名（卡名称）
     */
    private String title;

    /**
     * 券颜色
     */
    private String color;

    /**
     * 使用提醒
     */
    private String notice;

    /**
     * 使用说明
     */
    private String description;

    /**
     * 库存
     */
    private Integer quantity;

    /**
     * 初始库存
     */
    private Integer initQuantity;

    /**
     * 批次号
     */
    private String batchId;

    /**
     * 卡片审核状态：通过PASSED，未通过FAILED
     */
    private String cardCheckStatus;

    /**
     * 该记录的状态：正常N，已删除D
     */
    private String lifeStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后更新时间
     */
    private Date lastUpdate;

    /**
     * id
     * @return id id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 礼品卡类型 (GIFT_CARD礼品卡、VOUCHER兑换卡)
     * @return cardType 礼品卡类型 (GIFT_CARD礼品卡、VOUCHER兑换卡)
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * 礼品卡类型 (GIFT_CARD礼品卡、VOUCHER兑换卡)
     * @param cardType 礼品卡类型 (GIFT_CARD礼品卡、VOUCHER兑换卡)
     */
    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    /**
     * 礼品卡卡券Id（创建礼品卡成功后腾讯返回）
     * @return wxCardId 礼品卡卡券Id（创建礼品卡成功后腾讯返回）
     */
    public String getWxCardId() {
        return wxCardId;
    }

    /**
     * 礼品卡卡券Id（创建礼品卡成功后腾讯返回）
     * @param wxCardId 礼品卡卡券Id（创建礼品卡成功后腾讯返回）
     */
    public void setWxCardId(String wxCardId) {
        this.wxCardId = wxCardId == null ? null : wxCardId.trim();
    }

    /**
     * 礼品卡背景图片
     * @return backgroundPicUrl 礼品卡背景图片
     */
    public String getBackgroundPicUrl() {
        return backgroundPicUrl;
    }

    /**
     * 礼品卡背景图片
     * @param backgroundPicUrl 礼品卡背景图片
     */
    public void setBackgroundPicUrl(String backgroundPicUrl) {
        this.backgroundPicUrl = backgroundPicUrl == null ? null : backgroundPicUrl.trim();
    }

    /**
     * 缩略图，1000像素*600像素以下
     * @return picUrl 缩略图，1000像素*600像素以下
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 缩略图，1000像素*600像素以下
     * @param picUrl 缩略图，1000像素*600像素以下
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * 初始余额(面额)
     * @return initBalance 初始余额(面额)
     */
    public Integer getInitBalance() {
        return initBalance;
    }

    /**
     * 初始余额(面额)
     * @param initBalance 初始余额(面额)
     */
    public void setInitBalance(Integer initBalance) {
        this.initBalance = initBalance;
    }

    /**
     * 礼品卡价格（售价）
     * @return price 礼品卡价格（售价）
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 礼品卡价格（售价）
     * @param price 礼品卡价格（售价）
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 券名（卡名称）
     * @return title 券名（卡名称）
     */
    public String getTitle() {
        return title;
    }

    /**
     * 券名（卡名称）
     * @param title 券名（卡名称）
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 券颜色
     * @return color 券颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 券颜色
     * @param color 券颜色
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * 使用提醒
     * @return notice 使用提醒
     */
    public String getNotice() {
        return notice;
    }

    /**
     * 使用提醒
     * @param notice 使用提醒
     */
    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    /**
     * 使用说明
     * @return description 使用说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 使用说明
     * @param description 使用说明
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 库存
     * @return quantity 库存
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 库存
     * @param quantity 库存
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 初始库存
     * @return initQuantity 初始库存
     */
    public Integer getInitQuantity() {
        return initQuantity;
    }

    /**
     * 初始库存
     * @param initQuantity 初始库存
     */
    public void setInitQuantity(Integer initQuantity) {
        this.initQuantity = initQuantity;
    }

    /**
     * 批次号
     * @return batchId 批次号
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * 批次号
     * @param batchId 批次号
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    /**
     * 卡片审核状态：通过PASSED，未通过FAILED
     * @return cardCheckStatus 卡片审核状态：通过PASSED，未通过FAILED
     */
    public String getCardCheckStatus() {
        return cardCheckStatus;
    }

    /**
     * 卡片审核状态：通过PASSED，未通过FAILED
     * @param cardCheckStatus 卡片审核状态：通过PASSED，未通过FAILED
     */
    public void setCardCheckStatus(String cardCheckStatus) {
        this.cardCheckStatus = cardCheckStatus == null ? null : cardCheckStatus.trim();
    }

    /**
     * 该记录的状态：正常N，已删除D
     * @return lifeStatus 该记录的状态：正常N，已删除D
     */
    public String getLifeStatus() {
        return lifeStatus;
    }

    /**
     * 该记录的状态：正常N，已删除D
     * @param lifeStatus 该记录的状态：正常N，已删除D
     */
    public void setLifeStatus(String lifeStatus) {
        this.lifeStatus = lifeStatus == null ? null : lifeStatus.trim();
    }

    /**
     * 创建时间
     * @return createTime 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后更新时间
     * @return lastUpdate 最后更新时间
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * 最后更新时间
     * @param lastUpdate 最后更新时间
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}