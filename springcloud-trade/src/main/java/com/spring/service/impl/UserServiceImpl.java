package com.spring.service.impl;

import com.spring.mapper.UserMapper;
import com.spring.model.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * @description:
 * @author: zengcong
 * @create: 2020-06-22 17:25
 */

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserMapper userMapper;



    @Override
    public User query(Integer id) {

        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public boolean update(Integer id) {
        //强读主库
       // HintManager.getInstance().setMasterRouteOnly();
        User user = userMapper.selectByIdForUpdate(id);
        System.out.println(user.getAccount());
        user.setName("admin");
       // user.setUpdateTime(new Date());
       boolean flat =  userMapper.update(user);

        return flat;
    }

    @Override
    @Transactional
    public boolean updateByName(Map<String, String> map) throws InterruptedException {


        boolean flat =  userMapper.updateByName(map);

        System.out.println("操作结果："+flat+",当前时间是："+ LocalDateTime.now());

        Thread.sleep(10000);

        return flat;
    }

}
