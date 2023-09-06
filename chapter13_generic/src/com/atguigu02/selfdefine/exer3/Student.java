package com.atguigu02.selfdefine.exer3;

/**
 * ClassName: Student
 * Package: com.atguigu02.selfdefine.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/28 13:13
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Student<T> {
    String name;
    T score;

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
