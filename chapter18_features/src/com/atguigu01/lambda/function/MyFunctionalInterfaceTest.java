package com.atguigu01.lambda.function;

import org.junit.Test;

/**
 * ClassName: MyFunctionalInterfaceTest
 * Package: com.atguigu01.lambda.function
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/9/5 19:06
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class MyFunctionalInterfaceTest {
    @Test
    public void test1(){
        MyFunctionalInterface my = () -> System.out.println("你好");
        my.method();
    }
}
