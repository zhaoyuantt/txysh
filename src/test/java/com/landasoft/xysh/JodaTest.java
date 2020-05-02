package com.landasoft.xysh;

import org.joda.time.DateTime;
import org.junit.Test;

import java.util.Date;

/**
 * Joda时间操作工具类测试
 * @author zhaoyuan
 * @date 2020,May 2 9:42 pm
 */
public class JodaTest {

    @Test
    public void testMinus(){
        DateTime dateTime = new DateTime();
        DateTime minusMinutes = dateTime.minusMinutes(30);
        Date date = minusMinutes.toDate();
        //String string = minusMinutes.toString("yyyy-MM-dd hh:MM:ss");
        System.out.println(date);
    }
}
