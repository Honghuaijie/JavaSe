package com.atguigu05.exer.exer1;

/**
 * ClassName: ClassMismatchException
 * Package: com.atguigu05.exer.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/18 20:35
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ClassMismatchException extends Exception{
    static final long serialVersionUID = -70339L;

    public ClassMismatchException() {
        super();
    }

    public ClassMismatchException(String message) {
        super(message);
    }
    public ClassMismatchException(String message, Throwable cause) {
        super(message, cause);
    }

}
