package com.landasoft.xysh.service.impl;

import com.landasoft.xysh.mapper.TScreenChartMapper;
import com.landasoft.xysh.mapper.TScreenListMapper;
import com.landasoft.xysh.mymapper.ScreenChartMapperCustom;
import com.landasoft.xysh.pojo.TScreenChart;
import com.landasoft.xysh.pojo.TScreenChartExample;
import com.landasoft.xysh.pojo.TScreenList;
import com.landasoft.xysh.pojo.TScreenListExample;
import com.landasoft.xysh.service.QueryScreenDataService;
import com.landasoft.xysh.utils.MoreEchartDataResult;
import com.landasoft.xysh.utils.MyResult;
import com.landasoft.xysh.utils.OneEchartDataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * echarts图表数据查询Service接口实现
 * @author zhaoyuan
 * @date 2020,March 24 5:49 pm
 */
@Service
public class QueryScreenDataServiceImpl implements QueryScreenDataService {

    @Autowired
    private TScreenChartMapper screenChartMapper;
    @Autowired
    private ScreenChartMapperCustom screenChartMapperCustom;
    @Autowired
    private TScreenListMapper screenListMapper;

    @Override
    public MyResult getScreenOneChartDataList(String screenId, String mkmc, String categoryMc, String categoryEjfl, String categoryXl) {
        List<TScreenChart> screenChartList = getTScreenChartList(screenId, mkmc, categoryMc, categoryEjfl, categoryXl);

        Map<String, Integer> maxAndMinDataMap = screenChartMapperCustom.getChartMaxAndMinData(screenId, mkmc, categoryMc, categoryEjfl, categoryXl);
        Integer max = maxAndMinDataMap.get("max");
        Integer min = maxAndMinDataMap.get("min");

        if(null != screenChartList && 0 < screenChartList.size()){
            MyResult myResult = setOneChartsData(screenChartList, max, min);
            return myResult;
        }
        return null;
    }

    @Override
    public MyResult getScreenMoreChartDataList(String screenId, String mkmc, String categoryMc, String categoryEjfl, String categoryXl) {
        List<TScreenChart> screenChartList = getTScreenChartList(screenId, mkmc, categoryMc, categoryEjfl, categoryXl);

        Map<String, Integer> maxAndMinDataMap = screenChartMapperCustom.getChartMaxAndMinData(screenId, mkmc, categoryMc, categoryEjfl, categoryXl);
        Integer max = maxAndMinDataMap.get("max");
        Integer min = maxAndMinDataMap.get("min");

        if(null != screenChartList && 0 < screenChartList.size()){
            MyResult myResult = setMoreChartsData(screenChartList, max, min);
            return myResult;
        }

        return null;
    }

    @Override
    public MyResult getScatterData(String screenId, String mkmc, String categoryMc, String categoryEjfl, String categoryXl) {
        List<TScreenChart> scatterDataList = getTScreenChartList(screenId, mkmc, categoryMc, categoryEjfl, categoryXl);

        List<Map<String,TScreenChart>> data = new ArrayList<>();

        for (int i = 0; i < scatterDataList.size(); i++) {
            TScreenChart screenChart =  scatterDataList.get(i);

            Map<String,TScreenChart> map = new HashMap<>();

            map.put(screenChart.getcSjMc(),screenChart);

            data.add(map);
        }

        return MyResult.ok(data);
    }

    @Override
    public MyResult getScreenListData(String screenId, String mkmc, String categoryMc, String categoryEjfl, String categoryXl) {

        TScreenListExample example = new TScreenListExample();
        TScreenListExample.Criteria criteria = example.createCriteria();
        criteria.andLScreenIdEqualTo(screenId);
        criteria.andLMkMcEqualTo(mkmc);
        criteria.andLCategoryMcEqualTo(categoryMc);

        if(StringUtils.isNotBlank(categoryEjfl)){
            criteria.andLCategoryEjflEqualTo(categoryEjfl);
        }
        if(StringUtils.isNotBlank(categoryXl)){
            criteria.andLCategoryXlEqualTo(categoryXl);
        }

        List<TScreenList> tScreenListList = screenListMapper.selectByExample(example);

        if(null == tScreenListList || 0 == tScreenListList.size()){
            return MyResult.build(200,"未查询到数据");
        }

        return MyResult.ok(tScreenListList);
    }

