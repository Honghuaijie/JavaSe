package com.hong2.project;

/**
 * ClassName: CustomerList
 * Package: com.hong2.project
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/2 19:53
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class CustomerList {

//    public static void main(String[] args) {
//        CustomerList cList1 = new CustomerList(5); // 确定好数组长度
//        boolean flag ;
//        Customer[] custs ;
//
//        cList1.addCustomer(new Customer("张三",'男',20,"18645148548","tong@qqq.com"));
//        cList1.addCustomer(new Customer("李四",'男',21,"18645148548","tong@qqq.com"));
//        cList1.addCustomer(new Customer("王五",'女',22,"186451466648","tong@qqq.com"));
//        cList1.addCustomer(new Customer("赵六",'女',23,"18645144448","tong@qqq.com"));
//        cList1.addCustomer(new Customer("甲",'男',23,"18645155548","tong@qqq.com"));
//
//        cList1.replaceCustomer(5,new Customer("zhangsan",'男',20,"18645148548","tong@qqq.com"));
//        cList1.deleteCustomer(0);
//
//        custs = cList1.getAllCustomers();
//
//
//    }

    private Customer[] customers;  //保存客户对象的数组
    int total  ;  //记录已保存客户对象的数量

    //构造器：用来初始化customers数组，传入的参数totalCustomer代表数组的最大空间
    public CustomerList(int totalCustomer){
        this.total = 0;
        customers = new  Customer[totalCustomer];
    }

    /**
     *添加客户
     * @param customer 客户对象
     * 将传入的客户对象，添加到组中最后一个客户对象的后面
     * @return添加成功返回true，false表示数组已满，无法添加
     */
    public boolean addCustomer(Customer customer){
        if(total < customers.length){
            customers[total++] = customer;
            return true;
        }else{
            return false;
        }
    }

    /**
     * 用途：替换数组中有index指定的对象
     * @param index 指定所替换对象在数组中的位置，从0开始
     * @param cust 替换的新客户对象
     * @return 替换成功返回true，false表示索引无效，无法替换
     */
    public boolean replaceCustomer(int index, Customer cust){
        if(index >= 0 && index < total ){
            customers[index] = cust;
            return true;
        }else {
            return false;
        }
    }

    /**
     * 用途：从数组中删除参数index指定索引位置的客户对象记录
     * @param index 要删除对象在数组中的索引位置
     * @return 删除成功返回true，false表示索引无效，无法替换
     */
    public boolean deleteCustomer(int index){
        if(index >= 0 && index < total ){
            for (int i = index; i < total-1; i++) {
                customers[i] = customers[i+1];
            }
            customers[total-1] = null;
            total--;
            return true;
        }else{
            return false;
        }
    }

    /**
     * 返回数组中记录的所有客户对象
     * @return
     */
    public Customer[] getAllCustomers(){
        Customer[] custs  = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }

        return custs;

    }

    /**
     * 返回指定索引位置的客户对象记录re
     * @param index
     * @return
     */
    public Customer getCustomer(int index){
        if(index >=0 && index < total){
            return customers[index];
        }else{
            System.out.println("请输入有效索引");
            return null;
        }

    }
    //返回客户总数
    public int getTotal(){
        return total;
    }



}
