package com.spring.mapper;

import com.spring.model.EmailSetting;

public interface EmailSettingMapper {
    EmailSetting selectByPrimaryKey(Integer id);
}