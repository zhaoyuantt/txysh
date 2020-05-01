package com.landasoft.xysh.service.impl;

import com.landasoft.xysh.mapper.TScreenChartMapper;
import com.landasoft.xysh.mapper.TScreenHzMapper;
import com.landasoft.xysh.mapper.TScreenListMapper;
import com.landasoft.xysh.pojo.TScreenChart;
import com.landasoft.xysh.pojo.TScreenHz;
import com.landasoft.xysh.pojo.TScreenList;
import com.landasoft.xysh.service.ScreenService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 屏幕汇总Service接口实现
 * @author zhaoyuan
 * @date 2020,March 24 4:01 pm
 */
@Service
public class ScreenCollectionServiceImpl implements ScreenService {

    @Autowired
    private TScreenHzMapper screenHzMapper;
    @Autowired
    private TScreenChartMapper screenChartMapper;
    @Autowired
    private TScreenListMapper screenListMapper;

    @Override
    public void insertScreenCollection(TScreenHz screenHz) {
        if(StringUtils.isBlank(screenHz.getsId())){
            throw new RuntimeException("屏幕汇总编号为空");
        }
        if(StringUtils.isBlank(screenHz.getsName())){
            throw new RuntimeException("屏幕汇总名称为空");
        }
        screenHzMapper.insert(screenHz);
    }

    @Override
    public void insertScreenCharts(TScreenChart screenChart) {
        checkScreenChartsParams(screenChart);
        screenChartMapper.insert(screenChart);
    }

    @Override
    public void insertScreenList(TScreenList screenList) {
        checkScreenListParams(screenList);
        screenListMapper.insert(screenList);
    }

    void checkScreenChartsParams(TScreenChart screenChart){
        if(StringUtils.isBlank(screenChart.getcScreenId())){
            throw new RuntimeException("屏幕汇总编号为空");
        }
        if(StringUtils.isBlank(screenChart.getcMkMc())){
            throw new RuntimeException("模块名称为空");
        }
        if(StringUtils.isBlank(screenChart.getcCategoryMc())){
            throw new RuntimeException("分类名称为空");
        }
    }

    void checkScreenListParams(TScreenList screenList){
        if(StringUtils.isBlank(screenList.getlScreenId())){
            throw new RuntimeException("屏幕汇总编号为空");
        }
        if(StringUtils.isBlank(screenList.getlMkMc())){
            throw new RuntimeException("模块名称为空");
        }
        if(StringUtils.isBlank(screenList.getlCategoryMc())){
            throw new RuntimeException("分类名称为空");
        }
    }
}
