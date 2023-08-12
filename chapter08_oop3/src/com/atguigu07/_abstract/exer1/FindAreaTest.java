package com.atguigu07._abstract.exer1;

/**
 * ClassName: FindArea
 * Package: com.atguigu07._abstract.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/11 22:33
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class FindAreaTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3,"red",2);
        System.out.println(c1.findArea());

        MyRectangle  m1 = new MyRectangle(2,3,"bLUE",2);
        System.out.println(m1.findArea());
    }
}
