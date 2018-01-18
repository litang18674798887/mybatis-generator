package com.pagoda.eshop.goods.entity.gcard;

import java.util.Date;

public class GcardBatch {
    /**
     * id
     */
    private Long id;

    /**
     * 批次号
     */
    private String batchId;

    /**
     * 卡类型
     */
    private String cardType;

    /**
     * 初始面额
     */
    private Integer initBalance;

    /**
     * 初始库存
     */
    private Integer initQuantity;

    /**
     * 是否已经使用：是Y 否N
     */
    private Integer hasUsed;

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
     * 卡类型
     * @return cardType 卡类型
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * 卡类型
     * @param cardType 卡类型
     */
    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    /**
     * 初始面额
     * @return initBalance 初始面额
     */
    public Integer getInitBalance() {
        return initBalance;
    }

    /**
     * 初始面额
     * @param initBalance 初始面额
     */
    public void setInitBalance(Integer initBalance) {
        this.initBalance = initBalance;
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
     * 是否已经使用：是Y 否N
     * @return hasUsed 是否已经使用：是Y 否N
     */
    public Integer getHasUsed() {
        return hasUsed;
    }

    /**
     * 是否已经使用：是Y 否N
     * @param hasUsed 是否已经使用：是Y 否N
     */
    public void setHasUsed(Integer hasUsed) {
        this.hasUsed = hasUsed;
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