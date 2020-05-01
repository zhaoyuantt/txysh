package com.landasoft.xysh.controller;

import com.landasoft.xysh.service.QueryScreenDataService;
import com.landasoft.xysh.utils.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * echarts图表数据查询Controller
 * @author zhaoyuan
 * @date 2020,March 25 12:23 pm
 */
@Controller
@RequestMapping("/jgdp")
public class QueryScreenDataController {

    @Autowired
    private QueryScreenDataService queryScreenDataService;

    /**
     * 获取echarts图表数据 一维
     * @param screenId
     * @param mkmc
     * @param categoryMc
     * @param categoryEjfl
     * @param categoryXl
     * @return
     */
    @RequestMapping(value = "/queryOneEchartsData",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public MyResult getOneEchartsData(@RequestParam(value = "screenId",required = true) String screenId,
                                      @RequestParam(value = "mkmc",required = true) String mkmc,
                                      String categoryMc,String categoryEjfl,String categoryXl){
        MyResult result = queryScreenDataService.getScreenOneChartDataList(screenId, mkmc, categoryMc, categoryEjfl, categoryXl);
        return result;
    }

    /**
     * 获取echarts图表数据 多维
     * @param screenId
     * @param mkmc
     * @param categoryMc
     * @param categoryEjfl
     * @param categoryXl
     * @return
     */
    @RequestMapping(value = "/queryMoreEchartsData",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public MyResult getMoreEchartsData(@RequestParam(value = "screenId",required = true) String screenId,
                                       @RequestParam(value = "mkmc",required = true) String mkmc,
                                       String categoryMc,String categoryEjfl,String categoryXl){
        MyResult result = queryScreenDataService.getScreenMoreChartDataList(screenId, mkmc, categoryMc, categoryEjfl, categoryXl);
        return result;
    }

    /**
     * 获取散点数据
     * @param screenId
     * @param mkmc
     * @param categoryMc
     * @param categoryEjfl
     * @param categoryXl
     * @return
     */
    @RequestMapping(value = "/queryScatterData",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public MyResult getScatterData(@RequestParam(value = "screenId",required = true) String screenId,
                                   @RequestParam(value = "mkmc",required = true) String mkmc,
                                   String categoryMc,String categoryEjfl,String categoryXl){
        MyResult result = queryScreenDataService.getScatterData(screenId, mkmc, categoryMc, categoryEjfl, categoryXl);
        return result;
    }

    @RequestMapping(value = "/queryTableList",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public MyResult getScreenListData(@RequestParam(value = "screenId",required = true) String screenId,
                                      @RequestParam(value = "mkmc",required = true) String mkmc,
                                      String categoryMc,String categoryEjfl,String categoryXl){
        MyResult result = queryScreenDataService.getScreenListData(screenId, mkmc, categoryMc, categoryEjfl, categoryXl);
        return result;
    }

}
