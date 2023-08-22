package com.atguigu05.exer.exer4;

/**
 * ClassName: BelowZeroException
 * Package: com.atguigu05.exer.exer4
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/18 20:52
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class BelowZeroException extends Exception{
    static final long serialVersionUID = -38758L;


    public BelowZeroException() {
        super();
    }


    public BelowZeroException(String message) {
        super(message);
    }
}
