package come.hong4.example.exer5_objarr;

/**
 * ClassName: StudentTest
 * Package: come.hong4.example.exer5_objarr
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/30 16:58
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] stu = new Student[20];

        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
            stu[i].number = i+1;
            stu[i].state = (int)(Math.random()*6+1);
            stu[i].score = (int)(Math.random()*101);
            if(stu[i].state == 3){
                stu[i].show();
            }
        }


        for (int i = 0; i < stu.length-1; i++) {
            for (int j = 0; j < stu.length-1 - i; j++) {
                if(stu[j].score > stu[j+1].score) {
                    Student temp = stu[j];
                    stu[j] = stu[j+1];
                    stu[j+1] = temp;
                }
            }
        }
        System.out.println("-------------------");
        for (int i = 0; i < stu.length; i++) {
            stu[i].show();
        }


    }
}