    /**
     * 处理echarts一维数据
     * @param screenChartsList
     * @param max
     * @param min
     * @return
     */
    MyResult setOneChartsData(List<TScreenChart> screenChartsList,Integer max,Integer min){

        List<String> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        String zList = screenChartsList.get(0).getcCategoryXl();

        OneEchartDataResult oneEchartDataResult = new OneEchartDataResult();
        oneEchartDataResult.setMax(max);
        oneEchartDataResult.setMin(min);
        oneEchartDataResult.setzList(zList);

        for (int i = 0; i < screenChartsList.size(); i++) {
            TScreenChart screenChart =  screenChartsList.get(i);
            //数据名称
            String sjMc = screenChart.getcSjMc();
            xList.add(sjMc);
            //实际数量
            String sjSl = screenChart.getcSjSl();
            yList.add(Integer.valueOf(sjSl));
        }

        oneEchartDataResult.setxList(xList);
        oneEchartDataResult.setyList(yList);

        return MyResult.ok(oneEchartDataResult);
    }

    /**
     * 获取echarts图表数据列表
     * @param screenId
     * @param mkmc
     * @param categoryMc
     * @param categoryEjfl
     * @param categoryXl
     * @return
     */
    List<TScreenChart> getTScreenChartList(String screenId, String mkmc, String categoryMc, String categoryEjfl, String categoryXl){
        TScreenChartExample example = new TScreenChartExample();
        example.setOrderByClause("c_category_xl desc,c_sj_mc desc");
        TScreenChartExample.Criteria criteria = example.createCriteria();

        criteria.andCScreenIdEqualTo(screenId);
        criteria.andCMkMcEqualTo(mkmc);
        criteria.andCCategoryMcEqualTo(categoryMc);
        criteria.andCCategoryEjflEqualTo(categoryEjfl);
        if(StringUtils.isNotBlank(categoryXl)){
            criteria.andCCategoryXlEqualTo(categoryXl);
        }

        List<TScreenChart> screenChartList = screenChartMapper.selectByExample(example);

        return screenChartList;
    }

    /**
     * 处理echarts图表数据 多维
     * @param screenChartsList
     * @param max
     * @param min
     * @return
     */
    MyResult setMoreChartsData(List<TScreenChart> screenChartsList,Integer max,Integer min){

        List<String> xList = new ArrayList<>();
        List<String> zList = new ArrayList<>();
        Map<String,List<Integer>> yList = new HashMap<>();

        MoreEchartDataResult moreEchartDataResult = new MoreEchartDataResult();

        for (int i = 0; i < screenChartsList.size(); i++) {
            TScreenChart screenChart =  screenChartsList.get(i);

            String categoryXl = screenChart.getcCategoryXl();
            if(!zList.contains(categoryXl)){
                zList.add(categoryXl);
            }

            String sjMc = screenChart.getcSjMc();
            if(!xList.contains(sjMc)){
                xList.add(sjMc);
            }
        }

        for (int i = 0; i < zList.size(); i++) {
            yList.put("yList"+(i+1),new ArrayList<Integer>());
        }

        for (int i = 0; i < screenChartsList.size(); i++) {
            TScreenChart screenChart =  screenChartsList.get(i);

            for (int j = 0; j < zList.size(); j++) {
                String zListItem =  zList.get(j);
                if(zListItem.equals(screenChart.getcCategoryXl())){
                    List<Integer> list = yList.get("yList" + (j + 1));
                    list.add(Integer.valueOf(screenChart.getcSjSl()));
                }
            }

        }

        moreEchartDataResult.setMax(max);
        moreEchartDataResult.setMin(min);
        moreEchartDataResult.setxList(xList);
        moreEchartDataResult.setyList(yList);
        moreEchartDataResult.setzList(zList);

        return MyResult.ok(moreEchartDataResult);
    }
}
