package com.spring.model;

import java.util.Date;

public class TerminalSetting {
    private Integer id;

    private String terminalNo;

    private String password;

    private String salt;

    private String merchantName;

    private String hotline;

    private String eMail;

    private String buyTransactionFee;

    private String buySingleFee;

    private String sellTransactionFee;

    private String sellSingleFee;

    private String rate;

    private String minNeedBitcoin;

    private String minNeedCash;

    private Byte isSend;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private Byte hotWallet;

    private String currency;

    private Byte sellType;

    private Byte exchange;

    private String limitCash;

    private String kycUrl;

    private Byte exchangeStrategy;

    private Byte rateSource;

    private Byte kycEnable;

    private String cryptoSettings;

    private Byte way;

    private String channelParam;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo == null ? null : terminalNo.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getHotline() {
        return hotline;
    }

    public void setHotline(String hotline) {
        this.hotline = hotline == null ? null : hotline.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getBuyTransactionFee() {
        return buyTransactionFee;
    }

    public void setBuyTransactionFee(String buyTransactionFee) {
        this.buyTransactionFee = buyTransactionFee == null ? null : buyTransactionFee.trim();
    }

    public String getBuySingleFee() {
        return buySingleFee;
    }

    public void setBuySingleFee(String buySingleFee) {
        this.buySingleFee = buySingleFee == null ? null : buySingleFee.trim();
    }

    public String getSellTransactionFee() {
        return sellTransactionFee;
    }

    public void setSellTransactionFee(String sellTransactionFee) {
        this.sellTransactionFee = sellTransactionFee == null ? null : sellTransactionFee.trim();
    }

    public String getSellSingleFee() {
        return sellSingleFee;
    }

    public void setSellSingleFee(String sellSingleFee) {
        this.sellSingleFee = sellSingleFee == null ? null : sellSingleFee.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public String getMinNeedBitcoin() {
        return minNeedBitcoin;
    }

    public void setMinNeedBitcoin(String minNeedBitcoin) {
        this.minNeedBitcoin = minNeedBitcoin == null ? null : minNeedBitcoin.trim();
    }

    public String getMinNeedCash() {
        return minNeedCash;
    }

    public void setMinNeedCash(String minNeedCash) {
        this.minNeedCash = minNeedCash == null ? null : minNeedCash.trim();
    }

    public Byte getIsSend() {
        return isSend;
    }

    public void setIsSend(Byte isSend) {
        this.isSend = isSend;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getHotWallet() {
        return hotWallet;
    }

    public void setHotWallet(Byte hotWallet) {
        this.hotWallet = hotWallet;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Byte getSellType() {
        return sellType;
    }

    public void setSellType(Byte sellType) {
        this.sellType = sellType;
    }

    public Byte getExchange() {
        return exchange;
    }

    public void setExchange(Byte exchange) {
        this.exchange = exchange;
    }

    public String getLimitCash() {
        return limitCash;
    }

    public void setLimitCash(String limitCash) {
        this.limitCash = limitCash == null ? null : limitCash.trim();
    }

    public String getKycUrl() {
        return kycUrl;
    }

    public void setKycUrl(String kycUrl) {
        this.kycUrl = kycUrl == null ? null : kycUrl.trim();
    }

    public Byte getExchangeStrategy() {
        return exchangeStrategy;
    }

    public void setExchangeStrategy(Byte exchangeStrategy) {
        this.exchangeStrategy = exchangeStrategy;
    }

    public Byte getRateSource() {
        return rateSource;
    }

    public void setRateSource(Byte rateSource) {
        this.rateSource = rateSource;
    }

    public Byte getKycEnable() {
        return kycEnable;
    }

    public void setKycEnable(Byte kycEnable) {
        this.kycEnable = kycEnable;
    }

    public String getCryptoSettings() {
        return cryptoSettings;
    }

    public void setCryptoSettings(String cryptoSettings) {
        this.cryptoSettings = cryptoSettings == null ? null : cryptoSettings.trim();
    }

    public Byte getWay() {
        return way;
    }

    public void setWay(Byte way) {
        this.way = way;
    }

    public String getChannelParam() {
        return channelParam;
    }

    public void setChannelParam(String channelParam) {
        this.channelParam = channelParam == null ? null : channelParam.trim();
    }
}