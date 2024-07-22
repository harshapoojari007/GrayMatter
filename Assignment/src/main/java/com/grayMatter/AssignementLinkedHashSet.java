package com.grayMatter;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import com.grayMatter.Employee;

public class AssignementLinkedHashSet {
public static void main(String[] args) {
	LinkedHashMap<Integer, Employee> lhs=new LinkedHashMap<>();
	Employee e1=new  Employee(1723,"Harsha Poojari",140000,"Udupi");
	Employee e2=new  Employee(1724,"Aditya Poojari",160000,"Udupi");
	Employee e3=new  Employee(1725,"Manish Poojari",90000,"Udupi");
	Employee e4=new  Employee(1726,"Shamanth Poojari",80000,"Mangalore");
	Employee e5=new  Employee(1727,"Rahul Poojari",10000,"Kundapura");
	Employee e6=new  Employee(1728,"Mani Poojari",10000,"Byndoor");
	Employee e7=new  Employee(1500,"Mani Poojari",10000,"Byndoor");
	Employee e8=new  Employee(1501,"Mani Poojari",10000,"Byndoor");
	
	lhs.put(1, e1);
	lhs.put(2, e2);
	lhs.put(3, e3);
	lhs.put(4, e4);
	lhs.put(5, e5);
	lhs.put(6, e6);
	lhs.put(7, e7);
	lhs.put(8, e8);
	
	for(Entry<Integer, Employee> e:lhs.entrySet())
	{
	System.out.println(e);
	}
	
	lhs.remove(1);
	lhs.put(9, e8);
	

	for(Entry<Integer, Employee> e:lhs.entrySet())
	{
	System.out.println(e);
	}
	
}
}
