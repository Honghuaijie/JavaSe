package com.atguigu08._interface.exer2;

/**
 * ClassName: ComparableCircle
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 13:30
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double radius){
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Circle){
            Circle circle = (Circle) o;
            if(this.getRadius() == circle.getRadius()){
                return 0;
            }else if(this.getRadius() > circle.getRadius()){
                return 1;
            }else {
                return -1;
            }
        }
        return -1;

    }
}
