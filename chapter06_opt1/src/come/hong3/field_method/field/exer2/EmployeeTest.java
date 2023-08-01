package come.hong3.field_method.field.exer2;

/**
 * ClassName: EmployeeTest
 * Package: come.hong3.field_method.field.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/30 15:09
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "张三";
        e1.birthday = new MyDate();
        e1.birthday.year=2002;
        e1.birthday.month = 12;
        e1.birthday.day = 6;

        System.out.println("name: " + e1.name + " year: " + e1.birthday.year +
                " month: " + e1.birthday.month + " day: " + e1.birthday.day );

    }
}
