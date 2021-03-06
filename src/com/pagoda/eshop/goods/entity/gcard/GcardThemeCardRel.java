package com.pagoda.eshop.goods.entity.gcard;

import java.util.Date;

public class GcardThemeCardRel {
    /**
     * id
     */
    private Long id;

    /**
     * 主题Id
     */
    private Long themeId;

    /**
     * 礼品卡Id
     */
    private Long cardId;

    /**
     * 礼品卡别名
     */
    private String cardNickName;

    /**
     * 排序字段：相同的themeId对应多个有序的themeId，从0开始，升序
     */
    private Integer sequence;

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
     * 主题Id
     * @return themeId 主题Id
     */
    public Long getThemeId() {
        return themeId;
    }

    /**
     * 主题Id
     * @param themeId 主题Id
     */
    public void setThemeId(Long themeId) {
        this.themeId = themeId;
    }

    /**
     * 礼品卡Id
     * @return cardId 礼品卡Id
     */
    public Long getCardId() {
        return cardId;
    }

    /**
     * 礼品卡Id
     * @param cardId 礼品卡Id
     */
    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    /**
     * 礼品卡别名
     * @return cardNickName 礼品卡别名
     */
    public String getCardNickName() {
        return cardNickName;
    }

    /**
     * 礼品卡别名
     * @param cardNickName 礼品卡别名
     */
    public void setCardNickName(String cardNickName) {
        this.cardNickName = cardNickName == null ? null : cardNickName.trim();
    }

    /**
     * 排序字段：相同的themeId对应多个有序的themeId，从0开始，升序
     * @return sequence 排序字段：相同的themeId对应多个有序的themeId，从0开始，升序
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 排序字段：相同的themeId对应多个有序的themeId，从0开始，升序
     * @param sequence 排序字段：相同的themeId对应多个有序的themeId，从0开始，升序
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
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