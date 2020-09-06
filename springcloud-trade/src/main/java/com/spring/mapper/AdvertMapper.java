package com.spring.mapper;

import com.spring.model.Advert;

public interface AdvertMapper {
    Advert selectByPrimaryKey(Integer id);
}