package com.atguigu07._abstract.exer1;

/**
 * ClassName: MyRectangle
 * Package: com.atguigu07._abstract.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/11 22:31
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(double width, double height, String color,double weight){
        super(color,weight);
        this.width = width;
        this.height = height;
    }


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
