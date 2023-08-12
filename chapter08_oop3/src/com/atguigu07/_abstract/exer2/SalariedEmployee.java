package com.atguigu07._abstract.exer2;

/**
 * ClassName: SalariedEmployee
 * Package: com.atguigu07._abstract.exer2
 * Description:按月计算工资的员工
 *
 * @Author honghuaijie
 * @Create 2023/8/11 22:44
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee(String name ,String number, Mydate birthday, double monthlySalary ){
        super(name,number,birthday);
        this.monthlySalary = monthlySalary;
    }

    public double earnings(){
        return monthlySalary;
    }

    public double addEarn(double earn){
        if(earn > 0 ){
            this.monthlySalary +=earn;
        }

        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee[" +
                "月结工 name=" + getName() +
                "，number=" + getNumber() +
                "，monthlySalary=" + monthlySalary +
                ", birthday=" + birthday.toDateString() +
                ']';
    }
}
