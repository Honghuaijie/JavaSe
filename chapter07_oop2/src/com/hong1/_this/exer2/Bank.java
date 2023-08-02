package com.hong1._this.exer2;

/**
 * ClassName: Bank
 * Package: com.hong1._this.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/2 18:17
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Bank {
    private Customer[] customer ;
    private int numberOfCustomers=0;

    public Bank(){
        customer =new Customer[20];
    }
    public void addCustomer(String firstName, String lastName){
        Customer ct = new Customer(firstName,lastName);
        customer[numberOfCustomers] = ct;
        numberOfCustomers++;

    }
    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }
    public Customer getCustomer(int index){
        return customer[index];
    }
}
