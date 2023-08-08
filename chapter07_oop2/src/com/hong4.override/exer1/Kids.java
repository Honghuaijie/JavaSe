package com.hong4.override.exer1;

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
        if(yearsOld < 18){
            System.out.println("Kids should study and no job");
        }else{
            System.out.println("job");
        }
    }
}
