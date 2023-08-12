package com.atguigu07._abstract.exer1;

/**
 * ClassName: GeometricObject
 * Package: com.atguigu07._abstract.exer1
 * Description: 几何类
 *
 * @Author honghuaijie
 * @Create 2023/8/11 22:27
 * @Version 1.0
 * 不积跬步无以至千里
 */
public abstract class GeometricObject {
    protected String color;
    protected  double weight;

    protected GeometricObject(){

    }
    protected GeometricObject(String color,double weight){
        this.color = color;
        this.weight = weight;
    }

    //计算面积
    public abstract double findArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
