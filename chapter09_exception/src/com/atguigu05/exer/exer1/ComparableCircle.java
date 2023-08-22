package com.atguigu05.exer.exer1;

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
public class ComparableCircle extends Circle implements CompareObject {

    public ComparableCircle(double radius){
        super(radius);
    }

    @Override
    public int compareTo (Object o) throws Exception {
        if(o instanceof Circle){
            Circle circle = (Circle) o;
            return Double.compare(this.getRadius(), ((Circle) o).getRadius());
        }else{
            throw new ClassMismatchException("输入的类型不匹配");
        }



    }
}
