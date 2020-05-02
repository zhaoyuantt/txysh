package com.landasoft.xysh;

import org.junit.Test;

/**
 * jvm 装载器测试
 */
public class TestClass {

    @Test
    public void testClass(){
        Object object = new Object();
        //BootStrap
        ClassLoader classLoader = object.getClass().getClassLoader();
        System.out.println(classLoader);
    }
}
