package come.hong08.constructor.exer3;

/**
 * ClassName: AccountTest
 * Package: come.hong08.constructor.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 17:16
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account("01",200.0,0.2);
        a1.withdraw(100);
        a1.deposit(200);
    }
}
