package com.atguigu06.project.team.doman;

/**
 * ClassName: Architect
 * Package: com.atguigu06.project.team.doman
 * Description:架构类
 *
 * @Author honghuaijie
 * @Create 2023/8/19 9:53
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Architect extends Designer{

    private int stock; //表示公司奖励的股票数量

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }


    @Override
    public String toString() {
        return getDetails() +  "\t架构师\t" + getStatus() +  "\t\t" +
                getBonus()  + "\t\t" + stock + getEquipment().getDescription();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
