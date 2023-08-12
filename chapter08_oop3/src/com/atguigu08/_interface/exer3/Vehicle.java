package com.atguigu08._interface.exer3;

/**
 * ClassName: Vehicle
 * Package: com.atguigu08._interface.exer3
 * Description:交通工具类
 *
 * @Author honghuaijie
 * @Create 2023/8/12 13:53
 * @Version 1.0
 * 不积跬步无以至千里
 */
public abstract class Vehicle {
    private String brand;
    private String color;

    public Vehicle(String brand,String color){
        this.brand = brand;
        this.color = color;
    }

    public abstract void run();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
