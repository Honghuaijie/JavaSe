package com.atguigu04.set;

import java.util.Objects;

/**
 * ClassName: Person
 * Package: com.atguigu01.collection
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/26 15:03
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Person {
    String name;
    int age;

    public void eat(){
        System.out.println("人吃饭");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //equals和hashCode打配合，equals判断条件是name和age相等，那hashcode生成一个基于name和age的hash值。
    //  如果两个对象的name和age相等，那么他们的hash值也相等
    @Override
    public boolean equals(Object o) {
        System.out.println("Person------");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }




    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
