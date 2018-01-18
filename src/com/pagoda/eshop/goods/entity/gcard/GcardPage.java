package com.pagoda.eshop.goods.entity.gcard;

import java.util.Date;

public class GcardPage {
    /**
     * id
     */
    private Long id;

    /**
     * 货架id（微信返回）
     */
    private String wxPageId;

    /**
     * 主题id（货架Banner对应的主题）
     */
    private Long themeId;

    /**
     * 礼品卡货架名称
     */
    private String pageTitle;

    /**
     * Banner图
     */
    private String bannerPicUrl;

    /**
     * 商家地址
     */
    private String address;

    /**
     * 服务电话
     */
    private String servicePhone;

    /**
     * 商家使用说明
     */
    private String bizDescription;

    /**
     * 是否支持买给自己，Y:支持，N：不支持
     */
    private String supportBuyForSelf;

    /**
     * 该货架订单是否支持开发票，Y:支持，N：不支持
     */
    private String needReceipt;

    /**
     * 自定义入口名称1
     */
    private String cellTitle1;

    /**
     * 自定义入口链接1
     */
    private String cellUrl1;

    /**
     * 自定义入口名称2
     */
    private String cellTitle2;

    /**
     * 自定义入口链接2
     */
    private String cellUrl2;

    /**
     * 货架状态: Y上架、N下架
     */
    private String status;

    /**
     * 该货架是否跟线上已提交的版本同步：SYNCED:同步, AHEAD_SAVED:版本超前（已上传微信接口）, AHEAD_UNSAVED：版本超前（未上传微信接口）
     */
    private String syncStatus;

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
     * 货架id（微信返回）
     * @return wxPageId 货架id（微信返回）
     */
    public String getWxPageId() {
        return wxPageId;
    }

    /**
     * 货架id（微信返回）
     * @param wxPageId 货架id（微信返回）
     */
    public void setWxPageId(String wxPageId) {
        this.wxPageId = wxPageId == null ? null : wxPageId.trim();
    }

    /**
     * 主题id（货架Banner对应的主题）
     * @return themeId 主题id（货架Banner对应的主题）
     */
    public Long getThemeId() {
        return themeId;
    }

    /**
     * 主题id（货架Banner对应的主题）
     * @param themeId 主题id（货架Banner对应的主题）
     */
    public void setThemeId(Long themeId) {
        this.themeId = themeId;
    }

    /**
     * 礼品卡货架名称
     * @return pageTitle 礼品卡货架名称
     */
    public String getPageTitle() {
        return pageTitle;
    }

