package com.atguigu03.list.exer3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: Exer0302
 * Package: com.atguigu03.list.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/26 20:48
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer0302 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //        创建歌曲列表集合
//        List list = new LinkedList(); //10882
        List list = new ArrayList();  //7558
        list.add("歌曲1");
        list.add("歌曲2");
        list.add("歌曲3");

        Scanner sc  = new Scanner(System.in);
        int scNum ;
        boolean flag = true;
        while (flag){
            int num = 0;
            for (Object str : list){
                System.out.println(num++ + "、" + str);
            }
            System.out.println("-------------欢迎来到点歌系统------------");
            System.out.println("1.添加歌曲至列表");
            System.out.println("2.将歌曲置顶");
            System.out.println("3.将歌曲前移一位");
            System.out.println("4.退出");
            System.out.print("请输入指令:");
            scNum = sc.nextInt();
            switch (scNum){
                case 1:{ //添加歌曲至列表
                    System.out.print("请输入要添加的歌曲名字:");
                    String songName = sc.next();
                    list.add(songName);
                }break;
                case 2:{ //将歌曲置顶
                    System.out.print("请输入要指定的歌曲编号:");
                    int code = sc.nextInt();
                    Object str = list.get(code);
                    list.remove(code);
                    list.add(0,str);
                    System.out.println("添加成功");
                }break;
                case 3:{//将歌曲前移一位
                    System.out.print("请输入要前移的歌曲编号:");
                    int code = sc.nextInt();
                    Object str = list.get(code);
                    list.remove(code);
                    list.add(code-1,str);
                    System.out.println("前移成功");

                }break;
                case 4:flag = false;

            }
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
