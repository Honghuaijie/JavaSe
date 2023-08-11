package com.atguigu01._static.apply;

/**
 * ClassName: CircleTest
 * Package: com.atguigu01._static.apply
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/9 10:32
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(Circle.getTotal());

    }
}


class Circle{
    private int id;
    private double radius;

    private static int total; //记录 当前类创建实例的个数
    static int init = 1001; //设置ID的中间变量

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }

    Circle(){
        this.id = init;
        init++;
        total++;
    }

    Circle(double radius){
        this();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + id +
                ", radius=" + radius +
                '}';
    }
}