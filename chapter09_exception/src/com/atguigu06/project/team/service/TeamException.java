package com.atguigu06.project.team.service;

/**
 * ClassName: TeamException
 * Package: com.atguigu06.project.team.service
 * Description:自定义员工异常类
 *
 * @Author honghuaijie
 * @Create 2023/8/19 9:51
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class TeamException extends  Exception{
    static final long serialVersionUID = -3387516948L;

    public TeamException() {
        super();
    }


    public TeamException(String message) {
        super(message);
    }
}
