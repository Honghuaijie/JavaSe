package com.atguigu05.other;

import org.junit.Test;

/**
 * ClassName: OtherAPItest
 * Package: com.atguigu05.other
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/26 10:18
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class OtherAPItest {


    @Test
    public void test3(){
        //技巧： floor(x + 0.5)
        System.out.println(Math.round(12.3));
        System.out.println(Math.round(12.5));
        System.out.println(Math.round(-12.3));
        System.out.println(Math.round(-12.6));
        System.out.println(Math.round(-12.5));
    }
}
