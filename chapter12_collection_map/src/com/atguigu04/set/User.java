package com.atguigu04.set;

/**
 * ClassName: User
 * Package: com.atguigu04.set
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/27 9:29
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class User implements Comparable{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }



    /**
     * 自然排序 按照年龄从大到小，姓名从小到大
     * @return 返回值为0说明相等
     *         返回值大于0说明当前对象大
     *         返回值小于0说明当前对象小
     */
    @Override
    public int compareTo(Object o) {
        if(this == o ){
            return 0;
        }
        if(o instanceof User){
            User u1 = (User) o;
            int value = this.age - u1.age;
            if(value != 0){
                return value;
            }
            return -this.name.compareTo(u1.name);
        }
        throw new RuntimeException("类型不匹配");
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
