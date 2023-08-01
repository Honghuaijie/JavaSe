package come.hong08.constructor.exer3;

/**
 * ClassName: Customer
 * Package: come.hong08.constructor.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 17:18
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    public Customer(String f, String l){
        firstName = f;
        lastName = l;
    }
    public Customer(){

    }

    public void setFirstName(String first){
        firstName = first;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String last){
        lastName = last;
    }

    public String getLastName(){
        return lastName;
    }

    public void setAccount(Account acc){
        account = acc;
    }

    public Account getAccount(){
        return account;
    }
}
