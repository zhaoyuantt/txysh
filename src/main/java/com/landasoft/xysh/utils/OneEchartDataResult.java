package com.landasoft.xysh.utils;

import java.util.List;

/**
 * echarts 图表数据 一维
 * @author zhaoyuan
 * @date 2020,March 24 9:58 pm
 */
public class OneEchartDataResult {

    private Integer max;

    private Integer min;

    private List<String> xList;

    private List<Integer> yList;

    private String zList;

    public OneEchartDataResult() {
    }

    public OneEchartDataResult(Integer max, Integer min, List<String> xList, List<Integer> yList, String zList) {
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

    public List<Integer> getyList() {
        return yList;
    }

    public void setyList(List<Integer> yList) {
        this.yList = yList;
    }

    public String getzList() {
        return zList;
    }

    public void setzList(String zList) {
        this.zList = zList;
    }
}
