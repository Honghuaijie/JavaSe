package com.atguigu03.list.exer2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * ClassName: Exer02
 * Package: com.atguigu03.list.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/26 19:37
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer02 {
    public static void main(String[] args) {



        List list = new ArrayList();


        for (int i = 0; i < 30; i++) {
            Random random = new Random();
            String s1 = String.valueOf((char) (random.nextInt(26) + 97));//[97,122]
            String s2 = (char)(Math.random() * (122-97+1) + 97) + "";//[97,122]
            list.add(s1);
        }

        int anum = listTest(list,"a");
        int bnum = listTest(list,"b");
        int cnum = listTest(list,"c");
        int xnum = listTest(list,"x");
        System.out.println(list);
        System.out.println(anum);
        System.out.println(bnum);
        System.out.println(cnum);
        System.out.println(xnum);
    }

    public static int listTest(Collection list, String s){
        int num=0;

        for(Object str : list ){
            if(str.equals(s)){
                num++;
            }
        }


        return num;
    }

}
