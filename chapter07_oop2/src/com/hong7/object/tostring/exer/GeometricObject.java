package com.hong7.object.tostring.exer;

/**
 * ClassName: GeometricObject
 * Package: com.hong7.object.tostring.exer
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/8 15:49
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
    protected GeometricObject(){
        color = "white";
        weight = 1.0;
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
