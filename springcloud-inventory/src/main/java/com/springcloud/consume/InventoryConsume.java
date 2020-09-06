package com.springcloud.consume;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.apache.rocketmq.spring.core.RocketMQPushConsumerLifecycleListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 消费者
 * @author: zengcong
 * @create: 2020-06-29 14:29
 */


@Service                                                                       //设置广播模式，默认走集群模式
@RocketMQMessageListener(topic = "test-topic-1", consumerGroup = "my-inventory",messageModel = MessageModel.CLUSTERING)
public class InventoryConsume implements RocketMQListener<String>, RocketMQPushConsumerLifecycleListener {


    private static final Logger LOGGER = LoggerFactory.getLogger(InventoryConsume.class);

    @Override
    public void onMessage(String s) {
        // 实现RocketMQPushConsumerLifecycleListener监听器之后，此方法不调用
        System.out.println("消费mq消息："+s);
    }



    private int count = 0;

    @Override
    public void prepareStart(DefaultMQPushConsumer defaultMQPushConsumer) {

        defaultMQPushConsumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext consumeConcurrentlyContext) {

                for (MessageExt messageExt : msgs) {
                    /*System.out.println("重试次数:" + messageExt.getReconsumeTimes());
                    if(count==0){
                        count++;
                        return ConsumeConcurrentlyStatus.RECONSUME_LATER;
                    }*/

                    LOGGER.info("接受到的消息:{}",messageExt);
                   // System.out.println("接受到的消息:" + new String(messageExt.getBody()));
                    return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
    }
}
