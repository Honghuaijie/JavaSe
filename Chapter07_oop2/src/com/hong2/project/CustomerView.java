package com.hong2.project;

/**
 * ClassName: CustomerView
 * Package: com.hong2.project
 * Description:为主模块，负责菜单的显示和处理用户操作
 *
 * @Author honghuaijie
 * @Create 2023/8/2 20:40
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class CustomerView {
    CMUtility cm = new CMUtility();  //键盘类
    private CustomerList customerList ;  //客户列表类
    public static void main(String[] args){
        CustomerView cv = new CustomerView();
        cv.enterMainMenu();
    }




    public CustomerView(){
        customerList = new CustomerList(4);
    }

    //显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法，以完成客户信息处理
    public void enterMainMenu(){

        boolean loopFlag = true;
        while (loopFlag){
            System.out.println(" -----------------拼电商客户管理系统-----------------\n");
            System.out.println("\t\t1 添 加 客 户");
            System.out.println("\t\t2 修 改 客 户");
            System.out.println("\t\t3 删 除 客 户");
            System.out.println("\t\t4 客 户 列 表");
            System.out.println("\t\t5 退      出");
            System.out.print("请选择(1-5)：");
            char selection = cm.readMenuSelection();

            switch (selection){
                case '1': addNewCustomer();break;
                case '2': modifyCustomer();break;
                case '3': deleteCustomer();break;
                case '4': listAllCustomers();break;
                case '5': {
                    System.out.print("是否退出Y/N：");
                    char confirm = cm.readConfirmSelection();
                    if(confirm == 'Y'){
                        loopFlag = false;
                    }
                }
            }
        }


    }
    //添加客户
    public void addNewCustomer(){
        System.out.println("\n---------------------添加客户---------------------\n");
        System.out.print("姓名：");
        String name = cm.readString(20);

        System.out.print("性别：");
        char gender = cm.readChar();

        System.out.print("年龄：");
        int age = cm.readInt();

        System.out.print("电话：");
        String phone = cm.readString(20);

        System.out.print("邮箱：");
        String email = cm.readString(50);

        Customer cust = new Customer(name,gender,age,phone,email);
        if(customerList.addCustomer(cust)){
            System.out.println("---------------------添加完成---------------------");
        }else{
            System.out.println("---------------------添加失败---------------------");
        }
    }

    //修改客户
    private void modifyCustomer(){
        System.out.println("---------------------修改客户---------------------");
        System.out.print("请选择待修改客户编号(-1退出)：");
        int index = cm.readInt();
        if(index != -1){ //判断是否退出修改操作
            Customer cust = customerList.getCustomer(index);
            if(cust != null){  //判断通过该编号是否能找到客户信息
                System.out.print("姓名(" + cust.getName() + ")：");
                String name = cm.readString(20,cust.getName());

                System.out.print("性别(" + cust.getGender() + ")：");
                char gender = cm.readChar(cust.getGender());

                System.out.print("年龄(" + cust.getAge() + ")：");
                int age = cm.readInt(cust.getAge());

                System.out.print("电话(" + cust.getPhone() + ")：");
                String phone = cm.readString(20,cust.getPhone());

                System.out.print("邮箱(" + cust.getEmail() + ")：");
                String email = cm.readString(50,cust.getEmail());

                if(customerList.replaceCustomer(index,new Customer(name,gender,age,phone,email))){
                    System.out.println("---------------------修改完成---------------------");
                }else{
                    System.out.println("---------------------修改失败---------------------");
                }
            }
        }

    }

    //删除客户
    private void deleteCustomer(){
        System.out.println("---------------------删除客户---------------------");
        System.out.print("请选择待删除客户编号(-1退出)：");
        int index = cm.readInt();
        if(index !=-1){  //判断是否退出删除客户操作
            System.out.print("确认是否删除(Y/N)：");
            char confirm = cm.readConfirmSelection();
            if(confirm == 'Y'){ // 确认是否删除
                if(customerList.deleteCustomer(index)){ //判断是否删除成功
                    System.out.println("---------------------删除完成---------------------");
                }else{
                    System.out.println("---------------------删除失败---------------------");
                }
            }
        }
    }

    //客户列表
    private void listAllCustomers(){
        System.out.println("---------------------------客户列表---------------------------");
        System.out.println("编号\t姓名\t\t\t性别\t\t年龄\t\t电话\t\t\t\t\t邮箱\n");
        Customer[] customers = customerList.getAllCustomers(); //获取所有客户对象
        for (int i = 0; i < customers.length; i++) {
            System.out.println((i+1) + "\t" + customers[i].getName()
                        + "\t\t\t" + customers[i].getGender()
                    + "\t\t" + customers[i].getAge()
                    + "\t\t" + customers[i].getPhone()
                    + "\t\t" + customers[i].getEmail()
            );
        }


        System.out.println("\n---------------------------客户列表完成---------------------------");
    }




}
