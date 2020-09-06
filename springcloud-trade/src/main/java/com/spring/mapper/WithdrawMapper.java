package com.spring.mapper;

import com.spring.model.Withdraw;

public interface WithdrawMapper {
    Withdraw selectByPrimaryKey(Integer id);
}