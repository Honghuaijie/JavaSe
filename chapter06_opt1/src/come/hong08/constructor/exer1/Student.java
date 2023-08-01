package come.hong08.constructor.exer1;

/**
 * ClassName: Student
 * Package: come.hong08.constructor.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 16:47
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Student {
    String name;
    int age;
    String school;
    String major;

    public Student(String n, int a){
        name = n;
        age = a;
    }

    public Student(String n, int a,String s){
        name = n;
        age = a;
        school = s;
    }

    public Student(String n, int a,String s,String m){
        name = n;
        age = a;
        school = s;
        major = m;
    }
}
