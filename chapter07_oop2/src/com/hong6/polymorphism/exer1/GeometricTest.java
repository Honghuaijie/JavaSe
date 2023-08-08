package com.hong6.polymorphism.exer1;

/**
 * ClassName: GeometricTest
 * Package: com.hong6.polymorphism.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/8 11:15
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest gg  = new GeometricTest();

        Circle c1 = new Circle(2,"red",3.22);
        Circle c2 = new Circle(2,"red",3.22);
        Circle c3 = new Circle(3,"red",3.22);

        MyRectangle m1 = new MyRectangle(2,3,"blue",3.33);
        MyRectangle m2 = new MyRectangle(2,3,"blue",3.33);
        MyRectangle m3 = new MyRectangle(3,3,"blue",3.33);


        gg.equalsArea(c1,c2);
        gg.equalsArea(c1,c3);
        gg.equalsArea(c1,m1);

        gg.displayGeometricObject(c1);
        gg.displayGeometricObject(m1);

    }

    //因为不知道传进来的是矩形还是圆形，使用引用类型选用他们的父类
    public void equalsArea(GeometricObject g1, GeometricObject g2){
        if(g1.findArea() == g2.findArea()){
            System.out.println("面积相等");
        }else{
            System.out.println("面积不等");

        }
    }

    public void displayGeometricObject(GeometricObject g1){
        System.out.println(g1.findArea()); //动态方法：编译的时候是父类的方法，运行的时候是子类方法
        //静态方法：编译是这个方法，运行还是这个方法
    }
}
