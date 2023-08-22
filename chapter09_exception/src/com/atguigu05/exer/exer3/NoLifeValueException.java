package com.atguigu05.exer.exer3;

/**
 * ClassName: NoLifeValueException
 * Package: com.atguigu05.exer.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/18 20:40
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class NoLifeValueException  extends RuntimeException{
    static final long serialVersionUID = -338758L;


    public NoLifeValueException() {
        super();
    }


    public NoLifeValueException(String message) {
        super(message);
    }
}
