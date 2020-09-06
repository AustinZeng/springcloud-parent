package com.spring.model;

import java.util.Date;

public class Agreement {
    private Integer id;

    private String agreementTitle;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String privacyPolicyTitle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAgreementTitle() {
        return agreementTitle;
    }

    public void setAgreementTitle(String agreementTitle) {
        this.agreementTitle = agreementTitle == null ? null : agreementTitle.trim();
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

    public String getPrivacyPolicyTitle() {
        return privacyPolicyTitle;
    }

    public void setPrivacyPolicyTitle(String privacyPolicyTitle) {
        this.privacyPolicyTitle = privacyPolicyTitle == null ? null : privacyPolicyTitle.trim();
    }
}