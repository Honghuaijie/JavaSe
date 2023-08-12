package com.atguigu08._interface.exer1;

/**
 * ClassName: EatableTest
 * Package: com.atguigu08._interface.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 13:26
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatables = new Eatable[3];
        //接口类型 = 实现类对象
        eatables[0] = new Chinese();
        eatables[1] = new American();
        eatables[2] = new Indian();
        for (int i = 0; i < eatables.length ; i++) {
            eatables[i].eat();
        }

    }
}
