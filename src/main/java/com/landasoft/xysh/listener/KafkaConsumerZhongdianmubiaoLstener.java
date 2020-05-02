package com.landasoft.xysh.listener;

import com.landasoft.xysh.pojo.TScreenChart;
import com.landasoft.xysh.utils.JsonUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.log4j.Logger;
import org.springframework.kafka.listener.MessageListener;

/**
 * zdmb 消息监听
 * @author zhaoyuan
 * @date 2020,May 2 11:41 pm
 */
public class KafkaConsumerZhongdianmubiaoLstener implements MessageListener<String,String> {

    private static final Logger log = Logger.getLogger(KafkaConsumerZhongdianmubiaoLstener.class);

    @Override
    public void onMessage(ConsumerRecord<String, String> consumerRecord) {
        String value = consumerRecord.value();
        log.info("接收到重点目标消息数据："+value);
        TScreenChart screenChart = JsonUtils.jsonToPojo(value, TScreenChart.class);
        System.out.println(screenChart);
    }
}
