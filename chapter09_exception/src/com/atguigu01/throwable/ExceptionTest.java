package com.atguigu01.throwable;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 尚硅谷-宋红康
 * @create 10:39
 */
public class ExceptionTest {

    /**
     * ArrayIndexOutOfBoundsException
     */
    @Test
    public void test1(){
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }



    /*
    NullPointerException
     */
    @Test
    public void test2(){
//        String s1 = "12334";
//        s1 = null;
//        System.out.println(s1.toString());

//        Object o1 = null;
//        System.out.println(o1.toString());

        int [] arr1 = new int[10];
        arr1 = null;
        System.out.println(arr1);

//        int[][] arr = new int[10][];
//        System.out.println(arr[0][0]);
    }

    /**
     * ClassCastException
     */
    @Test
    public void test3(){
        Object o1 = new Object();

        Date date = (Date) o1;
    }

    /**
     * NumberFormatException
     */
    @Test
    public void test4(){
        String s1 = "123";
        s1="abc";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);
    }


    /**
     * InputMismatchException  输入不匹配异常
     */

    @Test
    public void test5(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);
    }


    /**
     * ArithmeticException  算术异常
     */

    @Test
    public void test6(){
        int num = 10;
        System.out.println(num / 0);
    }


    //***********************以上是运行时异常，以下是编译时异常**********************************************


    @Test
    public void test7() throws FileNotFoundException, IOException {
        File file = new File("D://hello.txt");

        FileInputStream fis = new FileInputStream(file); //可能报FileNotFoundException

        int data = fis.read(); //可能报IOException

        while (data !=-1){
            System.out.println((char)data);
            data = fis.read();  //可能报IOException
        }

        fis.close();  //可能报IOException
    }


}
