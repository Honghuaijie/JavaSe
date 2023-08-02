package com.hong1._this.exer2;

/**
 * ClassName: Customer
 * Package: com.hong1._this.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/2 18:14
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public Account getAccount(){
        return account;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public void showInfo(){
        System.out.println("name:" +  getFirstName() + " "  +getLastName());
    }
}
