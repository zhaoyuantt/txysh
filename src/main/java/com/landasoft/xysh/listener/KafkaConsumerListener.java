package com.landasoft.xysh.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

/**
 * 消费者Service监听
 * @author zhaoyuan
 * @date 2020,Jan 27 4:27 pm
 */
public class KafkaConsumerListener implements MessageListener<Object,Object> {

    @Override
    public void onMessage(ConsumerRecord<Object, Object> consumerRecord) {
        System.out.println(consumerRecord.value());
    }
}
