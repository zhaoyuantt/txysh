package com.landasoft.xysh;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.kafka.core.KafkaOperations;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * 测试kafka客户端
 * @author zhaoyuan
 * @date 2020,April 27 2:17 pm
 */
public class TestKafka {

    ApplicationContext applicationContext = null;

    @Autowired
    private KafkaTemplate<Object,Object> kafkaTemplate;

    @Before
    public void initSpringIocContainer(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:config/applicationContext-*.xml");
    }

    /**
     * 生产者发送消息
     */
    @Test
    public  void testProducer(){
        KafkaOperations kafkaOperations = applicationContext.getBean(KafkaOperations.class);
        for (int i = 0;i < 100;i++){
            kafkaOperations.send("taojie","taojie");
        }
    }
}
