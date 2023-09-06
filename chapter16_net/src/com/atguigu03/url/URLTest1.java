package com.atguigu03.url;

import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * ClassName: URLTest1
 * Package: com.atguigu03.url
 * Description:
 * 将URL代表的资源下载到本地
 * @Author honghuaijie
 * @Create 2023/9/3 14:55
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class URLTest1 {
    @Test
    public void test1() throws IOException {
        //1.获取URL实例
        String src = "https://t7.baidu.com/it/u=1595072465,3644073269&fm=193&f=GIF";
        URL url = new URL(src);
        //2.建立与服务器端的连接
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        //3.获取输入流，创建输出流
        InputStream inputStream = urlConnection.getInputStream();

        File file = new File("wash.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        //读写数据
        byte[] buffer = new byte[1024];
        int len;
        while ((len = inputStream.read(buffer)) != -1){
            fileOutputStream.write(buffer,0,len);
        }
        //关闭资源、流
        fileOutputStream.close();
        inputStream.close();
        urlConnection.disconnect();
    }
}
