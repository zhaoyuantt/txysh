package com.landasoft.xysh.service;

import com.landasoft.xysh.pojo.TScreenChart;
import com.landasoft.xysh.pojo.TScreenHz;
import com.landasoft.xysh.pojo.TScreenList;

/**
 * 屏幕汇总Service接口
 * @author zhaoyuan
 * @date 2020,April 24 3:55 pm
 */
public interface ScreenService {

    /**
     * 插入屏幕汇总
     * @param screenHz
     */
    void insertScreenCollection(TScreenHz screenHz);

    /**
     * 插入图表数据
     * @param screenChart
     */
    void insertScreenCharts(TScreenChart screenChart);

    /**
     * 插入列表数据
     * @param screenList
     */
    void insertScreenList(TScreenList screenList);
}
