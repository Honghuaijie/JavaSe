package com.atguigu02.method_lifecycle.exer;

/**
 * ClassName: HapyyNewYearTest
 * Package: com.atguigu02.method_lifecycle.exer
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/22 15:53
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class HapyyNewYearTest {
    public static void main(String[] args) throws InterruptedException {
        int i;
        for (i = 10; i > 1 ; i--) {
            System.out.print(i + ",");
            Thread.sleep(1000);
        }
        System.out.println(i);
        System.out.println("新年快乐！");
    }
}


