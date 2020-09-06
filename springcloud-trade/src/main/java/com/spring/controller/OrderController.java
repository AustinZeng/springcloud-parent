package com.spring.controller;

import com.spring.client.ServerClient;
import com.spring.mapper.UserMapper;
import com.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zengcong
 * @create: 2020-06-04 16:01
 */

@RestController
@RequestMapping(value = "order")
public class OrderController {

    @Autowired
    ServerClient serverClient;

    @Autowired
    UserMapper userMapper;



/*    @Autowired
    TradeProducer tradeProducer;

    @Autowired
    TradeTransactionProducer tradeTransactionProducer;*/





    @RequestMapping(value = "create")
    public String  create(@RequestParam("text") String text){

        User user = userMapper.selectByIdForUpdate(10);
        System.out.println(user.getAccount());

        return serverClient.query(text);
    }


  /*  @RequestMapping(value = "mq")
    public String  mq(@RequestParam("msg") String msg){

        tradeProducer.syncSend(msg);
        tradeProducer.asyncSend(msg);
        tradeTransactionProducer.sendMsg(msg);

        return "success";
    }*/


}
