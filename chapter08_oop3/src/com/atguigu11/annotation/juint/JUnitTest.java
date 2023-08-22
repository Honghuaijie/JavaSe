package com.atguigu11.annotation.juint;

import org.junit.Test;

import java.util.Scanner;

/**
 *
 * @author shkstart
 * @create 14:34
 */
public class JUnitTest {

    @Test
    public void test1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个数：");
        int num  = sc.nextInt();
        System.out.println(num);
    }

    @Test
    public void test2(){
        System.out.println("11");
    }


}
