package com.atguigu03.list.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: StduentTest
 * Package: com.atguigu03.list.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/26 19:31
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class StduentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List list = new ArrayList();
        int code ;
        while (true){
            System.out.print("是否记录录入 1/0:");
            code = sc.nextInt();

            if(code == 1){
                System.out.print("输入学生姓名：");
                String name = sc.next();
                System.out.print("输入学生年龄：");
                int age = sc.nextInt();
                list.add(new Student(name,age));
            }else{
                break;
            }
        }

        for (Object stu :
                list) {
            System.out.println(stu.toString());
        }
        sc.close();



    }
}
