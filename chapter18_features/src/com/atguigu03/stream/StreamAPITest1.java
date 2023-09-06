package com.atguigu03.stream;

import com.atguigu02.reference.data.Employee;
import com.atguigu02.reference.data.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 测试Stream的中间操作
 *
 * @author 尚硅谷-宋红康
 */
public class StreamAPITest1 {

    //1-筛选与切片
    @Test
    public void test1() {
        List<Employee> list = EmployeeData.getEmployees();
//        1.filter(Predicate p)——接收 Lambda ， 从流中排除某些元素。
        //练习：查询员工表中薪资大于7000的员工信息
        Stream<Employee> stream = list.stream();
        stream.filter(emp -> emp.getSalary() > 7000).forEach(System.out::println);

        System.out.println();
//        2.limit(n)——截断流，使其元素不超过给定数量。
        //错误的，因为Stream已经执行了终止操作，就不可以再调用其他的中间操作或终止操作了
        //stream.limit(2).forEach(System.out::println);
        list.stream().filter(emp -> emp.getSalary() > 7000).limit(2).forEach(System.out::println);

        System.out.println();
//        3.skip(n) —— 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。
//              与 limit(n) 互补
        list.stream().skip(2).limit(1).forEach(System.out::println);

        System.out.println();
//        4.distinct()——筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素
        list.stream().distinct().forEach(System.out::println);

    }

    //映射
    @Test
    public void test2() {
        //map(Function f)——接收一个函数作为参数，将元素转换成其他形式或提取信息，该函数会被应用到每个元素上，并将其映射成一个新的元素。
        //练习：转换为大写
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(s1 -> s1.toUpperCase()).forEach(System.out::println);
        list.stream().map(String :: toUpperCase).forEach(System.out::println);


        //练习：获取员工姓名长度大于3的员工
        List<Employee> list1 = EmployeeData.getEmployees();
        list1.stream().filter(emp -> emp.getName().length() > 3).forEach(System.out::println);
        //练习：获取员工姓名长度大于3的员工的姓名。
        list1.stream().filter(emp -> emp.getName().length() > 3).map(Employee::getName).forEach(System.out::println);
        list1.stream().filter(emp -> emp.getName().length() > 3).map(emp -> emp.getName()).forEach(System.out::println);
        list1.stream().map(emp -> emp.getName()).filter(name -> name.length() > 3).forEach(System.out::println);

    }

    //3-排序
    @Test
    public void test3() {
        //sorted()——自然排序
        Integer[] arr = new Integer[]{345,3,64,3,46,7,3,34,65,68};
        String[] arr1 = new String[]{"aa","GG","DD","MM","SS","JJ"};
        Arrays.stream(arr).sorted().forEach(System.out::println);

        //arr数组并没有因为升序而改变
        System.out.println(Arrays.toString(arr));

        //因为Employee并没有实现comparable接口所以无法自然排序
//        List<Employee> list = EmployeeData.getEmployees();
//        list.stream().sorted().forEach(System.out::println);

        //sorted(Comparator com)——定制排序
        List<Employee> list = EmployeeData.getEmployees();
        list.stream().sorted((e1,e2) -> e1.getAge()-e2.getAge()).forEach(System.out::println);
        Arrays.stream(arr1).sorted((s1,s2) -> s1.compareTo(s2)).forEach(System.out::println);
    }
}
