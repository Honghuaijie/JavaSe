package com.atguigu07._abstract.exer2;

/**
 * ClassName: Employee
 * Package: com.atguigu07._abstract.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/11 22:36
 * @Version 1.0
 * 不积跬步无以至千里
 */
public abstract class Employee {
    private String name;
    private  String number;
    Mydate birthday;

    Employee(){

    }

    public Employee(String name, String number , Mydate birthday){
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public abstract double earnings();

    public abstract double addEarn(double earn);

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }
}
