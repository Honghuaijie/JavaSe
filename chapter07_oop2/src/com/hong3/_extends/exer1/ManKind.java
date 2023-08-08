package com.hong3._extends.exer1;

/**
 * ClassName: ManKind
 * Package: com.hong3._extends.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 13:12
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ManKind {
    int sex;
    int salary;

    public void manOrWoman(){
        if(sex == 1) {
            System.out.println("man");
        }else{
            System.out.println("woman");
        }
    }

    public void  employeed(){
        if(salary == 0){
            System.out.println("no job");
        }else{
            System.out.println("job");
        }
    }
}
