package com.atguigu07._abstract.exer2;

/**
 * ClassName: HourlyEmployee
 * Package: com.atguigu07._abstract.exer2
 * Description:小时工
 *
 * @Author honghuaijie
 * @Create 2023/8/11 22:54
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class HourlyEmployee extends Employee{
    private int  wage;
    private int hour;

    public HourlyEmployee(String name ,String number, Mydate birthday,int wage, int hour){
        super(name,number,birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage  * hour;
    }

    public double addEarn(double earn){
        return wage  * hour + earn;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "小时工 name=" + getName() +
                "，number=" + getNumber() +
                "，wage=" + wage +
                ", hour=" + hour +
                ", birthday=" + birthday.toDateString() +
                '}';
    }
}
