package com.atguigu08._interface.exer1;

/**
 * ClassName: American
 * Package: com.atguigu08._interface.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 13:25
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class American implements Eatable{
    @Override
    public void eat() {
        System.out.println("用刀叉吃饭");
    }
}
