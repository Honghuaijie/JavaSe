package come.hong4.example.exer1;

/**
 * ClassName: Person
 * Package: come.hong4.example.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/30 16:33
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Person {
    String name;
    int age;
    String gender;

    public void study(){
        System.out.println("studying");
    }
    public int showAge(){
        return age;
    }
    public void addAge(int addAge){
        age +=addAge;
    }
}
