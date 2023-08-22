package com.atguigu10._enum.exer3;

/**
 * ClassName: ColorTest1
 * Package: com.atguigu10._enum.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/13 11:07
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ColorTest1 {
    public static void main(String[] args) {
        System.out.println(Color1.GREEN);
    }
}

enum Color1{
    RED(255,0,0,"红色"),
    ORANGE(255,128,0,"橙色"),
    YELLOW(255,255,0,"黄色"),
    GREEN(0,255,0,"绿色"),
    CYAN(0,255,255,"青色"),
    BLUE(0,0,255,"蓝色"),
    PURPLE(128,0,255,"紫色");
    private final int red;
    private final int green;
    private final int blue;

    private final String description;

    Color1(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    @Override
    public String toString() {
        return name() + "(" + red + "," + green + "," + blue + ")->" + description;
    }
}
