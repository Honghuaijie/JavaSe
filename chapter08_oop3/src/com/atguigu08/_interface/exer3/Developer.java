package com.atguigu08._interface.exer3;

/**
 * ClassName: Developer
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 13:51
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Developer {
    private String name;
    private int age;

    public Developer(){

    }

    public Developer(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void takingVehicle(Vehicle vehicle){
            vehicle.run();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
