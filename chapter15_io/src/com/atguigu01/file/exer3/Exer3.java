package com.atguigu01.file.exer3;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: Exer3
 * Package: com.atguigu01.file.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/31 10:58
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer3 {
    @Test
    public void test1(){
        File file = new File("F:\\project\\java\\JavaSECode\\chapter15_io\\src\\com\\atguigu01\\file\\exer3\\01_课件与电子教材");

//        printFileName(file);
        System.out.println(getDirectorySize(file));
        System.out.println(fileNum);
        System.out.println(directoryNum);
//        deleteDirectory(file);
    }

    int fileNum=0;
    int directoryNum =0;

    //遍历指定文件目录下的所有文件的名称，包括子文件目录中的文件。
    public void printFileName(File file){
        if (file.isFile()){
            System.out.println(file.getName());
        }
        if (file.isDirectory()){
            System.out.println("**************");
            System.out.println(file.getParent());
            File[] files = file.listFiles();
            for (File file1: files){
                printFileName(file1);
            }
        }
    }


    //拓展2：计算指定文件目录占用空间的大小
    public long getDirectorySize(File file){//file可能是文件，也可能是文件目录
        long length = 0;
        if (file.isFile()){
            fileNum++;
            length += file.length();
        }
        if (file.isDirectory()){
            System.out.println("111");
            File[] files = file.listFiles();
            for (File file1: files){
                length += getDirectorySize(file1);
            }
        }

        return length;
    }

    //拓展1：删除指定文件目录及其下的所有文件
    public void deleteDirectory(File file) {//file可能是文件，也可能是文件目录
        if (file.isFile()){
            file.delete();

        }
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1: files){
                deleteDirectory(file1);
            }
            file.delete();
        }
    }
}
