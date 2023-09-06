package com.atguigu01.use.exer1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName: Exer1
 * Package: com.atguigu01.use.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/28 9:43
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer1 {
    public static void main(String[] args) {
        Comparator<Employee> comparator= new Comparator<>(){


            //按生日日期的先后顺序
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1 == o2){
                    return 0;
                }
                int year = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if(year != 0){
                    return year;
                }

                int month = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if(month != 0){
                    return month;
                }

                int day = o1.getBirthday().getDay() - o2.getBirthday().getDay();

                if(day != 0){
                    return month;
                }

                return o1.getName().compareTo(o2.getName());
            }
        };

        TreeSet<Employee> treeSet = new TreeSet<>(comparator);

        Employee employee1 = new Employee("Zom",20,new Mydate(2003,7,23));
        Employee employee2 = new Employee("Jerry",19,new Mydate(2003,12,14));
        Employee employee3 = new Employee("Doinb",25,new Mydate(1998,2,21));
        Employee employee4 = new Employee("Tian",28,new Mydate(1995,9,23));
        Employee employee5 = new Employee("TheShy",22,new Mydate(2001,10,1));
        Employee employee6 = new Employee("Rookiy",22,new Mydate(2001,10,1));


//        treeSet = (TreeSet<Employee>) Arrays.asList(new Employee[]{employee1,employee2,employee3,employee4,employee5});
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);
        treeSet.add(employee5);
        treeSet.add(employee5);
        treeSet.add(employee6);

        Iterator<Employee> iterator = treeSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
