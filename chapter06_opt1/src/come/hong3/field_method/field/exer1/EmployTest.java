package come.hong3.field_method.field.exer1;

/**
 * ClassName: EmployTest
 * Package: come.hong3.field_method.field.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/30 14:57
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class EmployTest { //员工测试类
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.id = "01";
        e1.name = "张三";
        e1.age = 20;
        e1.salary = 123.1;

        e2.id = "02";
        e2.name = "李四";
        e2.age = 20;
        e2.salary = 234.1;

        System.out.println("id: " + e1.id + " name: " + e1.name + " age: " + e1.age + " salary: " + e1.salary);
        System.out.println("id: " + e2.id + " name: " + e2.name + " age: " + e2.age + " salary: " + e2.salary);



    }
}
