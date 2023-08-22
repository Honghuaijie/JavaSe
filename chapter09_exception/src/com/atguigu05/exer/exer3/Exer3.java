package com.atguigu05.exer.exer3;

/**
 * ClassName: Exer3
 * Package: com.atguigu05.exer.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/18 20:46
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer3 {
    public static void main(String[] args) {
//        ① 使用满参构造方法创建Person对象，生命值传入一个负数
//        try {
//            Person p1 = new Person("hong",-10);
//            System.out.println(p1.toString());
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//        ② 使用空参构造创建Person对象
//        调用setLifeValue(int lifeValue)方法,传入一个正数,运行程序
//        调用setLifeValue(int lifeValue)方法,传入一个负数,运行程序

        Person p2 = new Person();
//        try {
            p2.setLifeValue(10);
            p2.setLifeValue(-10);
//        }catch (Exception e){
//            e.printStackTrace();
//        }


    }
}
