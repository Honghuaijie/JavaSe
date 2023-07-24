/*
测试运算符的使用4：逻辑运算符

1. & && | || ! ^
2.说明：
①、逻辑运算符针对的都是boolean类型的变量
②、逻辑运算符运算的结果也是boolean类型
③、逻辑运算符常使用条件判断结构、循环结构中

*/


class logicTest{
	public static void main(String[] args) 
	{
		/*
		区分 & &&
		相同点：两个符号表达的都是“且”的关系，只有当符号两边的类型值都是true时，结果才为true
		
		执行过程：
			1）如果符号左边是true，则&、&& 都会执行符号右边的操作
			2）如果符号左边是false，则&会执行符号右边的表达式
									&& 不会执行符号右边的表达式
		不同点：& 两边表达式都要执行
				&& 当遇到false时后面的表达式不执行
		3、开发中，我们推荐使用&&
		*/

		boolean b1 = true;
		b1 = false;
		int num1 = 10;

		if (b1 & (num1++ > 0))
		{
			System.out.println("床前明月光");
		}else{
			System.out.println("我叫郭德纲");
		}

		System.out.println("num1= " + num1);

		boolean b2 = true;
		b2 = false;

		int num2 = 10;

		if (b2 && (num2++ > 0))
		{
			System.out.println("床前明月光");
		}else{
			System.out.println("我叫郭德纲");
		}

		System.out.println("num2= " + num2);

		int a,b;
		a = b = 20;
		boolean bo1;
		bo1 = (++a % 3 == 0) && (a++ % 7 == 0);
		System.out.println("a= " + a + "bo1= " + bo1);
		boolean bo2;
		bo2 = (b++ % 3 ==0) && (++b % 7 == 0);
		System.out.println("b= " + b + "bo2= " + bo2);

	}

}
