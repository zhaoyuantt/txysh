package com.landasoft.xysh.utils;

import java.util.List;
import java.util.Map;

/**
 * echarts 图表数据 多维
 * @author zhaoyuan
 * @date 2020,March 24 7:59 pm
 */
public class MoreEchartDataResult {

    private Integer max;

    private Integer min;

    private List<String> xList;

    private Map<String,List<Integer>> yList;

    private List<String> zList;

    public MoreEchartDataResult() {
    }

    public MoreEchartDataResult(Integer max, Integer min, List<String> xList, Map<String, List<Integer>> yList, List<String> zList) {
        this.max = max;
        this.min = min;
        this.xList = xList;
        this.yList = yList;
        this.zList = zList;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public List<String> getxList() {
        return xList;
    }

    public void setxList(List<String> xList) {
        this.xList = xList;
    }

    public Map<String, List<Integer>> getyList() {
        return yList;
    }

    public void setyList(Map<String, List<Integer>> yList) {
        this.yList = yList;
    }

    public List<String> getzList() {
        return zList;
    }

    public void setzList(List<String> zList) {
        this.zList = zList;
    }
}
