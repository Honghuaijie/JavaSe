package come.hong.opt;

/**
 * ClassName: FieldTest
 * Package: come.hong3.field_method.field
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/30 14:08
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class FieldTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.eat();
    }
}

class Person{
    //属性（成员变量）
    String name;
    int age;
    char gender;

    //方法
    public void eat(){
        String food = "宫保鸡丁"; //局部变量
        System.out.println("我喜欢吃：" + food);
        sleep(8);
    }

    public void sleep(int hour){ // 形参： 局部变量
        System.out.println("人不能少于：" + hour  + "小时的睡眠");

        //不通过，food作用域超出了
      //  System.out.println("我喜欢吃" + food);
    }
}
