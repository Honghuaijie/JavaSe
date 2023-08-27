package com.atguigu02.stringmore;

import org.junit.Test;

/**
 * ClassName: StringBuilderOrBufferText
 * Package: com.atguigu02.stringmore
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/25 14:54
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class StringBuilderOrBufferText {
    /**
     * （1）StringBuffer append(xx)：提供了很多的append()方法，用于进行字符串追加的方式拼接
     * （2）StringBuffer delete(int start, int end)：删除[start,end)之间字符
     * （3）StringBuffer deleteCharAt(int index)：删除[index]位置字符
     * （4）StringBuffer replace(int start, int end, String str)：替换[start,end)范围的字符序列为str
     * （5）void setCharAt(int index, char c)：替换[index]位置字符
     * （6）char charAt(int index)：查找指定index位置上的字符
     * （7）StringBuffer insert(int index, xx)：在[index]位置插入xx
     * （8）int length()：返回存储的字符数据的长度
     * （9）StringBuffer reverse()：反转
     */

    @Test
    public void test(){
        StringBuffer sBuffer = new StringBuffer();
        sBuffer.append("abc").append("456");
        System.out.println(sBuffer);
        sBuffer.delete(0,3);
        System.out.println(sBuffer);
        sBuffer.deleteCharAt(0);
        System.out.println(sBuffer);
        sBuffer.replace(1, 2, "abcdefgh");
        System.out.println(sBuffer);
        sBuffer.setCharAt(1, '5');
        System.out.println(sBuffer);
        System.out.println(sBuffer.charAt(2));
        sBuffer.insert(5, "abcde");
        System.out.println(sBuffer);
        System.out.println(sBuffer.length());
        System.out.println(sBuffer.reverse());
        System.out.println(sBuffer);
    }


    /**
     * 其他API
     * （1）int indexOf(String str)：在当前字符序列中查询str的第一次出现下标
     * （2）int indexOf(String str, int fromIndex)：在当前字符序列[fromIndex,最后]中查询str的第一次出现下标
     * （3）int lastIndexOf(String str)：在当前字符序列中查询str的最后一次出现下标
     * （4）int lastIndexOf(String str, int fromIndex)：在当前字符序列[fromIndex,最后]中查询str的最后一次出现下标
     * （5）String substring(int start)：截取当前字符序列[start,最后]
     * （6）String substring(int start, int end)：截取当前字符序列[start,end)
     * （7）String toString()：返回此序列中数据的字符串表示形式
     * （8）void setLength(int newLength) ：设置当前字符序列长度为newLength
     */

    @Test
    public void test2(){
        StringBuffer sBuffer = new StringBuffer();
        sBuffer.append("abc").append("456");
        System.out.println(sBuffer.indexOf("asdf"));
        System.out.println(sBuffer.substring(2));  //新new了一个
        System.out.println(sBuffer);
        sBuffer.setLength(2);  //修改实际存储的字符个数
        System.out.println(sBuffer);

        System.out.println(sBuffer.length());  //返回实际存储的字符个数
        sBuffer.setLength(5);  //修改实际存储的字符个数
        System.out.println(sBuffer);

        System.out.println(sBuffer.length());  //返回实际存储的字符个数
    }


    /**
     * 测试String、Stringbuffer、stringbuilder操作数据方面的效率
     */

    @Test
    public void test3(){
        //初始设置
        long startTime = 0L;
        long endTime = 0L;
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");

        //开始对比
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));
    }
}
