package com.spring.producer;

import org.apache.rocketmq.client.producer.TransactionSendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @description: 事务消息生产者
 * @author: zengcong
 * @create: 2020-07-01 15:43
 */
@Component
public class TradeTransactionProducer {


    private static final Logger LOGGER = LoggerFactory.getLogger(TradeTransactionProducer.class);


    @Autowired
    private RocketMQTemplate rocketMQTemplate;


    public void sendMsg(String msg){

        Message message = MessageBuilder.withPayload("transactionSendMsg:"+msg).build();
        TransactionSendResult result =  rocketMQTemplate.sendMessageInTransaction("test-topic-1", message, null);
        LOGGER.info("发送事务消息返回：{}",result);

    }


}


