package com.grayMatter;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.grayMatter.Employee;

public class DemoOnBuiltInFI {
public static void main(String[] args) {
	ArrayList<Employee> empList=new ArrayList<Employee>();
	Employee e1=new  Employee(1723,"Harsha Poojari",140000,"Udupi");
	Employee e2=new  Employee(1724,"Aditya Poojari",160000,"Udupi");
	Employee e3=new  Employee(1725,"Manish Poojari",90000,"Udupi");
	Employee e4=new  Employee(1726,"Shamanth Poojari",80000,"Mangalore");
	Employee e5=new  Employee(1727,"Rahul Poojari",10000,"Kundapura");
	Employee e6=new  Employee(1728,"Mani Poojari",10000,"Byndoor");
	Employee e7=new  Employee(1500,"Mani Poojari",10000,"Byndoor");
	Employee e8=new  Employee(1501,"Mani Poojari",10000,"Byndoor");
	
	
	empList.add(e1);
	empList.add(e2);
	empList.add(e3);
	empList.add(e4);
	empList.add(e5);
	empList.add(e6);
	empList.add(e7);
	empList.add(e8);
	
//	
//	empList.forEach((emp)->System.out.println(emp));
	
	Consumer<Integer> consumer=(i)->System.out.println(i);
	consumer.accept(100);
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(180);
	al.add(90);
	al.add(60);
	al.add(30);
	al.add(90);
	
	al.forEach(consumer);
	
	Supplier<String> su=()->"Hello";
	System.out.println(su.get());
	
	
	Predicate<Integer> pt=(a)->a%2==0;
	System.out.println(pt.test(109));
	
	int []arr= {15,34,56,77,89};
	for(int i:arr)
	{
		if(pt.test(i))
			System.out.println(i);
	}
	
	
	Function<Integer, Integer> f=(num)->{
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	};
	
	System.out.println(f.apply(10));
	

	
	
}
}
