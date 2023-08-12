package com.atguigu08._interface.exer3;

/**
 * ClassName: Bicycle
 * Package: com.atguigu08._interface.exer3
 * Description:自行车
 *
 * @Author honghuaijie
 * @Create 2023/8/12 13:55
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Bicycle extends Vehicle{
    public Bicycle(String brand,String color){
        super(brand,color);
    }

    @Override
    public void run() {
        System.out.println("骑自行车");
    }
}
