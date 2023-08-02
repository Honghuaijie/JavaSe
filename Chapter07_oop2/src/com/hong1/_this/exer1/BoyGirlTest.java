package com.hong1._this.exer1;

/**
 * ClassName: BoyGirlTest
 * Package: com.hong1._this.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/2 18:04
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy1 = new Boy("杰克",24);
        Girl girl1 = new Girl("朱迪",20);
        girl1.marry(boy1);
        boy1.shout();

        Girl girl2 = new Girl("温蒂",18);
        int compare = girl1.compare(girl2);
        if(compare == 1){
            System.out.println(girl1.getName() + "大");
        }else if(compare == -1){
            System.out.println(girl1.getName() + "小");
        }else{
            System.out.println("两个人一样大");
        }
    }
}
