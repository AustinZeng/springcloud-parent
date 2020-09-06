package com.spring.model;

import java.util.Date;

public class Advert {
    private Integer id;

    private String advertTitle;

    private String advertContent;

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

    public String getAdvertTitle() {
        return advertTitle;
    }

    public void setAdvertTitle(String advertTitle) {
        this.advertTitle = advertTitle == null ? null : advertTitle.trim();
    }

    public String getAdvertContent() {
        return advertContent;
    }

    public void setAdvertContent(String advertContent) {
        this.advertContent = advertContent == null ? null : advertContent.trim();
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