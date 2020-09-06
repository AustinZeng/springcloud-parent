package com.spring.service;

import com.spring.model.User;

import java.util.Map;

public interface UserService {

     User query(Integer id);

     boolean update(Integer id);

     boolean updateByName(Map<String,String> map) throws InterruptedException;
}
