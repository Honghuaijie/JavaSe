package com.hong7.object.equals.exer2;

/**
 * ClassName: MyDate
 * Package: com.hong7.object.equals.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/8 15:18
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if(o instanceof MyDate){
            MyDate date = (MyDate) o;
            return year == date.year && month == date.month && day == date.day;
        }

        return false;

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
}
