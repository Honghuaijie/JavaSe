package com.atguigu06.project.team.view;

import com.atguigu06.project.team.doman.Architect;
import com.atguigu06.project.team.doman.Designer;
import com.atguigu06.project.team.doman.Employee;
import com.atguigu06.project.team.doman.Programmer;
import com.atguigu06.project.team.service.NameListService;
import com.atguigu06.project.team.service.TeamException;
import com.atguigu06.project.team.service.TeamService;

/**
 * ClassName: TeamView
 * Package: com.atguigu06.project.team.view
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/19 12:07
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class TeamView {

    public static void main(String[] args) {
        TeamView tv = new TeamView();
        tv.enterMainMenu();
    }
    private NameListService listSvc = new NameListService();  //公司成员列表
    private TeamService teamSvc = new TeamService();  //团队成员列表



    //主界面显示及控制方法
    public void enterMainMenu(){
        Boolean falg = true;
        while (falg){
            listAllEmployees();
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
            char code = TSUtility.readMenuSelection();
            switch (code){
                case '1':  getTeam();break;
                case '2':  addMember();break;
                case '3':  {
                    try {
                        deleteMember();
                    }catch (TeamException e){
                        System.out.println("添加失败，原因：" + e.getMessage());
                    }

                    break;}
                case '4':  {
                    System.out.print("确定要退出嘛？Y/N：");
                    char isExit = TSUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        falg = false;
                    }
                }
            }
            TSUtility.readReturn();
        }
    }

    //以表格形式列出公司所有成员
    private void listAllEmployees(){
        Employee[] employees = listSvc.getAllEmployees();
        System.out.println("-----------------------------------优尚开发团队调度系统------------------------------------");
        System.out.println("ID\t\t姓名\t\t\t年龄\t\t\t工资\t\t\t职位\t\t\t状态\t\t\t奖金\t\t\t股票\t\t\t领用设备");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
        System.out.println("----------------------------------------------------------------------------------------------\n");
    }

    //显示团队成员列表操作
    private void getTeam(){
        System.out.println("--------------------团队成员列表---------------------");
        System.out.println("TDI/ID\t姓名\t\t\t年龄\t\t工资\t\t\t职位\t\t\t奖金\t\t\t股票");
        Programmer[] programmers = teamSvc.getTeam();
        if(programmers.length == 0){
            System.out.println("开发团队目前没有成员");
        }
        for (int i = 0; i < programmers.length; i++) {
            int id = programmers[i].getId();
            String name = programmers[i].getName();
            int age = programmers[i].getAge();
            double salary = programmers[i].getSalary();

            System.out.print( programmers[i].getMemberId() + "/" + id  + "\t\t" +
                    name + "\t\t" +
                    age + "\t\t" +
                    salary + "\t\t");

            if(programmers[i] instanceof Architect){
                Architect a = (Architect) programmers[i];
                System.out.print(
                        "架构师" + "\t\t" +
                                a.getBonus() + "\t\t" +
                                a.getStock()
                );
            }else if (programmers[i] instanceof Designer){
                Designer d = (Designer) programmers[i];
                System.out.print(
                        "设计师" + "\t\t" +
                                d.getBonus()
                );
            }else{
                System.out.print(
                        "程序员"
                );
            }
            System.out.println();

        }
        System.out.println("-----------------------------------------------------");
    }

    //实现添加成员操作
    private void addMember(){
        Employee[] employees = listSvc.getAllEmployees();
        int i;
        System.out.println("---------------------添加成员---------------------");
        System.out.print("请输入要添加的员工ID：");
        int id = TSUtility.readInt();
        try {
            teamSvc.addMember(listSvc.getEmployee(id));
        }catch (TeamException e){
            System.out.println("添加失败，原因：" + e.getMessage());
        }
    }

    //实现删除成员操作
    private void deleteMember() throws TeamException {
        Programmer[] teams = teamSvc.getTeam(); //获取团队成员
        System.out.println("---------------------删除成员---------------------");
        System.out.print("请输入要删除员工的TID：");
        int tid = TSUtility.readInt();

        System.out.print("确认是否删除(Y/N)：");
        char isDelete = TSUtility.readConfirmSelection();
        if(isDelete == 'Y'){
            teamSvc.removeMemer(tid);
        }

    }


}
