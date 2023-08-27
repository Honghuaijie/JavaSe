package com.atguigu01.string.exer2;

import org.junit.Test;

/**
 * ClassName: StringAnswers1
 * Package: com.atguigu01.string.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/25 11:11
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class StringAnswers1 {
    @Test
    public void test1() {
//        模拟一个trim方法
        String s1 = "   abcdefg";
        System.out.println(s1);
        System.out.println(myTrim(s1));

        System.out.println(myReverse(myTrim(s1), 2, 5));

        System.out.println();
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnm";
        System.out.println(myEqualSubString(str1, str2));

        String str = "abkkcadkabkebfkabkskab";
        String s2 = "ab";

        System.out.println(stringIndexNumber(str, s2));
    }
    //模拟一个trim方法，去除字符串两端的空格。

    public String myTrim(String str) {
        char[] arr = str.toCharArray();
        int start = -1;
        int end = arr.length;

        while (arr[++start] == ' ') ;

        while (arr[--end] == ' ') ;

        return str.substring(start, end + 1);
    }


    /**
     * 题目2：将一个字符串进行反转。将字符串中指定部分进行反转。
     * 比如"abcdefg"反转为"abfedcg"
     */

    public String myReverse(String str, int start, int end) {
        //方式1:

        char[] arr = str.toCharArray();
        for (int fromIndex = start, toIndex = end; fromIndex < toIndex; fromIndex++, toIndex--) {
            char temp = arr[fromIndex];
            arr[fromIndex] = arr[toIndex];
            arr[toIndex] = temp;
        }

        return new String(arr);


        //**************************
//        int m = (end - start) / 2;
//        for (int i = 0; i < m; i++) {
//            char temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        return String.copyValueOf(arr);
        //方式二:
//        char[] arr = str.substring(start,end+1).toCharArray();
//        for (int i = 0; i < arr.length /2; i++) {
//            char temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
//
//        return str.substring(0, start) + String.copyValueOf(arr) + str.substring(end+1 );
    }


    /**
     * 题目3：获取一个字符串在另一个字符串中出现的次数。
     * 比如：获取"ab"在 "abkkcadkabkebfkabkskab" 中出现的次数
     */


    public int stringIndexNumber(String str1, String subStr) {
        int num = 0; //用来记录出现的次数
        int index = str1.indexOf(subStr, 0); //用来记录每次出现的下标

        while (index != -1) {

            num++;
            index = str1.indexOf(subStr, index + subStr.length());
        }

        return num;

    }


    /**
     * 题目4：获取两个字符串中最大相同子串。比如：
     * str1 = "abcwerthelloyuiodef";
     * str2 = "cvhellobnm"
     * str2 = "cvheobnm"
     * vheobn
     * heob
     * 提示：将短的那个串进行长度依次递减的子串与较长的串比较。
     */

    @Test
    public void test2() {
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnm";
        System.out.println(myEqualSubString(str1, str2));
    }

    public String myEqualSubString(String str1, String str2) {
        String maxStr;
        String minStr;
        maxStr = str1.length() > str2.length() ? str1 : str2;
        minStr = str1.length() > str2.length() ? str2 : str1;

        int len = minStr.length();

        for (int i = 0; i < len - 1; i++) {

            for (int x = 0, y = len - i; y <= len; x++, y++) {
                if (maxStr.contains(minStr.substring(x, y))) {
                    return minStr.substring(x, y);
                }
            }
        }


        return "没有找到";


    }
}
