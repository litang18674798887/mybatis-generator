package com.pagoda.eshop.goods.entity.gcard;

import java.util.Date;

public class GcardCover {
    /**
     * id
     */
    private Long id;

    /**
     * 卡面图
     */
    private String backgroundPicUrl;

    /**
     * 默认祝福语
     */
    private String defaultGiftingMsg;

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
     * 卡面图
     * @return backgroundPicUrl 卡面图
     */
    public String getBackgroundPicUrl() {
        return backgroundPicUrl;
    }

    /**
     * 卡面图
     * @param backgroundPicUrl 卡面图
     */
    public void setBackgroundPicUrl(String backgroundPicUrl) {
        this.backgroundPicUrl = backgroundPicUrl == null ? null : backgroundPicUrl.trim();
    }

    /**
     * 默认祝福语
     * @return defaultGiftingMsg 默认祝福语
     */
    public String getDefaultGiftingMsg() {
        return defaultGiftingMsg;
    }

    /**
     * 默认祝福语
     * @param defaultGiftingMsg 默认祝福语
     */
    public void setDefaultGiftingMsg(String defaultGiftingMsg) {
        this.defaultGiftingMsg = defaultGiftingMsg == null ? null : defaultGiftingMsg.trim();
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