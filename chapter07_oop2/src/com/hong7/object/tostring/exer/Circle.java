package com.hong7.object.tostring.exer;

/**
 * ClassName: Circle
 * Package: com.hong7.object.tostring.exer
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/8 15:49
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj instanceof Circle){
            Circle circle = (Circle) obj;
            return radius == circle.radius;
        }
        return false;
    }

    public String toString(){
        return "Circle{radius=" + radius + "}";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
