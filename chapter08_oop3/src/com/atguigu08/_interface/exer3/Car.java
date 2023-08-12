package com.atguigu08._interface.exer3;

/**
 * ClassName: Car
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 13:59
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Car extends Vehicle implements IPower{
    private String carNumber;
    public Car(String brand,String color,String carNumber){
        super(brand,color);
        this.carNumber = carNumber;
    }


    @Override
    public void run() {
        System.out.println("开奔驰轿车");
    }
    public void power(){
        System.out.println("加油");
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
