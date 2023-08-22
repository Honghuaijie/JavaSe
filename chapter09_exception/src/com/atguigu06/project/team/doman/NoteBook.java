package com.atguigu06.project.team.doman;

/**
 * ClassName: NoteBook
 * Package: com.atguigu06.project.team.doman
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/19 10:03
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class NoteBook implements Equipment{

    private String model; //表示机器的型号
    private double price;

    public NoteBook(String model,double price){
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
