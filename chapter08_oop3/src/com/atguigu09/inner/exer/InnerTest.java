package com.atguigu09.inner.exer;

/**
 * ClassName: InnerTest
 * Package: com.atguigu09.inner.exer
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 21:04
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class InnerTest {

    public static void main(String[] args) {


        new Object(){

            public void test(){
                System.out.println("尚硅谷");
            }
        }.test();




    }
}
