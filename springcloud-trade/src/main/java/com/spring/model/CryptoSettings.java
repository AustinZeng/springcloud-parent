package com.spring.model;

import java.math.BigDecimal;
import java.util.Date;

public class CryptoSettings {
    private Integer id;

    private String name;

    private Byte virtualCurrency;

    private Byte status;

    private Byte exchangeStrategy;

    private Byte exchange;

    private Byte hotWallet;

    private Byte confirmations;

    private Byte rateSource;

    private BigDecimal price;

    private BigDecimal buyTransactionFee;

    private BigDecimal buySingleFee;

    private BigDecimal minNeedCash;

    private BigDecimal sellTransactionFee;

    private BigDecimal sellSingleFee;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String channelParam;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getVirtualCurrency() {
        return virtualCurrency;
    }

    public void setVirtualCurrency(Byte virtualCurrency) {
        this.virtualCurrency = virtualCurrency;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getExchangeStrategy() {
        return exchangeStrategy;
    }

    public void setExchangeStrategy(Byte exchangeStrategy) {
        this.exchangeStrategy = exchangeStrategy;
    }

    public Byte getExchange() {
        return exchange;
    }

    public void setExchange(Byte exchange) {
        this.exchange = exchange;
    }

    public Byte getHotWallet() {
        return hotWallet;
    }

    public void setHotWallet(Byte hotWallet) {
        this.hotWallet = hotWallet;
    }

    public Byte getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Byte confirmations) {
        this.confirmations = confirmations;
    }

    public Byte getRateSource() {
        return rateSource;
    }

    public void setRateSource(Byte rateSource) {
        this.rateSource = rateSource;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getBuyTransactionFee() {
        return buyTransactionFee;
    }

    public void setBuyTransactionFee(BigDecimal buyTransactionFee) {
        this.buyTransactionFee = buyTransactionFee;
    }

    public BigDecimal getBuySingleFee() {
        return buySingleFee;
    }

    public void setBuySingleFee(BigDecimal buySingleFee) {
        this.buySingleFee = buySingleFee;
    }

    public BigDecimal getMinNeedCash() {
        return minNeedCash;
    }

    public void setMinNeedCash(BigDecimal minNeedCash) {
        this.minNeedCash = minNeedCash;
    }

    public BigDecimal getSellTransactionFee() {
        return sellTransactionFee;
    }

    public void setSellTransactionFee(BigDecimal sellTransactionFee) {
        this.sellTransactionFee = sellTransactionFee;
    }

    public BigDecimal getSellSingleFee() {
        return sellSingleFee;
    }

    public void setSellSingleFee(BigDecimal sellSingleFee) {
        this.sellSingleFee = sellSingleFee;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getChannelParam() {
        return channelParam;
    }

    public void setChannelParam(String channelParam) {
        this.channelParam = channelParam == null ? null : channelParam.trim();
    }
}