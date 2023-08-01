package come.hong7.encapsulation.exer3;

/**
 * ClassName: Employee
 * Package: come.hong7.encapsulation.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 15:32
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private String phone;

    // name的set方法
    public void setName(String n){
        name = n;
    }
    // name的get方法
    public String getName(){
        return name;
    }

    // gender的set方法
    public void setGender(char sg){
        gender = sg;
    }
    // gender的get方法
    public char getGender(){
        return gender;
    }

    // age的set方法
    public void setAge(int a){
        age = a;
    }
    // age的get方法
    public int getAge(){
        return age;
    }

    // phone的set方法
    public void setPhone(String p){
        phone = p;
    }
    // phone的get方法
    public String getPhone(){
        return phone;
    }

    //输出员工信息
    public String getInfo(){

        return "name: " + getName() +
                " gender: " + getGender() +
                " age: " + getAge() +
                " phone: " + getPhone() ;
    }

}
