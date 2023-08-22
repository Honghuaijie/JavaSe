package com.atguigu10._enum;

/**
 * ClassName: SeasonTest1
 * Package: com.atguigu10._enum
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/13 9:41
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class SeasonTest1 {
    public static void main(String[] args) {
//        System.out.println(Season1.AUTUNM.toString());
//        System.out.println(Season1.AUTUNM.getClass());
//        System.out.println(Season1.AUTUNM.getClass().getSuperclass());

        //1. toString
        System.out.println(Season1.AUTUNM.toString());
        //2.name
        System.out.println(Season1.WINTER.name());
        //3. values()
        Season1[] season1s = Season1.values();
        for (int i = 0; i < season1s.length; i++) {
            System.out.println(season1s[i]);
        }
        //4.valueOf()
        Season1 sea = Season1.valueOf("SPRING");
        System.out.println(sea.toString());

        //4.ordinal()
        System.out.println(Season1.WINTER.ordinal());

        //通过枚举类的对象，调用重写接口中的方法
        Season1.AUTUNM.show();
    }
}

interface Info{
    void show();
}

//JDK5.0中使用enum关键字定义枚举类
enum Season1 implements Info{
//    public  static final Season spring  = new Season("spring", "春暖花开");

    //1.必须在枚举类的开头声明对象，对象之间使用,隔开
    SPRING("spring", "春暖花开"),
    SUMMER("summer", "夏日炎炎"),
    AUTUNM("autunm", "秋高气爽"),
    WINTER("winter", "白雪皑皑");

    //2.声明属性 使用private final 修饰
    private final String seasonName; //季节的名字
    private final String seasonDesc; //季节的描述

    //3.写构造器，初始化属性
    private Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //定义get方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }


    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("这是一个季节" + seasonName);
    }
}
