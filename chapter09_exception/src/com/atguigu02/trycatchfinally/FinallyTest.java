package com.atguigu02.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 尚硅谷-宋红康
 * @create 14:32
 */
public class FinallyTest {
    @Test
    public void test1(){
        FileInputStream fis = null;
        try {

            File file = new File("hello.txt");
            fis = new FileInputStream(file); //可能报FileNotFoundException

            int data = fis.read(); //可能报IOException

            while (data !=-1){
                data = fis.read();  //可能报IOException
            }

        }
//        FileNotFoundException 是IOException 的子类，所以在IOException的上面声明
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            e.getMessage();
        }finally {
            System.out.println("读取数据结束");
            try {
                fis.close();  //可能报IOException
            }catch (IOException e){
                e.printStackTrace();
            }


        }

    }

}
