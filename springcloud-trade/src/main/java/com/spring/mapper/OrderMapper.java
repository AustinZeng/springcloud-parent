package com.spring.mapper;

import com.spring.model.Order;

public interface OrderMapper {
    Order selectByPrimaryKey(String transId);
}