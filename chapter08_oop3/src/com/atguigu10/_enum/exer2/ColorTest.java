package com.atguigu10._enum.exer2;

/**
 * ClassName: ColorTest
 * Package: com.atguigu10._enum.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/13 11:06
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ColorTest {
    public static void main(String[] args) {
        Color[] colors = Color.values();
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
    }
}

enum Color{
    RED,ORANGE,YELLOW,GREEN,CYAN,BLUE,PURPLE;
}