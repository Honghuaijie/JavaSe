package com.atguigu10._enum;

/**
 * ClassName: SeasonTest
 * Package: com.atguigu10._enum
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/13 9:21
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.winter.toString());
        Season.autunm.getSeasonName();
    }
}

//JDK5.0之前定义枚举类
class Season{
    //声明属性
    private final String seasonName; //季节的名字
    private final String seasonDesc; //季节的描述

    //写构造器，初始化属性
    private Season(String seasonName,String seasonDesc){
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

    //4创建当前类的实例
    public  static final Season spring  = new Season("spring", "春暖花开");
    public  static final Season summer  = new Season("summer", "夏日炎炎");
    public  static final Season autunm  = new Season("autunm", "秋高气爽");
    public  static final Season winter  = new Season("winter", "白雪皑皑");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}

