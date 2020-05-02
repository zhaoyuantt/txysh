package com.landasoft.xysh.service.impl;

import com.landasoft.xysh.mapper.TScreenChartMapper;
import com.landasoft.xysh.pojo.TScreenChart;
import com.landasoft.xysh.pojo.TScreenChartExample;
import com.landasoft.xysh.service.SendDataService;
import com.landasoft.xysh.utils.JsonUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 发送的数据源 Service接口实现
 * @author zhaoyuan
 * @date 2020,May 2 9:41 pm
 */
@Service
public class SendDataServiceImpl implements SendDataService {

    private static final Logger log = Logger.getLogger(SendDataServiceImpl.class);

    @Autowired
    private TScreenChartMapper screenChartMapper;

    @Resource(name = "kafkaTemplate_jidiwuliu")
    private KafkaTemplate<String,String> kafkaTemplate_jidiwuliu;
    @Resource(name="kafkaTemplate_zhongdianmubiao")
    private KafkaTemplate<String,String> kafkaTemplate_zhongdianmubiao;

    @Value("${JIDIWULIU}")
    private String JIDIWULIU;
    @Value("${JIDIWULIU_SYNC_DIFFERENCE}")
    private String JIDIWULIU_SYNC_DIFFERENCE;
    @Value("${JIDIWULIU_TOPIC}")
    private String JIDIWULIU_TOPIC;

    @Value("${ZHONGDIANMUBIAO}")
    private String ZHONGDIANMUBIAO;
    @Value("${ZHONGDIANMUBIAO_SYNC_DIFFERENCE}")
    private String ZHONGDIANMUBIAO_SYNC_DIFFERENCE;
    @Value("${ZHONGDIANMUBIAO_TOPIC}")
    private String ZHONGDIANMUBIAO_TOPIC;

    /**
     * 查看命令：
     * ./kafka-console-consumer.sh --bootstrap-server 192.168.25.130:9092,192.168.25.130:9093,192.168.25.130:9094 --from-beginning --topic jidiwuliu
     */
    @Override
    public void getJidiwuliuList() {
        TScreenChartExample example = new TScreenChartExample();
        TScreenChartExample.Criteria criteria = example.createCriteria();
        criteria.andCMkMcEqualTo(JIDIWULIU);

        DateTime dateTime = new DateTime();
        //当前时间减去半小时
        DateTime minusMinutes = dateTime.minusMinutes(Integer.valueOf(JIDIWULIU_SYNC_DIFFERENCE));

        //criteria.andCCreatedEqualTo(minusMinutes.toDate());
        criteria.andCCreatedGreaterThanOrEqualTo(minusMinutes.toDate());

        List<TScreenChart> screenChartList = screenChartMapper.selectByExample(example);
        if(null != screenChartList && 0 < screenChartList.size()){
            for (int i = 0; i < screenChartList.size(); i++) {
                TScreenChart screenChart =  screenChartList.get(i);
                String jsonData = JsonUtils.objectToJson(screenChart);
                kafkaTemplate_jidiwuliu.send(JIDIWULIU_TOPIC,jsonData);
                log.info("发送寄递物流数据，id为："+screenChart.getcId());
            }
        }
    }

    @Override
    public void getZhongdianmubiaoList() {
        TScreenChartExample example = new TScreenChartExample();
        TScreenChartExample.Criteria criteria = example.createCriteria();
        criteria.andCMkMcEqualTo(ZHONGDIANMUBIAO);

        DateTime dateTime = new DateTime();
        Date date = dateTime.minusMinutes(Integer.valueOf(ZHONGDIANMUBIAO_SYNC_DIFFERENCE)).toDate();

        criteria.andCCreatedGreaterThanOrEqualTo(date);

        List<TScreenChart> screenChartList = screenChartMapper.selectByExample(example);

        if(null != screenChartList && 0 < screenChartList.size()){
            for (int i = 0; i < screenChartList.size(); i++) {
                TScreenChart screenChart =  screenChartList.get(i);
                String jsonData = JsonUtils.objectToJson(screenChart);
                kafkaTemplate_zhongdianmubiao.send(ZHONGDIANMUBIAO_TOPIC,jsonData);
                log.info("发送重点目标数据，id为："+screenChart.getcId());
            }
        }
    }
}
