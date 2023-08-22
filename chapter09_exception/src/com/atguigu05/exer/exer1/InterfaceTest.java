package com.atguigu05.exer.exer1;

/**
 * ClassName: InterfaceTest
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 13:34
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class InterfaceTest {
    public static void main(String[] args) {
        //测试半径
        ComparableCircle c1 = new ComparableCircle(3);
        ComparableCircle c2 = new ComparableCircle(4);
        Circle c3 = new Circle(3);
        try {
            System.out.println(c1.compareTo(new String("121")));
        }catch (Exception e) {
            e.printStackTrace();
        }


    }
}
