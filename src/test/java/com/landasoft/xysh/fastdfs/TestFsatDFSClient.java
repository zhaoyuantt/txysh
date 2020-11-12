package com.landasoft.xysh.fastdfs;

import com.landasoft.xysh.utils.FastDFSClient;
import org.junit.Test;

/**
 * FastDFS java客户端api使用
 * @author zhaoyuan
 * @date 2020,Nov 8 3:30 pm
 */
public class TestFsatDFSClient {

    /**
     * 上传测试
     * @throws Exception
     */
    @Test
    public void testFastDFSClientUpload() throws Exception {
        FastDFSClient fastDFSClient = new
                FastDFSClient("classpath:resource/client.properties");
        String str = fastDFSClient.uploadFile("E:\\南京-文档\\只\\南丽丽\\IMG_20170803_160504.jpg", "jpg", null);
        System.out.println("Storage path is: " + str);
    }
}
