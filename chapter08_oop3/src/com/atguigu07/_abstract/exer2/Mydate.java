package com.atguigu07._abstract.exer2;

/**
 * ClassName: Mydate
 * Package: com.atguigu07._abstract.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/11 22:39
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Mydate {
    private int year;
    private int month;
    private int day;

    Mydate(){

    }

    public Mydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toDateString(){
        return year + "年" + month + "月" + day + "日";
    }
}
