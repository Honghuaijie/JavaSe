package com.atguigu08._interface.exer2;

/**
 * ClassName: Rectangle
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 13:39
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Rectangle {
    private int weight;
    private int height;

    public Rectangle(){

    }
    public Rectangle(int weight, int height){
        this.height = height;
        this.weight = weight;
    }

    public int findArea(){
        return height * weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
