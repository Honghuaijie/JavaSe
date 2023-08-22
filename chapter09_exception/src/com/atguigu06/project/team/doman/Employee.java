package com.atguigu06.project.team.doman;

/**
 * ClassName: Employee
 * Package: com.atguigu06.project.team.view
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/19 9:51
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(){}


    public Employee(int id, String name, int age, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    protected String getDetails(){
        return id + "\t\t" + name + "\t\t" +age + "\t\t" +salary + "\t\t";
    }

    @Override
    public String toString() {
        return getDetails();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
