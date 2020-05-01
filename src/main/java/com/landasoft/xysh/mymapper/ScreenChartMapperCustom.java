package com.landasoft.xysh.mymapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ScreenChartMapperCustom {

    /**
     * 获取最大值和最小值
     * @param screenId
     * @param mkmc
     * @param categoryMc
     * @param categoryEjfl
     * @param categoryXl
     * @return
     */
    public Map<String,Integer> getChartMaxAndMinData(@Param("screenId") String screenId, @Param("mkmc") String mkmc, @Param("categoryMc") String categoryMc, @Param("categoryEjfl") String categoryEjfl, @Param("categoryXl") String categoryXl);

    /**
     * 获取echarts图表z轴数据
     * @param screenId
     * @param mkmc
     * @param categoryMc
     * @param categoryEjfl
     * @param categoryXl
     * @return
     */
    public List<String> getChartsZlist(@Param("screenId") String screenId, @Param("mkmc") String mkmc, @Param("categoryMc") String categoryMc, @Param("categoryEjfl") String categoryEjfl, @Param("categoryXl") String categoryXl);

    /**
     * 获取散点数据
     * @param screenId
     * @param mkmc
     * @param categoryMc
     * @param categoryEjfl
     * @param categoryXl
     * @return
     */
    @MapKey("cSjMc")
    public List<Map<String, Object>> getScatterData(@Param("screenId") String screenId, @Param("mkmc") String mkmc, @Param("categoryMc") String categoryMc, @Param("categoryEjfl") String categoryEjfl, @Param("categoryXl") String categoryXl);
}