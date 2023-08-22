package com.atguigu04._throw;

/**
 * ClassName: ThrowTest
 * Package: com.atguigu04._throw
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/18 18:36
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ThrowTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        try {
            s1.regist(10);
            s1.regist(-10);

            System.out.println(s1.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Student{

    int id;

    public void regist(int id) throws BelowZeroException{
        if(id > 0){
            this.id = id;
        }else{
            throw new BelowZeroException("输入的ID非法");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
