package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {
public static void main(String[] args) {
//	LinkedList<String> mli=new LinkedList<>();
//	mli.add("Oppo");
//	mli.add("Motorola");
//	mli.add("Apple");
//	mli.add("BlueBerry");
//	mli.add("Samsung");
//	mli.add("Orange");
//	
//	for(String s:mli)
//		System.out.println(s);
//	
//	mli.addFirst("Vivo");
//	mli.addLast("One Plus");
//	System.out.println(mli);
//	
//	mli.add("Oppo");
//	//mli.add(null);
//	System.out.println(mli);
//	
//	
//	Iterator i=mli.listIterator();
//	while(i.hasNext())
//	{
//		System.out.println(i.next());
//	}
//	
//	Collections.sort(mli);
//	i=mli.listIterator();
//	while(i.hasNext())
//	{
//		System.out.println(i.next());
//	}
//	mli.contains("Oppo");
//	
//	LinkedList<String> myMobile=(LinkedList<String>) mli.clone();
//	System.out.println(myMobile);
//	
//	System.out.println(mli.hashCode());//same
//	System.out.println(myMobile.hashCode());//same
//	
//	myMobile.add("Honor");
//	System.out.println(myMobile.hashCode());
	
	
	LinkedList<Employee> empList=new LinkedList<Employee>();
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
	
	LinkedList<Employee> myyEmp=(LinkedList<Employee>)empList.clone();
	System.out.println(empList.hashCode());
	System.out.println(myyEmp.hashCode());
	
	
	Employee e9=new  Employee(1502,"Mani Poojari",10000,"Byndoor");
	myyEmp.add(e9);
	System.out.println(myyEmp);
}
}
