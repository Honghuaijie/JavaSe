package com.atguigu08._interface.exer2;

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
        System.out.println(c1.compareTo(c3));

        //测试面积
        ComparableRectangle r1 = new ComparableRectangle(2,4);
        ComparableRectangle r2 = new ComparableRectangle(2,2);
        System.out.println(r1.compareTo(r2));
    }
}
