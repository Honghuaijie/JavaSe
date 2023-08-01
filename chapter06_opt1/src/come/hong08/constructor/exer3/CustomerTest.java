package come.hong08.constructor.exer3;

/**
 * ClassName: CustomerTest
 * Package: come.hong08.constructor.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 17:26
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Jane","Smith");
        c1.setAccount(new Account("1000",2000,1.23));
        System.out.println("name: " + c1.getFirstName() + " " + c1.getLastName() +
                " ID： " + c1.getAccount().getId() + " balance：" + c1.getAccount().getBalance()
        );

        c1.getAccount().deposit(100);

        c1.getAccount().withdraw(960);
        c1.getAccount().withdraw(2000);


    }
}
