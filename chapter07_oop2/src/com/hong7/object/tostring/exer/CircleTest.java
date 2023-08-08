package com.hong7.object.tostring.exer;

/**
 * ClassName: CircleTest
 * Package: com.hong7.object.tostring.exer
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/8 15:57
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(3,"red",3);
        Circle c3 = new Circle(2,"red",3);

        System.out.println(c1.getWeight() == c2.getWeight());
        System.out.println(c1.equals(c3));
        System.out.println(c1.toString());
    }
}
