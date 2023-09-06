package com.atguigu06.otherstream;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: OtherStreamTest
 * Package: com.atguigu06.otherstream
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/9/2 10:58
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class OtherStreamTest {
    @Test
    public void test1() throws IOException {
        File srcFile = new File("wash.jpg");
        File destFile = new File("wash2.jpg");
        FileUtils.copyFile(srcFile,destFile);
    }
}
