/*
此VariableTest4.java用来测试强制类型转换
规则：
1.如果需要将容量大的变量的类型转换为容量小的变量的类型，需要使用强制类型转换
2.强制类型转换需要使用强转符：（）。在（）内指定要转换为的数据类型。
3.
强制类型转换过程中，可能导致精度损失。
*/

class VariableTest4 
{
	public static void main(String[] args) 
	{
		double d1 = 12;  //自动类型转换  int ---> double

		//编译失败
		//int i1 = d1;
		//在需要转换的变量前面加上（），（）里面写上要强制转换的类型
		int i2 = (int)d1;
		System.out.println(i2);

		long l1 = 123;
		
		//short s1 = l1;
		short s2 = (short)l1;
		System.out.println(s2);

		//练习
		int i3 = 12;
		float f1 = i3; //自动类型提升
		System.out.println(f1);  //12.0

		float f2 = (float)i3; //编译可以通过，只不过可以省略
		
		//精度损失的例子1：
		double d2 = 12.89;
		int i4 = (int)d2;
		System.out.println(i4);

		//精度损失的例子2:
		int i5 = 128;
		byte b1 = (byte)i5;
		System.out.println(b1);

		//实际开发举例：
		byte b2 = 12;
		method(b2);  //int number = b2;

		long l2 = 123L;
		//method(l2) //编译不通过
		method((int)l2);  // int number = l2;
	}

	public static void method(int number){
		System.out.println("num = " + number);
	}

}
