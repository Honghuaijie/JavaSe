package com.atguigu06.project.team.doman;

/**
 * ClassName: PC
 * Package: com.atguigu06.project.team.doman
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/19 10:14
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class PC implements Equipment{

    private String model; //机器的型号
    private String display; //显示器的名称


    public PC(String model, String display){
        this.model = model;
        this.display = display;
    }



    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
