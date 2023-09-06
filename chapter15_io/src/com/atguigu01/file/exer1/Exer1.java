package com.atguigu01.file.exer1;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: Exer1
 * Package: com.atguigu01.file.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/31 10:40
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer1 {
    @Test
    public void test1() throws IOException {
        File file = new File("hello.txt");
        File file1 = new File(file.getAbsoluteFile().getParent(),"abc.txt");
        System.out.println(file.getAbsoluteFile().getParent());
        System.out.println(file1.createNewFile());
    }
}
