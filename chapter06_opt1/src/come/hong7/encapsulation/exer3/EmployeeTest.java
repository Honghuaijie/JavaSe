package come.hong7.encapsulation.exer3;

import java.util.Scanner;

/**
 * ClassName: EmployeeTest
 * Package: come.hong7.encapsulation.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 15:38
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] arre = new Employee[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arre.length; i++) {
            arre[i] = new Employee();
            System.out.println("----------------");
            System.out.print("请输入姓名:");
            arre[i].setName(sc.next());

            System.out.print("请输入性别:");
            arre[i].setGender(sc.next().charAt(0));

            System.out.print("请输入年龄:");
            arre[i].setAge(sc.nextInt());

            System.out.print("请输入电话:");
            arre[i].setPhone(sc.next());
            System.out.println("输入完成~！");
            System.out.println("----------------");
        }

        for (int i = 0; i < arre.length; i++) {
            System.out.println(arre[i].getInfo());
        }

    }
}
