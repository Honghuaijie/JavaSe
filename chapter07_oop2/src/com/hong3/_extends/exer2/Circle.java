package com.hong3._extends.exer2;

/**
 * ClassName: Circle
 * Package: com.hong3._extends.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 13:29
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Circle {

    private double radius;



    public Circle(){
        radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }
}
