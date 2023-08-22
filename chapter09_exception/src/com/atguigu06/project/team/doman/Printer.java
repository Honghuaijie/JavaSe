package com.atguigu06.project.team.doman;

/**
 * ClassName: Printer
 * Package: com.atguigu06.project.team.doman
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/19 10:16
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Printer implements Equipment{

    private String name;
    private String type;

    public Printer(String name,String type){
        this.name = name;
        this.type = type;
    }



    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
