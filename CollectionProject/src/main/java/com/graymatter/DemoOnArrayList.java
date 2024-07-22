package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class DemoOnArrayList {
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
		
		
		System.out.println(empList);
		
		for(Employee e:empList)
			System.out.println(e);
		
		
		Iterator i=empList.iterator();
		while(i.hasNext())
		{
			System.out.println(  i.next());
			
		}
		
		//Sort Operation
		System.out.println("Sorted");
		//Collections.sort(empList);
		empList.sort(new CityComparator().thenComparing(new SalaryComparator()).thenComparing(new IdComparator()));
		for(Employee e:empList)
			System.out.println(e);
		
	}

}
