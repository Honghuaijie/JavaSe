package com.hong6.polymorphism.exer1;

/**
 * ClassName: GeometricObject
 * Package: com.hong6.polymorphism.exer1
 * Description:代表几何形状（父类）
 *
 * @Author honghuaijie
 * @Create 2023/8/8 11:04
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(String color,double weight){
        this.color = color;
        this.weight = weight;
    }
    protected GeometricObject(){}


    public double findArea(){
        return weight;
    }

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
