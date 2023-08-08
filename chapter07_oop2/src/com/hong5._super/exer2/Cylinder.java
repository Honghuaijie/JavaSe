package com.hong5._super.exer2;

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
public class Cylinder extends Circle {
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


    //求表面积
    public double findArea(){
//        return (Math.PI * getRadius() * getRadius() * 2 )+ (2 * Math.PI * getRadius() * length);
        return super.findArea() * 2 +  (2 * Math.PI * getRadius() * length);
    }

    //求圆柱的体积
    public double findVolume(){
        return super.findArea() * length;
//        return Math.PI * getRadius() * getRadius() * length;
    }
}
