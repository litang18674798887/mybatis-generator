package com.pagoda.eshop.goods.entity.gcard;

import java.util.Date;

public class GcardTransferRecord {
    /**
     * id
     */
    private Long id;

    /**
     * 持有用户openId
     */
    private String openid;

    /**
     * 操作（BUY购买、RECEIVE领卡、REBACK退回、CONSUME消费、VERIFY核销）
     */
    private String operate;

    /**
     * 消费金额
     */
    private Integer consume;

    /**
     * 余额
     */
    private Integer balance;

    /**
     * code
     */
    private String code;

    /**
     * 卡号
     */
    private String cardno;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastupdate;

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
     * 持有用户openId
     * @return openId 持有用户openId
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 持有用户openId
     * @param openid 持有用户openId
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * 操作（BUY购买、RECEIVE领卡、REBACK退回、CONSUME消费、VERIFY核销）
     * @return operate 操作（BUY购买、RECEIVE领卡、REBACK退回、CONSUME消费、VERIFY核销）
     */
    public String getOperate() {
        return operate;
    }

    /**
     * 操作（BUY购买、RECEIVE领卡、REBACK退回、CONSUME消费、VERIFY核销）
     * @param operate 操作（BUY购买、RECEIVE领卡、REBACK退回、CONSUME消费、VERIFY核销）
     */
    public void setOperate(String operate) {
        this.operate = operate == null ? null : operate.trim();
    }

    /**
     * 消费金额
     * @return consume 消费金额
     */
    public Integer getConsume() {
        return consume;
    }

    /**
     * 消费金额
     * @param consume 消费金额
     */
    public void setConsume(Integer consume) {
        this.consume = consume;
    }

    /**
     * 余额
     * @return balance 余额
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * 余额
     * @param balance 余额
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /**
     * code
     * @return code code
     */
    public String getCode() {
        return code;
    }

    /**
     * code
     * @param code code
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 卡号
     * @return cardNo 卡号
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * 卡号
     * @param cardno 卡号
     */
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    /**
     * 创建时间
     * @return createTime 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 创建时间
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 最后更新时间
     * @return lastUpdate 最后更新时间
     */
    public Date getLastupdate() {
        return lastupdate;
    }

    /**
     * 最后更新时间
     * @param lastupdate 最后更新时间
     */
    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
}