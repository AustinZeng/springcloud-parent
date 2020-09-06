package com.spring.model;

import java.util.Date;

public class Order {
    private String transId;

    private String orderId;

    private String size;

    private String productId;

    private String side;

    private String type;

    private String createdAt;

    private String fillFees;

    private String filledSize;

    private String executedValue;

    private String status;

    private String message;

    private String funds;

    private String terminalNo;

    private String price;

    private String createTime;

    private Date updateTime;

    private String cryptoCurrency;

    private String currency;

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side == null ? null : side.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt == null ? null : createdAt.trim();
    }

    public String getFillFees() {
        return fillFees;
    }

    public void setFillFees(String fillFees) {
        this.fillFees = fillFees == null ? null : fillFees.trim();
    }

    public String getFilledSize() {
        return filledSize;
    }

    public void setFilledSize(String filledSize) {
        this.filledSize = filledSize == null ? null : filledSize.trim();
    }

    public String getExecutedValue() {
        return executedValue;
    }

    public void setExecutedValue(String executedValue) {
        this.executedValue = executedValue == null ? null : executedValue.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getFunds() {
        return funds;
    }

    public void setFunds(String funds) {
        this.funds = funds == null ? null : funds.trim();
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo == null ? null : terminalNo.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCryptoCurrency() {
        return cryptoCurrency;
    }

    public void setCryptoCurrency(String cryptoCurrency) {
        this.cryptoCurrency = cryptoCurrency == null ? null : cryptoCurrency.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }
}