package com.atguigu03.url;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * ClassName: URLTest
 * Package: com.atguigu03.url
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/9/3 14:45
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class URLTest {

    @Test
    public void test1() throws MalformedURLException {
        String url = "http://192.168.21.107:8080/examples/abcd.jpg?name=Tom";

        URL url1 = new URL(url);
        /**
         * public String getProtocol( ) 获取该URL的协议名
         * public String getHost( ) 获取该URL的主机名
         * public String getPort( ) 获取该URL的端口号
         * public String getPath( ) 获取该URL的文件路径
         * public String getFile( ) 获取该URL的文件名
         * public String getQuery( ) 获取该URL的查询名
         */
        System.out.println(url1.getProtocol());
        System.out.println(url1.getHost());
        System.out.println(url1.getPort());
        System.out.println(url1.getPath());
        System.out.println(url1.getFile());
        System.out.println(url1.getQuery());

    }
}
