package com.atguigu03._throws;

import java.io.IOException;

/**
 * ClassName: OverrideTest
 * Package: com.atguigu03._throws
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/18 16:16
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class OverrideTest {
}


class Father{
    public  void method1() throws IOException{

    }
}

class Son extends Father{
    @Override
    public void method1()  {
    }
}
