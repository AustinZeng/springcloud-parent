package com.spring.mapper;

import com.spring.model.CashBox;

public interface CashBoxMapper {
    CashBox selectByPrimaryKey(Integer id);
}