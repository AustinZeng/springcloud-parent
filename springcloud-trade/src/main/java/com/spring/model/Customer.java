package com.spring.model;

import java.util.Date;

public class Customer {
    private Integer id;

    private String custName;

    private String eMail;

    private Byte cardType;

    private String idCardPositive;

    private String idCardObverse;

    private String idCardHandheld;

    private String idPassport;

    private Byte status;

    private String auditOpinion;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public Byte getCardType() {
        return cardType;
    }

    public void setCardType(Byte cardType) {
        this.cardType = cardType;
    }

    public String getIdCardPositive() {
        return idCardPositive;
    }

    public void setIdCardPositive(String idCardPositive) {
        this.idCardPositive = idCardPositive == null ? null : idCardPositive.trim();
    }

    public String getIdCardObverse() {
        return idCardObverse;
    }

    public void setIdCardObverse(String idCardObverse) {
        this.idCardObverse = idCardObverse == null ? null : idCardObverse.trim();
    }

    public String getIdCardHandheld() {
        return idCardHandheld;
    }

    public void setIdCardHandheld(String idCardHandheld) {
        this.idCardHandheld = idCardHandheld == null ? null : idCardHandheld.trim();
    }

    public String getIdPassport() {
        return idPassport;
    }

    public void setIdPassport(String idPassport) {
        this.idPassport = idPassport == null ? null : idPassport.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion == null ? null : auditOpinion.trim();
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
}