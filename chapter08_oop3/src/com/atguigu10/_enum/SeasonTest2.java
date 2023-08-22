package com.atguigu10._enum;

/**
 * ClassName: SeasonTest2
 * Package: com.atguigu10._enum
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/13 10:29
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class SeasonTest2 {
    public static void main(String[] args) {
        Season2.WINTER.show();
        Season2.AUTUNM.show();
    }
}



interface Info1{
    void show();
}

//JDK5.0中使用enum关键字定义枚举类
enum Season2 implements Info1{
    //1.必须在枚举类的开头声明对象，对象之间使用,隔开
    SPRING("spring", "春暖花开"){
        @Override
        public void show() {
            System.out.println("这是春天");
        }
    },
    SUMMER("summer", "夏日炎炎"),
    AUTUNM("autunm", "秋高气爽"),
    WINTER("winter", "白雪皑皑"){
        @Override
        public void show() {
            System.out.println("这是冬天");
        }
    };

    //2.声明属性 使用private final 修饰
    private final String seasonName; //季节的名字
    private final String seasonDesc; //季节的描述

    //3.写构造器，初始化属性
    private Season2(String seasonName,String seasonDesc){
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
        return "Season2{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("这是一个季节" + seasonName);
    }
}

