package com.atguigu07._abstract.exer2;

import java.util.Scanner;

/**
 * ClassName: PayrollSystem
 * Package: com.atguigu07._abstract.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/11 23:01
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Employee[] employees = new Employee[2];
        employees[0] = new SalariedEmployee("hong","0001",new Mydate(2002,06,22),2000);
        employees[1] = new HourlyEmployee("wang","0002",new Mydate(2003,02,22),20,20);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            System.out.print("输入本月月份值：");
            int month = sc.nextInt();
            if(month == employees[i].getBirthday().getMonth()){
                System.out.println(employees[i].addEarn(100));
                System.out.println("增加工资100元");
            }
        }
    }
}
