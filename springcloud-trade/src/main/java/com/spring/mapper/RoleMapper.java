package com.spring.mapper;

import com.spring.model.Role;

public interface RoleMapper {
    Role selectByPrimaryKey(Integer id);
}