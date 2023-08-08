package com.hong5._super.exer1;

/**
 * ClassName: Kids
 * Package: com.hong3._extends.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 13:13
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Kids extends ManKind {
    int yearsOld;

    public void printAge(){
        System.out.println("yearsOld:" + yearsOld);
    }

    public void  employeed(){
        super.employeed();
        System.out.println("but kids should study and no job");
    }
}
