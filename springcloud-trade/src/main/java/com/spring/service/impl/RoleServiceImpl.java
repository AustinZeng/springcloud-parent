package com.spring.service.impl;

import com.spring.mapper.RoleMapper;
import com.spring.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: zengcong
 * @create: 2020-06-28 10:36
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public boolean update(Integer id) {
        return false;
    }
}
