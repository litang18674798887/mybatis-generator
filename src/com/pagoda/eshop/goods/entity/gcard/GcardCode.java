package com.pagoda.eshop.goods.entity.gcard;

import java.util.Date;

public class GcardCode {
    /**
     * id
     */
    private Long id;

    /**
     * 批次号
     */
    private String batchId;

    /**
     * Code码
     */
    private String code;

    /**
     * 卡号
     */
    private String cardNo;

    /**
     * 礼品卡类型 (GIFT_CARD礼品卡、VOUCHER兑换卡)
     */
    private String cardType;

    /**
     * 导入状态（Y已导入、N未导入）
     */
    private String importStatus;

    /**
     * 领取状态（ASSIGNED已分配、 UNASSIGN未分配）
     */
    private String assignStatus;

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
     * Code码
     * @return code Code码
     */
    public String getCode() {
        return code;
    }

    /**
     * Code码
     * @param code Code码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 卡号
     * @return cardNo 卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 卡号
     * @param cardNo 卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
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
     * 导入状态（Y已导入、N未导入）
     * @return importStatus 导入状态（Y已导入、N未导入）
     */
    public String getImportStatus() {
        return importStatus;
    }

    /**
     * 导入状态（Y已导入、N未导入）
     * @param importStatus 导入状态（Y已导入、N未导入）
     */
    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus == null ? null : importStatus.trim();
    }

    /**
     * 领取状态（ASSIGNED已分配、 UNASSIGN未分配）
     * @return assignStatus 领取状态（ASSIGNED已分配、 UNASSIGN未分配）
     */
    public String getAssignStatus() {
        return assignStatus;
    }

    /**
     * 领取状态（ASSIGNED已分配、 UNASSIGN未分配）
     * @param assignStatus 领取状态（ASSIGNED已分配、 UNASSIGN未分配）
     */
    public void setAssignStatus(String assignStatus) {
        this.assignStatus = assignStatus == null ? null : assignStatus.trim();
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