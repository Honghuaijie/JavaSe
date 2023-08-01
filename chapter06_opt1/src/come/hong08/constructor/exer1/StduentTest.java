package come.hong08.constructor.exer1;

/**
 * ClassName: StduentTest
 * Package: come.hong08.constructor.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 16:49
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class StduentTest {
    public static void main(String[] args) {
        Student s1 = new Student("张三",12);
        System.out.println("name: " + s1.name + " age: " + s1.age);

        Student s2 = new Student("李四",12,"南京");
        System.out.println("name: " + s2.name + " age: " + s2.age + " school:" + s2.school);

        Student s3 = new Student("王五",12,"南京","计算机");
        System.out.println("name: " + s3.name + " age: " + s3.age + " school:" + s3.school + " major:" + s3.major);



    }
}
