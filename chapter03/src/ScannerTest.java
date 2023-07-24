/*
如何从键盘上获取不同类型（基本数据类型、String类型）的变量：使用scanner类

1.使用scanner获取不同类型数据的步骤
步骤1：导包 import java.util.Scanner
步骤2：提供（或创建）一个Scanner类的实例
步骤3：调用Scanner类中的方法，获取指定类型的变量
步骤4：关闭资源，调用Scanner类的close（）

2.案例：请输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况。
*/
import java.util.Scanner;
class  ScannerTest{
	public static void main(String[] args) 
	{
		//步骤2：提供（或创建）一个Scanner类的实例
		Scanner scan = new Scanner(System.in);

		//步骤3：调用Scanner类中的方法，获取指定类型的变量
		System.out.println("请输入姓名" );
		String name = scan.next();
		System.out.println("name = " + name);

		System.out.println("请输入年龄" );
		int age = scan.nextInt();
		System.out.println("age = " + age);

		System.out.println("请输入体重" );
		double weight = scan.nextDouble();
		System.out.println("weight = " + weight);

		System.out.println("是否单身，不单身false，单身用true" );
		Boolean isSingle = scan.nextBoolean();
		System.out.println("isSingle = " + isSingle);


		System.out.println("你的性别:(男\\女)" );
		char gender = scan.next().charAt(0);
		System.out.println("gender = " + gender);

		
		scan.close();

	}
}
