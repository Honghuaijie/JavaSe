/*
测试整型和浮点型变量的使用
*/


class VariableTest1{
	public static void main(String[] ages){
		//1.测试整型变量的使用
		// byte \ short \int \long 

	byte b1 =12;
	byte b2 = 127;
	//byte b3 = 128;

	short s1 = 1234;

	int i1 = 12345;
	// 声明long类型变量时，需要提供后缀，后缀为‘l'或者‘L’
	long l1 = 12353135135L;

	
	// 2. 测试浮点类型变量的使用
	// float \ double 

	double d1 = 12.3;
	// 声明float类型变量时，需要提供后缀，后缀为‘f'或者‘F’
	float f1 = 12.3f;
	System.out.println("f1 = " + f1);

	// float类型表数范围要大于long类型的表数范围，但是精度不高。

	//测试浮点型变量 的精度
	// 结论：通过测试发现浮点型变量的精度不高，人工在开发中，需哟极高的精度，需要使用BigDecimal类替换浮点型变量
	// 测试1
	System.out.println(0.1+0.2);
	
	// 测试2
	float ff1 = 123123123f;
	float ff2 = ff1 + 1;
	System.out.println(ff1);
	System.out.println(ff2);
	System.out.println(ff1 == ff2);

	}

}