    /**
     * 礼品卡货架名称
     * @param pageTitle 礼品卡货架名称
     */
    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle == null ? null : pageTitle.trim();
    }

    /**
     * Banner图
     * @return bannerPicUrl Banner图
     */
    public String getBannerPicUrl() {
        return bannerPicUrl;
    }

    /**
     * Banner图
     * @param bannerPicUrl Banner图
     */
    public void setBannerPicUrl(String bannerPicUrl) {
        this.bannerPicUrl = bannerPicUrl == null ? null : bannerPicUrl.trim();
    }

    /**
     * 商家地址
     * @return address 商家地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 商家地址
     * @param address 商家地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 服务电话
     * @return servicePhone 服务电话
     */
    public String getServicePhone() {
        return servicePhone;
    }

    /**
     * 服务电话
     * @param servicePhone 服务电话
     */
    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone == null ? null : servicePhone.trim();
    }

    /**
     * 商家使用说明
     * @return bizDescription 商家使用说明
     */
    public String getBizDescription() {
        return bizDescription;
    }

    /**
     * 商家使用说明
     * @param bizDescription 商家使用说明
     */
    public void setBizDescription(String bizDescription) {
        this.bizDescription = bizDescription == null ? null : bizDescription.trim();
    }

    /**
     * 是否支持买给自己，Y:支持，N：不支持
     * @return supportBuyForSelf 是否支持买给自己，Y:支持，N：不支持
     */
    public String getSupportBuyForSelf() {
        return supportBuyForSelf;
    }

    /**
     * 是否支持买给自己，Y:支持，N：不支持
     * @param supportBuyForSelf 是否支持买给自己，Y:支持，N：不支持
     */
    public void setSupportBuyForSelf(String supportBuyForSelf) {
        this.supportBuyForSelf = supportBuyForSelf == null ? null : supportBuyForSelf.trim();
    }

    /**
     * 该货架订单是否支持开发票，Y:支持，N：不支持
     * @return needReceipt 该货架订单是否支持开发票，Y:支持，N：不支持
     */
    public String getNeedReceipt() {
        return needReceipt;
    }

    /**
     * 该货架订单是否支持开发票，Y:支持，N：不支持
     * @param needReceipt 该货架订单是否支持开发票，Y:支持，N：不支持
     */
    public void setNeedReceipt(String needReceipt) {
        this.needReceipt = needReceipt == null ? null : needReceipt.trim();
    }

    /**
     * 自定义入口名称1
     * @return cellTitle1 自定义入口名称1
     */
    public String getCellTitle1() {
        return cellTitle1;
    }

    /**
     * 自定义入口名称1
     * @param cellTitle1 自定义入口名称1
     */
    public void setCellTitle1(String cellTitle1) {
        this.cellTitle1 = cellTitle1 == null ? null : cellTitle1.trim();
    }

    /**
     * 自定义入口链接1
     * @return cellUrl1 自定义入口链接1
     */
    public String getCellUrl1() {
        return cellUrl1;
    }

    /**
     * 自定义入口链接1
     * @param cellUrl1 自定义入口链接1
     */
    public void setCellUrl1(String cellUrl1) {
        this.cellUrl1 = cellUrl1 == null ? null : cellUrl1.trim();
    }

    /**
     * 自定义入口名称2
     * @return cellTitle2 自定义入口名称2
     */
    public String getCellTitle2() {
        return cellTitle2;
    }

    /**
     * 自定义入口名称2
     * @param cellTitle2 自定义入口名称2
     */
    public void setCellTitle2(String cellTitle2) {
        this.cellTitle2 = cellTitle2 == null ? null : cellTitle2.trim();
    }

    /**
     * 自定义入口链接2
     * @return cellUrl2 自定义入口链接2
     */
    public String getCellUrl2() {
        return cellUrl2;
    }

    /**
     * 自定义入口链接2
     * @param cellUrl2 自定义入口链接2
     */
    public void setCellUrl2(String cellUrl2) {
        this.cellUrl2 = cellUrl2 == null ? null : cellUrl2.trim();
    }

    /**
     * 货架状态: Y上架、N下架
     * @return status 货架状态: Y上架、N下架
     */
    public String getStatus() {
        return status;
    }

    /**
     * 货架状态: Y上架、N下架
     * @param status 货架状态: Y上架、N下架
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 该货架是否跟线上已提交的版本同步：SYNCED:同步, AHEAD_SAVED:版本超前（已上传微信接口）, AHEAD_UNSAVED：版本超前（未上传微信接口）
     * @return syncStatus 该货架是否跟线上已提交的版本同步：SYNCED:同步, AHEAD_SAVED:版本超前（已上传微信接口）, AHEAD_UNSAVED：版本超前（未上传微信接口）
     */
    public String getSyncStatus() {
        return syncStatus;
    }

    /**
     * 该货架是否跟线上已提交的版本同步：SYNCED:同步, AHEAD_SAVED:版本超前（已上传微信接口）, AHEAD_UNSAVED：版本超前（未上传微信接口）
     * @param syncStatus 该货架是否跟线上已提交的版本同步：SYNCED:同步, AHEAD_SAVED:版本超前（已上传微信接口）, AHEAD_UNSAVED：版本超前（未上传微信接口）
     */
    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus == null ? null : syncStatus.trim();
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