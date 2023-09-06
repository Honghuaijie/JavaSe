package com.atguigu03.stream.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ClassName: Person
 * Package: com.atguigu03.stream.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/9/6 13:52
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Person {

    public static void main(String[] args) {
        ArrayList<String> one=new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        ArrayList<String> two=new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");

        List<String> list1 = one.stream().filter(str -> str.length() == 3).collect(Collectors.toList());
        List<String> list2 = one.stream().limit(3).collect(Collectors.toList());
        List<String> list3 = two.stream().filter(str -> str.startsWith("张")).collect(Collectors.toList());
        List<String> list4 = two.stream().filter(str -> str.startsWith("张")).skip(2).collect(Collectors.toList());

        List<Person> list5 = Stream.concat(one.stream(), two.stream()).map(Person::new).collect(Collectors.toList());



        list1.forEach(System.out::println);
        System.out.println();
        list2.forEach(System.out::println);
        System.out.println();
        list3.forEach(System.out::println);
        System.out.println();
        list4.forEach(System.out::println);
        System.out.println();
        list5.forEach(System.out::println);
        System.out.println();


    }

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
