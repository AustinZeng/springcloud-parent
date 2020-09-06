package com.spring.model;

import java.util.Date;

public class Buy {
    private Integer id;

    private String transId;

    private Byte channel;

    private String terminalNo;

    private String address;

    private String amount;

    private String fee;

    private String channelFee;

    private String cash;

    private String extId;

    private String transTime;

    private String status;

    private String remark;

    private String currency;

    private String strategy;

    private String price;

    private Byte exchangeStrategy;

    private String customerId;

    private String exchangeRate;

    private Date updateTime;

    private String cryptoCurrency;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public Byte getChannel() {
        return channel;
    }

    public void setChannel(Byte channel) {
        this.channel = channel;
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo == null ? null : terminalNo.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee == null ? null : fee.trim();
    }

    public String getChannelFee() {
        return channelFee;
    }

    public void setChannelFee(String channelFee) {
        this.channelFee = channelFee == null ? null : channelFee.trim();
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash == null ? null : cash.trim();
    }

    public String getExtId() {
        return extId;
    }

    public void setExtId(String extId) {
        this.extId = extId == null ? null : extId.trim();
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime == null ? null : transTime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy == null ? null : strategy.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Byte getExchangeStrategy() {
        return exchangeStrategy;
    }

    public void setExchangeStrategy(Byte exchangeStrategy) {
        this.exchangeStrategy = exchangeStrategy;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate == null ? null : exchangeRate.trim();
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
}