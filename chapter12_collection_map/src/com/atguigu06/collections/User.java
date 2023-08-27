package com.atguigu06.collections;

import java.util.Objects;

/**
 * ClassName: User
 * Package: com.atguigu05.map
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/27 14:41
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class User implements Comparable{
    String name;
    int age;




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

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if( this == o){
            return 0;
        }

        if(o instanceof User){
            User u1 = (User) o;
            int value = this.age - u1.age;
            if(value != 0){
                return value;
            }
            return this.getName().compareTo(u1.getName());
        }

        throw new RuntimeException("类型不匹配");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
