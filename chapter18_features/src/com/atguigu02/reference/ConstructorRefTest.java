package com.atguigu02.reference;

import com.atguigu02.reference.data.Employee;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 一、构造器引用
 *
 * 二、数组引用
 *
 *
 * Created by shkstart
 */
public class ConstructorRefTest {
	//构造器引用
    //Supplier中的T get()
    @Test
    public void test1(){
        //1构造器引用
        Supplier<Employee> emp1 = Employee::new; //调用的是Employee类中的空参构造器
	}

	//Function中的R apply(T t)
    @Test
    public void test2(){
        Function<Integer,Employee> fun1 = Employee::new;//调用的是Employee类中参数是Integer/int类型的构造器
        System.out.println(fun1.apply(12));
    }

	//BiFunction中的R apply(T t,U u)
    @Test
    public void test3(){
        BiFunction<Integer,String,Employee> bifun1 = Employee::new;
        System.out.println(bifun1.apply(10, "Tom"));//调用的是Employee类中参数是Integer/int、String类型的构造器
    }

	//数组引用
    //Function中的R apply(T t)
    @Test
    public void test4(){
        Function<Integer,Employee[]> fun1 = new Function<Integer, Employee[]>() {
            @Override
            public Employee[] apply(Integer length) {
                return new Employee[length];
            }
        };
        //2
        Function<Integer,Employee[]> fun2 = Employee[]::new;
        Employee[] apply = fun2.apply(10);
        apply[0] = new Employee(){};
        System.out.println(apply.length);

    }
}
