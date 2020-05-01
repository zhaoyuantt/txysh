package com.landasoft.xysh.service;

import com.landasoft.xysh.pojo.TScreenChart;
import com.landasoft.xysh.utils.MyResult;

import java.util.List;
import java.util.Map;

/**
 * echarts图表数据查询Service接口
 * @author zhaoyuan
 * @date 2020,March 24 5:46 pm
 */
public interface QueryScreenDataService {

    /**
     * 查询echarts图表数据 一维
     * @param screenId
     * @param mkmc
     * @param categoryMc
     * @param categoryEjfl
     * @param categoryXl
     */
    MyResult getScreenOneChartDataList(String screenId, String mkmc, String categoryMc, String categoryEjfl, String categoryXl);

    /**
     * 获取最大值和最小值
     * @param screenId
     * @param mkmc
     * @param categoryMc
     * @param categoryEjfl
     * @param categoryXl
     * @return
     */
    /*Map<String,Integer> getScreenOneChartMaxAndMinData(String screenId, String mkmc, String categoryMc, String categoryEjfl, String categoryXl);*/

    /**
     * 查询echarts图表数据 多维
     * @param screenId
     * @param mkmc
     * @param categoryMc
     * @param categoryEjfl
     * @param categoryXl
     * @return
     */
    MyResult getScreenMoreChartDataList(String screenId, String mkmc, String categoryMc, String categoryEjfl, String categoryXl);

    /**
     * 查询散点数据
     * @param screenId
     * @param mkmc
     * @param categoryMc
     * @param categoryEjfl
     * @param categoryXl
     * @return
     */
    MyResult getScatterData(String screenId, String mkmc, String categoryMc, String categoryEjfl, String categoryXl);

    /**
     * 查询列表数据
     * @param screenId
     * @param mkmc
     * @param categoryMc
     * @param categoryEjfl
     * @param categoryXl
     * @return
     */
    MyResult getScreenListData(String screenId, String mkmc, String categoryMc, String categoryEjfl, String categoryXl);
}
