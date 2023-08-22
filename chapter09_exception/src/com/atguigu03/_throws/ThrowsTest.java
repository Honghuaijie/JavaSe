package com.atguigu03._throws;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 尚硅谷-宋红康
 * @create 15:24
 */
public class ThrowsTest {

    public void method1() throws FileNotFoundException, IOException {
        File file = new File("D://hello.txt");

        FileInputStream fis = new FileInputStream(file); //可能报FileNotFoundException

        int data = fis.read(); //可能报IOException

        while (data != -1) {
            System.out.println((char) data);
            data = fis.read();  //可能报IOException
        }

        fis.close();  //可能报IOException
    }


}
