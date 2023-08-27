package com.atguigu01.string;

import org.junit.Test;

/**
 * ClassName: StringMethodTest1
 * Package: com.atguigu01.string
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/24 22:31
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class StringMethodTest1 {

    /**
     *  一、常用方法
     * （1）boolean isEmpty()：字符串是否为空
     * （2）int length()：返回字符串的长度
     * （3）String concat(xx)：拼接
     * （4）boolean equals(Object obj)：比较字符串是否相等，区分大小写
     * （5）boolean equalsIgnoreCase(Object obj)：比较字符串是否相等，不区分大小写
     * （6）int compareTo(String other)：比较字符串大小，区分大小写，按照Unicode编码值比较大小
     * （7）int compareToIgnoreCase(String other)：比较字符串大小，不区分大小写
     * （8）String toLowerCase()：将字符串中大写字母转为小写
     * （9）String toUpperCase()：将字符串中小写字母转为大写
     * （10）String trim()：去掉字符串前后空白符
     * （11）public String intern()：结果在常量池中共享
     */
    @Test
    public void test1(){
        String s1 = "";
        String s2 = new String();
        String s3 = new String("");

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());


    }

    @Test
    public void test2(){
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "Abc";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
    }

    @Test
    public void test3(){
        String s1 = "abc";
        String s2 = "acd";
        String s3 = "aBc";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareToIgnoreCase(s3));

    }

    /** 二、查找
     * （11）boolean contains(xx)：是否包含xx
     * （12）int indexOf(xx)：从前往后找当前字符串中xx，即如果有返回第一次出现的下标，要是没有返回-1
     * （13）int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，
     *              从指定的索引开始
     * （14）int lastIndexOf(xx)：从后往前找当前字符串中xx，即如果有返回最后一次出现的下标，要是没有返回-1
     * （15）int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，
     *          从指定的索引开始反向搜索。
     */

    @Test
    public void test4(){
        String s1 = "helloworld";
        System.out.println(s1.contains("llo"));
        System.out.println(s1.indexOf("llo"));
        System.out.println(s1.indexOf("llo",5));
        System.out.println(s1.lastIndexOf("llo"));
        System.out.println(s1.lastIndexOf("llo",5));
    }


    /**  三、字符串的截取
     * （16）String substring(int beginIndex) ：返回一个新的字符串，
     *      它是此字符串的从beginIndex开始截取到最后的一个子字符串。
     * （17）String substring(int beginIndex, int endIndex) ：返回一个新字符串，
     *      它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。
     */

    @Test
    public void test5(){
        String s1 = "abcdefg";
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,5));
        System.out.println(s1.substring(3,7));
    }

    /**
     * （18）char charAt(index)：返回[index]位置的字符
     * （19）char[] toCharArray()： 将此字符串转换为一个新的字符数组返回
     * （20）static String valueOf(char[] data)  ：返回指定数组中表示该字符序列的 String
     * （21）static String valueOf(char[] data, int offset, int count) ：
     *              返回指定数组中表示该字符序列的 String
     * （22）static String copyValueOf(char[] data)： 返回指定数组中表示该字符序列的 String
     * （23）static String copyValueOf(char[] data, int offset, int count)：
     *              返回指定数组中表示该字符序列的 String
     */

    @Test
    public void test6(){
//        String s1 = "abcdefg";
//        char c = s1.charAt(0);
//        System.out.println(c);
//        char[] c1 = s1.toCharArray();
//        for (int i = 0; i < c1.length; i++) {
//            System.out.print(c1[i] + " ");
//        }

        char[] data = {'h','e','l','l','o','j','a','v','a'};
        String s1 = String.copyValueOf(data);
        String s2 = String.copyValueOf(data,1,5);
        System.out.println(s1);
        System.out.println(s2);
    }

    /**
     * （24）boolean startsWith(xx)：测试此字符串是否以指定的前缀开始
     * （25）boolean startsWith(String prefix, int toffset)：
     *          测试此字符串从指定索引开始的子字符串是否以指定前缀开始
     * （26）boolean endsWith(xx)：测试此字符串是否以指定的后缀结束
     */

    @Test
    public void test7(){
        String s1 = "abcdefg";

        System.out.println(s1.startsWith("abc"));
        System.out.println(s1.startsWith("def",1));
        System.out.println(s1.endsWith("fg"));


    }

    /**
     * （27）String replace(char oldChar, char newChar)：返回一个新的字符串，
     *          它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 不支持正则。
     * （28）String replace(CharSequence target, CharSequence replacement)：
     *              使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
     * （29）String replaceAll(String regex, String replacement)：
     *                  使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
     * （30）String replaceFirst(String regex, String replacement)：
     *                  使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
     */

    @Test
    public void test8(){
        String s1  = "hello";
        String replace1 = s1.replace('l', 'w');
        System.out.println(replace1);
        String replace2 = s1.replace("ll", "Wwww");
        System.out.println(replace2);



    }

    @Test
    public void test9(){
//        int[] a = new int[]{1,2,3,4};
        char[][] a = new char[][]{{'1','2','3','4'},{'a','b'}};
        System.out.println(a);
    }


}
