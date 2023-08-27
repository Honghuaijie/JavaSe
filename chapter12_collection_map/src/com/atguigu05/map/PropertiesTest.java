package com.atguigu05.map;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * ClassName: PropertiesTest
 * Package: com.atguigu05.map
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/27 14:58
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class PropertiesTest {
    @Test
    public void test1() throws IOException {

        //方式1：数据和代码都写在一起，耦合度高

        //方式2：将数据封装到具体的配置文件中，在程序中读取配置文件中的信息。实现了
        //数据和代码的解耦；由于我们没有修改代码，就省去了重新编译和打包的过程
        File file = new File("info.properties");  //要提前创建好
//        System.out.println(file.getAbsoluteFile());

        FileInputStream fis = new FileInputStream(file);

        Properties pros = new Properties();
        pros.load(fis);

        //读取数据
        String name = pros.getProperty("name");
        String pwd = pros.getProperty("password");

        System.out.println(name + ": " + pwd);

        fis.close();
    }
}
