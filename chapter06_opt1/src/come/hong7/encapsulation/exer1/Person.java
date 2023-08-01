package come.hong7.encapsulation.exer1;

/**
 * ClassName: Person
 * Package: come.hong7.encapsulation.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 15:17
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Person {
    private int age;

    public void setAge(int a){
        if(a >= 0 && a<=130){
            age = a;
        }else{
            System.out.println("您输入的年龄有误");
        }
    }

    public int getAge(){
        return age;
    }
}
