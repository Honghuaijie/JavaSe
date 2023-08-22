package com.atguigu12.wrapper.exer1;

import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName: ScoreTest
 * Package: com.atguigu12.wrapper.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/15 14:32
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ScoreTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        Vector v = new Vector();

        while (true){
            System.out.print("输入学生成绩：");
            int num = sc.nextInt();
            if(num < 0){
                break;
            }
            //添加数据到v中  obj o = Integer.valueOf(num)
            //自动装箱
            v.addElement(num);
            if(num > max){
                max = num;
            }
        }
        System.out.println("MAX:" + max);
        for (int i = 0; i < v.size(); i++) {
            //自动拆箱
            int num = (Integer) v.elementAt(i);
            int diff = max -  num;
            if(diff <= 10){
                System.out.println( num + "A等");
            }else if  (diff <=20){
                System.out.println( num + "B等");
            }else if(diff <= 30){
                System.out.println( num + "C等");
            }else {
                System.out.println( num + "D等");
            }
        }

        sc.close();

    }
}
