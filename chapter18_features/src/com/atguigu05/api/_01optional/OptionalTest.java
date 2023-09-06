package com.atguigu05.api._01optional;

import org.junit.Test;

import java.util.Optional;

/**
 * ClassName: OptionalTest
 * Package: com.atguigu05.api._01optional
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/9/6 16:18
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class OptionalTest {
    @Test
    public void test1(){
        String star = "迪丽热巴";
//        star = null;

        //使用optional避免空指针的问题
        //1.实例化
        //ofNullable(T value)：用来创建一个optional实例，value可能是空， 也可能非空
        Optional<String> optional = Optional.ofNullable(star);

        String otherStar = "杨幂";
        //orElse(T other):如果optional内部的value不为null，则返回value值，
        //          如果为null，为返回other

        String finalString = optional.orElse(otherStar);

        System.out.println(finalString.toString());

    }

    @Test
    public void test2(){
        String star = "迪丽热巴";
//        star = null;
        Optional<String> optional = Optional.ofNullable(star);
        //去除内部的value值（前提value不为null）
        System.out.println(optional.get());

    }
}
