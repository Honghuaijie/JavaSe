package com.atguigu01.use.exer2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;

/**
 * ClassName: Exer0
 * Package: com.atguigu01.use.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/28 9:59
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(100);
            list.add(num);
        }

        for (Integer integer : list){
            System.out.println(integer);
        }


        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
