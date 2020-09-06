package com.spring.mapper;

import com.spring.model.TerminalSetting;

public interface TerminalSettingMapper {
    TerminalSetting selectByPrimaryKey(Integer id);
}