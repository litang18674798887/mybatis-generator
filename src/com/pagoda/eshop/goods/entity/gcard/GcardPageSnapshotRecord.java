package com.pagoda.eshop.goods.entity.gcard;

import java.util.Date;

public class GcardPageSnapshotRecord {
    /**
     * id
     */
    private Long id;

    /**
     * 货架Id
     */
    private Long pageId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后更新时间
     */
    private Date lastUpdate;

    /**
     * json序列化的货架实体
     */
    private String pageBody;

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
     * 货架Id
     * @return pageId 货架Id
     */
    public Long getPageId() {
        return pageId;
    }

    /**
     * 货架Id
     * @param pageId 货架Id
     */
    public void setPageId(Long pageId) {
        this.pageId = pageId;
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

    /**
     * json序列化的货架实体
     * @return pageBody json序列化的货架实体
     */
    public String getPageBody() {
        return pageBody;
    }

    /**
     * json序列化的货架实体
     * @param pageBody json序列化的货架实体
     */
    public void setPageBody(String pageBody) {
        this.pageBody = pageBody == null ? null : pageBody.trim();
    }
}