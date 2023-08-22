package com.atguigu12.wrapper.interview;

import org.junit.Test;

/**
* ClassName: Test1
* Package: com.atguigu12.wrapper.interview
* Description:
* @Author honghuaijie
* @Create 2023/8/15 15:29
* @Version 1.0
* 不积跬步无以至千里
*/public class Test1 {
    @Test
    public void test1(){
        Object s1 = true ? 12 : "122";
        System.out.println(s1);
    }
}
