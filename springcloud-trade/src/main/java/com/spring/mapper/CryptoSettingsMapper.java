package com.spring.mapper;

import com.spring.model.CryptoSettings;

public interface CryptoSettingsMapper {
    CryptoSettings selectByPrimaryKey(Integer id);
}