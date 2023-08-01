package come.hong4.example.exer1;

/**
 * ClassName: PersonTest
 * Package: come.hong4.example.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/30 16:34
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "张三";
        p1.age = 20;
        p1.gender = "男";
        p1.study();
        System.out.println(p1.showAge());
        p1.addAge(2);
        System.out.println(p1.age);
    }
}
