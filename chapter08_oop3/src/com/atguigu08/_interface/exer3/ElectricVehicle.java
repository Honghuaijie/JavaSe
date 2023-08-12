package com.atguigu08._interface.exer3;

/**
 * ClassName: ElectricVehicle
 * Package: com.atguigu08._interface.exer3
 * Description:电动车类
 *
 * @Author honghuaijie
 * @Create 2023/8/12 13:58
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle(String brand,String color){
        super(brand,color);
    }

    @Override
    public void run() {
        System.out.println("骑电动车");
    }

    public void power(){
        System.out.println("充电");
    }
}
