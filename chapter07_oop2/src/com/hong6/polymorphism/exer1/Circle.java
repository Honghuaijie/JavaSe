package com.hong6.polymorphism.exer1;

/**
 * ClassName: Circle
 * Package: com.hong6.polymorphism.exer1
 * Description:圆形
 *
 * @Author honghuaijie
 * @Create 2023/8/8 11:04
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius, String color, double weight){
        super(color,weight);
        this.radius = radius;
    }


    public double findArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
