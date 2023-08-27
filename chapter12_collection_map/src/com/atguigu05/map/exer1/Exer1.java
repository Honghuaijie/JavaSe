package com.atguigu05.map.exer1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Exer0
 * Package: com.atguigu05.map.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/27 15:16
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("周杰伦", new String[]{"双节棍","本草纲目","夜曲","稻香"});
        map.put("陈奕迅", new String[]{"浮夸","十年","红玫瑰","好久不见","孤勇者"});

        for (Object o : map.entrySet()) {
            Map.Entry entry = (Map.Entry)o;
            System.out.println("歌手：" + entry.getKey() );
//            System.out.println("歌曲有:" + Arrays.toString((Object[]) entry.getValue()));
            System.out.println("歌曲有:" + Arrays.asList((String[])entry.getValue()));
        }

        String[] value = (String[]) map.get("周杰伦");

    }
}
