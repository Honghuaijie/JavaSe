package com.atguigu01.file.exer2;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ClassName: Exer2
 * Package: com.atguigu01.file.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/31 10:47
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer2 {
    @Test
    public void test1(){
        File file = new File("F:\\project\\java\\JavaSECode\\chapter15_io\\src\\com\\atguigu01\\file\\exer2\\image");
        File[] files = file.listFiles();
        for (File file1: files){
            if (file1.getName().endsWith(".jpg")){
                System.out.println(file1.getName());

            }
        }
    }
    @Test
    public void test2(){
        File file = new File("F:\\project\\java\\JavaSECode\\chapter15_io\\src\\com\\atguigu01\\file\\exer2\\image");

        String[] list = file.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });

        for (String str : list){
            System.out.println(str);
        }

    }
}
