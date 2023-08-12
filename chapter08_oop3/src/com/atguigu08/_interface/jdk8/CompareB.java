package com.atguigu08._interface.jdk8;

/**
 * ClassName: CompareB
 * Package: com.atguigu08._interface.jdk8
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 17:05
 * @Version 1.0
 * 不积跬步无以至千里
 */
public interface CompareB {
    public default void method3(){
        System.out.println("CompareB:method3");
    }
}
