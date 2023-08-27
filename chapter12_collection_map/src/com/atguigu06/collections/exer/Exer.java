package com.atguigu06.collections.exer;

import java.util.*;

/**
 * ClassName: Exer
 * Package: com.atguigu06.collections.exer
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/27 18:17
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer {
    public static void main(String[] args) {
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] color = {"方片♦", "梅花♣", "红桃♥", "黑桃♠"};
        ArrayList poker = new ArrayList();
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < num.length; j++) {
                poker.add(color[i] + num[j]);
            }
        }

        poker.add("大王");
        poker.add("小王");

        Collections.shuffle(poker);

        System.out.println(poker);

        List tom = new ArrayList();
        List jerry = new ArrayList();
        List me = new ArrayList();
        List lastCards = new ArrayList();  //底牌

        for (int i = 0; i < poker.size(); i++) {
            if (i >= poker.size() - 3) {
                lastCards.add(poker.get(i));
            } else if (i % 3 == 0) {
                tom.add(poker.get(i));
            } else if (i % 3 == 1) {
                jerry.add(poker.get(i));
            } else if (i % 3 == 2) {
                me.add(poker.get(i));
            }
        }

        Map map = new HashMap();

        //发牌
        //  方法1
        map.put("Tom", tom);
        map.put("Jerry", jerry);
        map.put("me", me);
        map.put("底牌", lastCards);

        //  方法2
//        map.put("Tom", poker.subList(0, 17));
//        map.put("Jerry", poker.subList(17, 17+17));
//        map.put("me", poker.subList(17+17, 17+17+17));
//        map.put("底牌", poker.subList(17+17+17, 17+17+17+3));

        for (Object obj : map.entrySet()) {

            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }

    }
}
