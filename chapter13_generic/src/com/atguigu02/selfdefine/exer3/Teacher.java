package com.atguigu02.selfdefine.exer3;

/**
 * ClassName: Teacher
 * Package: com.atguigu02.selfdefine.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/28 13:13
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Teacher {
    public static void main(String[] args) {
        Student<String>literatureScore = new Student<>("Tom","优秀");
        Student<Float>mathScore = new Student<>("Tom",89.5f);
        Student<Character>EghlishScore = new Student<>("Tom",'A');

    }
}
