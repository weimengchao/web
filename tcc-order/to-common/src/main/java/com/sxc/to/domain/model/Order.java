package com.sxc.to.domain.model;

public class Order {
    private Integer orderId;

    private Integer payerUserId;

    private Integer payeeUserId;

    private Long redPacketPayAmount;

    private Long capitalPayAmount;

    private String status;

    private String merchantOrderNo;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getPayerUserId() {
        return payerUserId;
    }

    public void setPayerUserId(Integer payerUserId) {
        this.payerUserId = payerUserId;
    }

    public Integer getPayeeUserId() {
        return payeeUserId;
    }

    public void setPayeeUserId(Integer payeeUserId) {
        this.payeeUserId = payeeUserId;
    }

    public Long getRedPacketPayAmount() {
        return redPacketPayAmount;
    }

    public void setRedPacketPayAmount(Long redPacketPayAmount) {
        this.redPacketPayAmount = redPacketPayAmount;
    }

    public Long getCapitalPayAmount() {
        return capitalPayAmount;
    }

    public void setCapitalPayAmount(Long capitalPayAmount) {
        this.capitalPayAmount = capitalPayAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }
}