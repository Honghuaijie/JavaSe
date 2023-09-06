package com.atguigu02.reference;

import com.atguigu02.reference.data.Employee;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 方法引用的使用
 *
 * Created by shkstart.
 */
public class MethodRefTest {

	// 情况一：对象 :: 实例方法
	//Consumer中的void accept(T t)
	//PrintStream中的void println(T t)
	@Test
	public void test1() {
		//1.
		Consumer<String> con1 = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		con1.accept("hello");
		//2.lambda表达式：
		Consumer<String> con2 = s -> System.out.println(s);
		con2.accept("hello1");

		//3、方法引用
		Consumer<String> con3 = System.out :: println;
		con3.accept("String");

		
	}
	
	//Supplier中的T get()
	//Employee中的String getName()
	@Test
	public void test2() {
		Employee emp = new Employee(1001, "马化腾", 34, 6000.38);

		//1.
		Supplier<String> sup = new Supplier<>(){
			public String get(){
				return emp.getName();
			}
		};
		System.out.println(sup.get());

		//2.lambda
		Supplier<String> sup1 = () -> emp.getName();
		System.out.println(sup1.get());

		//3.方法引用：
		Supplier<String> sup2 = emp::getName;
		System.out.println(sup2.get());

	}

	// 情况二：类 :: 静态方法
	//Comparator中的int compare(T t1,T t2)
	//Integer中的int compare(T t1,T t2)
	@Test
	public void test3() {
		//1
		Comparator<Integer> com1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1,o2);
			}
		};
		System.out.println(com1.compare(12, 32));
		//2 用lambda
		Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1,o2);
		System.out.println(com2.compare(342, 32));

		//3、方法引用
		Comparator<Integer> com3 = Integer::compare;
		System.out.println(com3.compare(12, 32));



	}
	
	//Function中的R apply(T t)
	//Math中的Long round(Double d)
	@Test
	public void test4() {
		Function<Double,Long>  fun1 = Math::round;

		System.out.println(fun1.apply(-20.45));


	}

	// 情况三：类 :: 实例方法 (难)
	// Comparator中的int comapre(T t1,T t2)
	// String中的int t1.compareTo(t2)
	@Test
	public void test5() {
		//1
		Comparator<String> com1 = (s1,s2) -> s1.compareTo(s2);
		System.out.println(com1.compare("abc", "abb"));
		//2
		Comparator<String> com2 = String::compareTo;
		System.out.println(com2.compare("abc", "abb"));



	}

	//BiPredicate中的boolean test(T t1, T t2);
	//String中的boolean t1.equals(t2)
	@Test
	public void test6() {
		BiPredicate<String,String> big1 = (t1, t2) -> t1.equals(t2);

		BiPredicate<String,String> bi2 = String::equals;
		System.out.println(bi2.test("abb", "abb"));


	}
	
	// Function中的R apply(T t)
	// Employee中的String getName();
	@Test
	public void test7() {
		Employee emp = new Employee(1001, "马化腾", 34, 6000.38);
		Function<Employee,String> fun1 = Employee::getName;
		System.out.println(fun1.apply(emp));
	}

}
