package hong.one.exer3;

import java.util.Scanner;

/**
 * ClassName: StudentScore
 * Package: hong.one.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/24 17:49
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class StudentScore {
    public static void main(String[] args) {
        System.out.print("请输入学生人数：");
        Scanner sc = new Scanner(System.in);

        int stuLength = sc.nextInt();

        System.out.println("请输入" + stuLength + "个成绩");
        int[] stuArr = new int[stuLength]; //用来存放成绩
        int max=0;
        for (int i = 0; i < stuLength; i++) {
            stuArr[i] = sc.nextInt();
            if(stuArr[i] > max) max = stuArr[i];
        }
        System.out.println("最高分是：" + max);

        for (int i = 0; i < stuLength; i++) {
            char grade;
            if(stuArr[i] >= (max - 10)){
                grade = 'A';
            }else if(stuArr[i] >= (max - 20)){
                grade = 'B';
            }else if(stuArr[i] >= (max - 30)){
                grade = 'C';
            }else{
                grade = 'D';
            }
            System.out.println("Student " + i + "score is " + stuArr[i] + "grade is "+ grade);
        }
    }
}
