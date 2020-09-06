package com.spring.producer;

import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:交易生产者
 * @author: zengcong
 * @create: 2020-06-29 14:22
 */
@Component
public class TradeProducer {


    private static final Logger LOGGER = LoggerFactory.getLogger(TradeProducer.class);

    @Autowired
    private RocketMQTemplate rocketMQTemplate;


    public void syncSend(String msg){

        SendResult result = rocketMQTemplate.syncSend("test-topic-1", "syncSend:"+msg);
        LOGGER.info("发送同步消息返回：{}",result);
    }


    public void asyncSend(String msg){

        rocketMQTemplate.asyncSend("test-topic-1", "asyncSend:"+msg, new SendCallback() {

            @Override
            public void onSuccess(SendResult result) {

                LOGGER.info("发送异步消息返回：{}",result);
            }

            @Override
            public void onException(Throwable throwable) {
                System.out.println("send fail:"+ throwable.getMessage());
            }

        });

    }

    public void oneWay() {

        rocketMQTemplate.sendOneWay("test-topic-1", "send one-way message");

    }

}
