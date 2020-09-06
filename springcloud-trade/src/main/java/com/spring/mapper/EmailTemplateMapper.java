package com.spring.mapper;

import com.spring.model.EmailTemplate;

public interface EmailTemplateMapper {
    EmailTemplate selectByPrimaryKey(Integer id);
}