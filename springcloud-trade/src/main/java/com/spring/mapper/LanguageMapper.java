package com.spring.mapper;

import com.spring.model.Language;

public interface LanguageMapper {
    Language selectByPrimaryKey(String id);
}