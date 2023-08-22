package com.atguigu06.project.team.service;

import com.atguigu06.project.team.doman.Architect;
import com.atguigu06.project.team.doman.Designer;
import com.atguigu06.project.team.doman.Employee;
import com.atguigu06.project.team.doman.Programmer;

/**
 * ClassName: TeamService
 * Package: com.atguigu06.project.team.service
 * Description:开发团队成员类
 *关于开发团队成员的管理：添加、删除等。
 * @Author honghuaijie
 * @Create 2023/8/19 9:50
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class TeamService {
    private static int counter = 1; // 成员的ID
    private final int MAX_MEMBER = 5;  //最大团队成员
    Programmer[] team = new Programmer[MAX_MEMBER];
    private int total;  //实际成员数量

    //包含所有成员对象的数组，数组大小与成员人数一致
    public Programmer[] getTeam(){
        Programmer[] p = new Programmer[total];
        for (int i = 0; i < total; i++) {
            p[i] = team[i];
        }
        return p;
    }

    //添加团队成员
    public void addMember(Employee e) throws TeamException{
        //判断成员是否已满
        if(total == MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        //判断是不是开发人员
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        //判断该成员是否在团队中
        if(((Programmer) e).getStatus() == Status.BUSY){
            throw new TeamException("该员工已是某团队成员");
        }
        //判断该员工是否正在休假
        if(((Programmer) e).getStatus() == Status.VOCATION){
            throw new TeamException("该员工正在休假，无法添加");
        }
        //判断该员工是否已在本开发团队中
        for (int i = 0; i < total; i++) {
            if(team[i].equals(e)){
                throw new TeamException("该员工已在本开发团队中");
            }
        }

        //统计构架师、设计师、程序员的对象分别有多少个
        int aTotal=0; //构架师
        int dTotal=0; //设计师
        int pTotal=0; //程序员
        for (int i = 0; i < total; i++) {
            if(team[i] instanceof Architect){
                aTotal++;
            }else if(team[i] instanceof Designer){
                dTotal++;
            }else{
                pTotal++;
            }
        }

        //判断构架师是否超出
        if(e instanceof Architect  ){
            if (aTotal == 1){
                throw new TeamException("团队中至多只能有一名构架师");
            }
        } else if (e instanceof Designer  ) {
            if (dTotal == 2){
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else if ( pTotal == 3) {
            throw new TeamException("团队中至多只能有三名程序员");
        }

        //添加团队成员
        ((Programmer) e).setMemberId(counter);
        ((Programmer) e).setStatus(Status.BUSY);
        team[total++] = ((Programmer) e);
        counter++;
//        if(e instanceof Architect){
//            team[total++] = (Architect) e;
//        } else if (e instanceof Designer  ) {
//            team[total++] = (Designer) e;
//        } else  {
//            team[total++] = (Programmer) e;
//        }
//        counter++;
        System.out.println("添加成功");
    }

    //删除团队成员

    public void removeMemer(int memberId) throws TeamException{
        boolean falg = false;
        int i;
        for ( i = 0; i < total; i++) {
            if(team[i].getMemberId() == memberId){
                falg = true;
                break;
            }
        }

        if(falg){
            team[i].setStatus(Status.FREE);
            for (int j = i; j < total-1; j++) {
                team[j] = team[j+1];
            }
            team[--total] =null;
            System.out.println("删除成功");
        }else{
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }
    }
}
