package com.spring.producer;


import org.apache.rocketmq.spring.annotation.RocketMQTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQLocalTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQLocalTransactionState;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @description: 事务消息消费
 * @author: zengcong
 * @create: 2020-07-01 15:54
 */

@Component
@RocketMQTransactionListener
public class TradeTransactionListener implements RocketMQLocalTransactionListener {
    @Override
    public RocketMQLocalTransactionState executeLocalTransaction(Message message, Object o) {

        return RocketMQLocalTransactionState.COMMIT;
    }

    @Override
    public RocketMQLocalTransactionState checkLocalTransaction(Message message) {
        return null;
    }
}
