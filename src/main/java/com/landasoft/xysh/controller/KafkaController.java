package com.landasoft.xysh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 *
 */
@Controller
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate<Object,Object> kafkaTemplate;

    @RequestMapping("/producer")
    @ResponseBody
    public String testKafkaProducer(){
        kafkaTemplate.send("test","This is kafka producer");
        return "kafka producer";
    }
}
