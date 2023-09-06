package com.atguigu03.stream;

import com.atguigu02.reference.data.Employee;
import com.atguigu02.reference.data.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 测试Stream的终止操作
 *
 * @author 尚硅谷-宋红康
 */
public class StreamAPITest2 {

    //1-匹配与查找
    @Test
    public void test1(){
//        allMatch(Predicate p)——检查是否匹配所有元素。
//          练习：是否所有的员工的年龄都大于18
        List<Employee> list = EmployeeData.getEmployees();
        System.out.println(list.stream().allMatch(emp -> emp.getAge() > 18));
//          练习：是否至少有一个员工的年龄大于18
        System.out.println(list.stream().anyMatch(emp -> emp.getAge() > 18));

//        anyMatch(Predicate p)——检查是否至少匹配一个元素。
//         练习：是否存在员工的工资大于 10000
        System.out.println(list.stream().anyMatch(amp -> amp.getSalary() > 10000));

//        findFirst——返回第一个元素
        System.out.println(list.stream().findFirst().get());

    }

    @Test
    public void test2(){
        // count——返回流中元素的总个数
        List<Employee> list = EmployeeData.getEmployees();
        System.out.println(list.stream().filter(emp -> emp.getSalary() > 7000).count());

//        max(Comparator c)——返回流中最大值
//        练习：返回最高的工资：
        System.out.println(list.stream().max((emp1, emp2) -> Double.compare(emp1.getSalary(),emp2.getSalary())).get());
        System.out.println(list.stream().map(Employee::getSalary).max((sal1, sal2) -> Double.compare(sal1, sal2)).get());
        System.out.println(list.stream().map(Employee::getSalary).max(Double :: compare).get());

        System.out.println();
        //        min(Comparator c)——返回流中最小值
//        练习：返回最低工资的员工
        System.out.println(list.stream().max((emp1, emp2) -> -(int) (emp1.getSalary() - emp2.getSalary())).get());
        System.out.println(list.stream().map(Employee::getSalary).min(Double :: compare).get());

        System.out.println();
//        forEach(Consumer c)——内部迭代
        list.stream().forEach(System.out::println);

        //针对于集合，JDK8中增加了一个遍历方法
        list.forEach(System.out::println);
        //针对于list来说，遍历的方式有①Iterator ②增强for循环 ③一般for ④内部foreach
    }

    //2-归约
    @Test
    public void test3(){
//        reduce(T identity, BinaryOperator)——可以将流中元素反复结合起来，得到一个值。返回 T
//        练习1：计算1-10的自然数的和
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list.stream().reduce(0, (i1, i2) -> i1 + i2));
        System.out.println(list.stream().reduce(0, Integer:: sum));

        //

//        reduce(BinaryOperator) ——可以将流中元素反复结合起来，得到一个值。返回 Optional<T>
//        练习2：计算公司所有员工工资的总和
        List<Employee> list1 = EmployeeData.getEmployees();
        System.out.println(list1.stream().map(Employee::getSalary).reduce(Double::sum));

    }

    //3-收集
    @Test
    public void test4(){
//        collect(Collector c)——将流转换为其他形式。接收一个 Collector接口的实现，用于给Stream中元素做汇总的方法
//        练习1：查找工资大于6000的员工，结果返回为一个List或Set
        List<Employee> list1 = EmployeeData.getEmployees();
        List<Employee> collect = list1.stream().filter(emp -> emp.getSalary() > 6000).collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println();
//        练习2：按照员工的年龄进行排序，返回到一个新的List中
        List<Employee> list2 = list1.stream().sorted((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())).collect(Collectors.toList());
        list2.forEach(System.out::println);
    }
}
