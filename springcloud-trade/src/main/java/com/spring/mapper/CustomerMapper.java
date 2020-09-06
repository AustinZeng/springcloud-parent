package com.spring.mapper;

import com.spring.model.Customer;

public interface CustomerMapper {
    Customer selectByPrimaryKey(Integer id);
}