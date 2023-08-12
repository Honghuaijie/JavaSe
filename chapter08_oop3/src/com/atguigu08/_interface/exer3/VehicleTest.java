package com.atguigu08._interface.exer3;

/**
 * ClassName: VehicleTest
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 14:04
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class VehicleTest {
    public static void main(String[] args) {
        Developer d1 = new Developer("hong",20);
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("安特","white");
        vehicles[1] = new ElectricVehicle("雅迪","white");
        vehicles[2] = new Car("奔驰","white","01");
        for (int i = 0; i < vehicles.length; i++) {
            d1.takingVehicle(vehicles[i]);
            if(vehicles[i] instanceof IPower){
                ((IPower) vehicles[i]).power();
            }
        }

    }
}
