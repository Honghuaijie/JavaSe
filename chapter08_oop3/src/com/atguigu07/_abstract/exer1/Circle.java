package com.atguigu07._abstract.exer1;

/**
 * ClassName: Circle
 * Package: com.atguigu07._abstract.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/11 22:29
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Circle extends GeometricObject{

    private double radius;
    public Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }

    public double findArea(){
        return radius * Math.PI * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
