package com.hong3._extends.exer2;

/**
 * ClassName: Cylinder
 * Package: com.hong3._extends.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 13:31
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Cylinder extends Circle{
    private double length;

    public Cylinder(){
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return findArea() * length;
    }
}
