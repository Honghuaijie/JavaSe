package com.atguigu01.use.exer1;

/**
 * ClassName: Employee
 * Package: com.atguigu01.use.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/28 9:41
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private Mydate birthday;



    public Employee(String name, int age, Mydate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
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

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }


    //按name排序
    @Override
    public int compareTo(Employee o) {
        if(this == o){
            return  0;
        }

        return this.name.compareTo(o.name);
    }
}
