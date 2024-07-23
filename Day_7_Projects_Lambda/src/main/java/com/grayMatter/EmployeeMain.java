package com.grayMatter;

import java.util.ArrayList;
import java.util.function.Function;

import com.grayMatter.Employee;

public class EmployeeMain {
public static void main(String[] args) {
	ArrayList<Employee2> al=new ArrayList<Employee2>();
	
	Employee2 e1=new  Employee2("Harsha Poojari",121,140000,0);
	Employee2 e2=new  Employee2("Aditya Poojari",122,160000,0);
	Employee2 e3=new  Employee2("Manish Poojari",123,90000,0);
	Employee2 e4=new  Employee2("Shamanth Poojari",124,80000,0);
	Employee2 e5=new  Employee2("Rahul Poojari",125,10000,0);
	Employee2 e6=new  Employee2("Ankush Poojari",126,200000,0);
	Employee2 e7=new  Employee2("Prathap Poojari",127,2000,0);
	Employee2 e8=new  Employee2("Roopesh Poojari",128,20000,0);
	Employee2 e9=new  Employee2("Ganesh Poojari",129,50000,0);
	Employee2 e10=new  Employee2("Deepak Poojari",130,49000,0);
	
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	al.add(e5);
	al.add(e6);
	al.add(e7);
	al.add(e8);
	al.add(e9);
	al.add(e10);
	
	Function<Employee2,Double> f=(emp)->{
		if(emp.getSalary()>50000)
		{
			return 5000.0;
		}
		return 2000.0;
	};
	al.forEach((e)->{
		e.setBonus(f.apply(e));
	});
	
	al.forEach((e)->{
		System.out.println(e);
	});
	
	
}
}
