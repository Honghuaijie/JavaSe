package com.atguigu02.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 尚硅谷-宋红康
 * @create 11:50
 */
public class ExceptionHandleTest {



    @Test
    public void test3() {

        try {

            File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream(file); //可能报FileNotFoundException

            int data = fis.read(); //可能报IOException

            while (data !=-1){
//                System.out.println((char)data);
                data = fis.read();  //可能报IOException
            }

            fis.close();  //可能报IOException
        }
//        FileNotFoundException 是IOException 的子类，所以在IOException的上面声明
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        catch (IOException e){
            e.getMessage();
        }

        System.out.println("读取数据结束");
    }

    @Test
    public void test4(){
        System.out.println(show1());
    }

    public  int show1(){
        try {
            int a = 10;
            System.out.println(a / 0);
        }catch (ArithmeticException e){
            return 10;
        }finally {
            System.out.println("show1");
        }
        return 20;
    }


}
