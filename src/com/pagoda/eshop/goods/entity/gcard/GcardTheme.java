package com.pagoda.eshop.goods.entity.gcard;

import java.util.Date;

public class GcardTheme {
    /**
     * id
     */
    private Long id;

    /**
     * 主题的封面图片
     */
    private String themePicUrl;

    /**
     * 主题名称
     */
    private String title;

    /**
     * 主题title的颜色
     */
    private String titleColor;

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
     * 主题的封面图片
     * @return themePicUrl 主题的封面图片
     */
    public String getThemePicUrl() {
        return themePicUrl;
    }

    /**
     * 主题的封面图片
     * @param themePicUrl 主题的封面图片
     */
    public void setThemePicUrl(String themePicUrl) {
        this.themePicUrl = themePicUrl == null ? null : themePicUrl.trim();
    }

    /**
     * 主题名称
     * @return title 主题名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 主题名称
     * @param title 主题名称
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 主题title的颜色
     * @return titleColor 主题title的颜色
     */
    public String getTitleColor() {
        return titleColor;
    }

    /**
     * 主题title的颜色
     * @param titleColor 主题title的颜色
     */
    public void setTitleColor(String titleColor) {
        this.titleColor = titleColor == null ? null : titleColor.trim();
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