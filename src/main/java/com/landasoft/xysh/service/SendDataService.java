package com.landasoft.xysh.service;

/**
 * 发送的数据源 Service接口
 */
public interface SendDataService {

    /**
     * 寄递物流
     * 发送当前时间减去半小时的数据
     */
    void getJidiwuliuList();

    /**
     * 重点目标
     * 发送当前时间减去半小时的数据
     */
    void getZhongdianmubiaoList();
}
