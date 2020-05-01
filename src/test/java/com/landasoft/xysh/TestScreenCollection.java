package com.landasoft.xysh;

import com.landasoft.xysh.pojo.TScreenChart;
import com.landasoft.xysh.pojo.TScreenHz;
import com.landasoft.xysh.pojo.TScreenList;
import com.landasoft.xysh.service.QueryScreenDataService;
import com.landasoft.xysh.service.ScreenService;
import com.landasoft.xysh.utils.IDUtils;
import com.landasoft.xysh.utils.MyResult;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * 测试屏幕汇总
 */
public class TestScreenCollection {

    ScreenService screenService = null;
    QueryScreenDataService queryScreenDataService = null;

    @Before
    public void initSpringContainer(){
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("classpath:config/applicationContext-*.xml");
        screenService = applicationContext.getBean(ScreenService.class);
        queryScreenDataService = applicationContext.getBean(QueryScreenDataService.class);
    }

    @Test
    public void testInsertScreenCollection(){
        TScreenHz screenHz = new TScreenHz();
        screenHz.setsId(IDUtils.getGeneId());
        screenHz.setsName("重点目标");
        screenHz.setsCreated(new Date());
        screenHz.setsUpdated(new Date());
        //screenService.insertScreenCollection(screenHz);
    }

    @Test
    public void testInsertScreenOneChartData(){
        TScreenChart screenChart = new TScreenChart();
        screenChart.setcId(IDUtils.getGeneId());
        screenChart.setcScreenId("2f23b14afe0f439687041e973fc90182");
        screenChart.setcMkMc("寄递物流");
        screenChart.setcCategoryMc("网点分布");
        screenChart.setcCategoryEjfl("");
        screenChart.setcCategoryXl("数量");

        screenChart.setcSjMc("姑苏区");
        screenChart.setcSjSl("700");
        screenChart.setcSdSl(null);

        screenChart.setcXsWs(null);
        screenChart.setcBz(null);
        screenChart.setcSjDw("千");
        screenChart.setcCreated(new Date());
        screenChart.setcUpdated(new Date());

        //screenService.insertScreenCharts(screenChart);
    }

    @Test
    public void testInsertScreenMoreChartData(){
        TScreenChart screenChart = new TScreenChart();
        screenChart.setcId(IDUtils.getGeneId());
        screenChart.setcScreenId("cbd53c27ef124b79b4d7eaea8f850399");
        screenChart.setcMkMc("群租房");
        screenChart.setcCategoryMc("重点人员");
        screenChart.setcCategoryEjfl("重点人员分析");
        screenChart.setcCategoryXl("出租房");

        screenChart.setcSjMc("度假区");
        screenChart.setcSjSl("333");
        screenChart.setcSdSl(null);

        screenChart.setcXsWs(null);
        screenChart.setcBz(null);
        screenChart.setcSjDw("人");
        screenChart.setcCreated(new Date());
        screenChart.setcUpdated(new Date());

        //screenService.insertScreenCharts(screenChart);
    }

    @Test
    public void testInsertScreenScatterData(){
        TScreenChart screenChart = new TScreenChart();
        screenChart.setcId(IDUtils.getGeneId());
        screenChart.setcScreenId("e0b505a9e2d2441884216edbf9170d64");
        screenChart.setcMkMc("重点目标");
        screenChart.setcCategoryMc("内保");
        screenChart.setcCategoryEjfl("重点类别单位统计");
        screenChart.setcCategoryXl(null);

        screenChart.setcSjMc("供电单位");
        screenChart.setcSjSl("100");
        screenChart.setcSdSl(null);

        screenChart.setcXsWs(null);
        screenChart.setcBz(null);
        screenChart.setcSjDw("家");
        screenChart.setcCreated(new Date());
        screenChart.setcUpdated(new Date());

        //screenService.insertScreenCharts(screenChart);
    }

    @Test
    public void testGetMoreEChartsData(){
        queryScreenDataService.getScreenMoreChartDataList("cbd53c27ef124b79b4d7eaea8f850399","群租房","重点人员","重点人员分析","");
    }

    @Test
    public void testGetScatterData(){
        MyResult result = queryScreenDataService.getScatterData("e0b505a9e2d2441884216edbf9170d64", "重点目标", "内保", "重点类别单位统计", "");
    }

    @Test
    public void testInsetScreenListData(){
        TScreenList screenList = new TScreenList();
        screenList.setlId(IDUtils.getGeneId());
        screenList.setlScreenId("e0b505a9e2d2441884216edbf9170d64");
        screenList.setlMkMc("重点目标");
        screenList.setlCategoryMc("活动举办");
        screenList.setlCategoryEjfl("全市大型活动举办信息");
        screenList.setlCategoryXl(null);
        screenList.setlBz(null);
        screenList.setlKz1("张天爱兰州演唱会");
        screenList.setlKz2("兰州市城关区");
        screenList.setlKz3("城关分局");
        screenList.setlKz4("2000");
        screenList.setlKz5("200");
        screenList.setlKz6("城关分局");
        screenList.setlCreated(new Date());
        screenList.setlUpdated(new Date());
        screenService.insertScreenList(screenList);
    }


}
