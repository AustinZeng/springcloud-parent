package com.spring.mapper;

import com.spring.model.Buy;

public interface BuyMapper {
    Buy selectByPrimaryKey(Integer id);
}