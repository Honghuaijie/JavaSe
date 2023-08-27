package com.atguigu05.map.exer2;

import java.util.*;

/**
 * ClassName: CityMap
 * Package: com.atguigu05.map.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/27 15:27
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class CityMap {
    public static Map model = new HashMap();

    static {
        model.put("北京", new String[] {"北京"});
        model.put("辽宁", new String[] {"沈阳","盘锦","铁岭","丹东","大连","锦州","营口"});
        model.put("吉林", new String[] {"长春","延边","吉林","白山","白城","四平","松原"});
        model.put("河北", new String[] {"承德","沧州","邯郸","邢台","唐山","保定","石家庄"});
        model.put("河南", new String[] {"郑州","许昌","开封","洛阳","商丘","南阳","新乡"});
        model.put("山东", new String[] {"济南","青岛","日照","临沂","泰安","聊城","德州"});
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String provice; //代表输入的省份
        String city; //代表输入的城市

        Set provices = model.keySet();  //省份的集合

        //1.先遍历省份并输出
        for (Object obj : provices){
            System.out.print(obj + "\t\t");
        }
        //2.输入省份，并判断该省份是否在集合中
        System.out.println();
        System.out.println("请选择你所在的省份：");

        provice = sc.next();
        while (!provices.contains(provice)){
            System.out.println("请重新选择你所在的省份：");
            provice = sc.next();
        }

        //3。遍历该省份的城市，并输出
        //获取该省份的城市value
        String[] cities = (String[])model.get(provice);
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i] + "\t\t");
        }


        //4.输入城市，并判断该城市是否在集合中
        System.out.println();
        System.out.println("请选择你所在的城市：");

        city = sc.next();
        List cityList = Arrays.asList(cities);
        while (!cityList.contains(city)){
            System.out.println("请重新选择你所在的城市：");
            city = sc.next();
        }


        // 登记完毕
        System.out.println("信息登记完毕");

        sc.close();
    }
}
