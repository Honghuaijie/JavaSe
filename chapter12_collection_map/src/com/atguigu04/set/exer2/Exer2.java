package com.atguigu04.set.exer2;

import org.junit.Test;

import java.util.HashSet;

/**
 * ClassName: Exer2
 * Package: com.atguigu04.set.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/27 10:42
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer2 {
    @Test
    public void test1(){
        HashSet set = new HashSet();

        while (set.size()<10){
            int rand = (int)(Math.random() * 10) +1;
            set.add(rand);
        }

        System.out.println(set);

    }
}
