package com.atguigu06.project.team.doman;

/**
 * ClassName: Designer
 * Package: com.atguigu06.project.team.doman
 * Description:设计师类
 *
 * @Author honghuaijie
 * @Create 2023/8/19 9:53
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Designer extends Programmer{

    private double bonus; //表示奖金

    public Designer(){}

    public Designer(int id, String name, int age, double salary,  Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }


    @Override
    public String toString() {
        return getDetails() +  "\t设计师\t" + getStatus() +  "\t\t" +
                bonus  + "\t\t" + getEquipment().getDescription();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
