package com.atguigu08._interface.exer2;

/**
 * ClassName: ComparableRectangle
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 13:41
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ComparableRectangle extends Rectangle implements CompareObject{


    public ComparableRectangle(int weight, int height){
        super(weight,height);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Rectangle){
            Rectangle r1 = (Rectangle) o;
            if(this.findArea() == r1.findArea()){
                return 0;
            }else if(this.findArea() > r1.findArea()){
                return 1;
            }else{
                return -1;
            }
        }

        return -2;
    }
}
