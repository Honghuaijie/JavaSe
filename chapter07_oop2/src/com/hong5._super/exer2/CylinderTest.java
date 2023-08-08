package com.hong5._super.exer2;


/**
 * ClassName: CylinderTest
 * Package: com.hong4._extends.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 13:34
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        //改变半径值
        c1.setRadius(2);
        //改变高
        c1.setLength(2);
        System.out.println(c1.findVolume());
        System.out.println(c1.findArea());
    }
}
