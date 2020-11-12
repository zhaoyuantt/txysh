package com.landasoft.xysh.kafka;

import com.landasoft.xysh.utils.IDUtils;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.junit.Test;

import java.util.Properties;

public class TestKafkaProducerApi {

    /**
     * 测试kafka生产消息，没有回调函数
     */
    @Test
    public void testProducer(){
        // 设置生产者main线程将消息发送到消息累加器所需参数
        Properties properties = new Properties();
        properties.put("bootstrap.servers",
                "192.168.25.130:9092,192.168.25.130:9093,192.168.25.130:9094");// broker地址
        properties.put("acks","all");// ack应答参数，发生故障时，可能造成数据重复
        properties.put("retries",5);// 发送失败，重试次数
        properties.put("batch.size",16384);// 批次大小
        properties.put("linger.ms",1000);// 等待时间
        properties.put("buffer.memory",33554432);// 消息累加器大小，即RecordAccumulator缓冲区大小
        properties.put("key.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");// 键的序列化
        properties.put("value.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");// 值的序列化

        Producer<String,String> producer = new KafkaProducer<String, String>(properties);

        for(int i = 0;i < 100;i++){
            // 消息类
            ProducerRecord<String,String> record = new ProducerRecord<String,String>(
                    "taojie", String.valueOf(IDUtils.genItemId()),"TJ_"+i);

            // 发送消息，没有回调函数
            producer.send(record);

            // 发送消息，有回调函数

        }

        producer.close();
    }
}
