package com.atguigu04._throw;

/**
 * ClassName: BelowZeroException
 * Package: com.atguigu04._throw
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/18 20:26
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class BelowZeroException extends Exception{

    static final long serialVersionUID = -70348971939L;

    public BelowZeroException() {
        super();
    }

    public BelowZeroException(String message) {
        super(message);
    }
    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }

}
