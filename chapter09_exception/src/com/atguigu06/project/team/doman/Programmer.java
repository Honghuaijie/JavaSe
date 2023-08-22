package com.atguigu06.project.team.doman;

import com.atguigu06.project.team.service.Status;

/**
 * ClassName: Programmer
 * Package: com.atguigu06.project.team.doman
 * Description:程序员类
 *
 * @Author honghuaijie
 * @Create 2023/8/19 9:53
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Programmer extends Employee{
    private int memberId; //该成员加入开发团队后在团队中的ID
    private Status status = Status.FREE;   //该成员的状态
    private Equipment equipment;  //该成员领用的设备

    public Programmer(){}

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }


    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + getStatus() + "\t\t\t\t" + equipment.getDescription();
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
