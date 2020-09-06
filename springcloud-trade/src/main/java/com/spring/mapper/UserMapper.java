package com.spring.mapper;

import com.spring.model.User;

import java.util.Map;

public interface UserMapper {

    User selectByPrimaryKey(Integer id);

    User selectByIdForUpdate(Integer id);

    boolean insert(User user);

    boolean update(User user);

    boolean updateByName(Map<String,String> map);
}