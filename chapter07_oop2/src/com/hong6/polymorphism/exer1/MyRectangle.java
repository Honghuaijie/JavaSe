package com.hong6.polymorphism.exer1;

/**
 * ClassName: MyRectangle
 * Package: com.hong6.polymorphism.exer1
 * Description:矩形
 *
 * @Author honghuaijie
 * @Create 2023/8/8 11:05
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(double width,double height, String color,double weight){
        super(color,weight);
        this.width = width;
        this.height = height;
    }
    public MyRectangle(){}

    public double findArea(){
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
