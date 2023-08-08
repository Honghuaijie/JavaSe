package com.hong4.override.test2;

import com.hong4.override.test1.Order;

/**
 * ClassName: SubOrder
 * Package: com.hong4.override.test2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 14:12
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class SubOrder extends Order{
    public void method(){
        orderPublic = 1;
        orderProtected = 1;

        methodProtected();
        methodPublic();

        //报错
        //orderPrivate = 1;
        //orderDefault = 1;
        //methodDefault();
        //methodPrivate();

    }
}
