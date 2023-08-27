package com.atguigu03.list.exer1;

import java.util.Objects;

/**
 * ClassName: Student
 * Package: com.atguigu03.list.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/26 19:30
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Student {
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
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
