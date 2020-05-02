package com.landasoft.xysh.listener;

import com.landasoft.xysh.pojo.TScreenChart;
import com.landasoft.xysh.utils.JsonUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.log4j.Logger;
import org.springframework.kafka.listener.MessageListener;

/**
 * jdwl 消息监听
 * @author zhaoyuan
 * @date 2020,May 2 11:41 pm
 */
public class KafkaConsumerJidiwuliuLstener implements MessageListener<String,String> {

    private static final Logger log = Logger.getLogger(KafkaConsumerJidiwuliuLstener.class);

    @Override
    public void onMessage(ConsumerRecord<String, String> consumerRecord) {
        String value = consumerRecord.value();
        log.info("接收到寄递物流消息数据："+value);
        TScreenChart screenChart = JsonUtils.jsonToPojo(value, TScreenChart.class);
        //TODO
        System.out.println(screenChart.getcId());
    }
}
