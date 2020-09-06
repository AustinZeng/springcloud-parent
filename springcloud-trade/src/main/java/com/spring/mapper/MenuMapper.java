package com.spring.mapper;

import com.spring.model.Menu;

public interface MenuMapper {
    Menu selectByPrimaryKey(Long id);
}