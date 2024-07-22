package com.gratmatter;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

import com.gratmatter.Employee;

public class DemoOnTreeSet {
public static void main(String[] args) {
	TreeSet<Integer> ts=new TreeSet<Integer>(Collections.reverseOrder());
	ts.add(1);
	ts.add(00);
	ts.add(-1);
	ts.add(222);

	System.out.println(ts);
	
	Iterator<Integer> itr=ts.descendingIterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
  
	Employee e1=new  Employee(1723,"Harsha Poojari",140000,"Udupi");
	Employee e2=new  Employee(1724,"Aditya Poojari",160000,"Udupi");
	Employee e3=new  Employee(1725,"Manish Poojari",90000,"Udupi");
	Employee e4=new  Employee(1726,"Shamanth Poojari",80000,"Mangalore");
	Employee e5=new  Employee(1727,"Rahul Poojari",10000,"Kundapura");
	Employee e6=new  Employee(1728,"Mani Poojari",10000,"Byndoor");
	Employee e7=new  Employee(1500,"Mani Poojari",10000,"Byndoor");
	Employee e8=new  Employee(1501,"Mani Poojari",10000,"Byndoor");
	TreeSet<Employee> temp=new TreeSet<Employee>();
	temp.add(e1);
	temp.add(e2);
	temp.add(e3);
	temp.add(e4);
	temp.add(e5);
	temp.add(e6);
	temp.add(e7);
	temp.add(e8);
	
	Iterator<Employee> itr2=temp.iterator();
	while(itr2.hasNext())
	{
		System.out.println(itr2.next());
	}
  
	for(Employee e:temp)
	{
		System.out.println(e);
	}
	
	System.out.println(ts.ceiling(60));
	System.out.println(ts.floor(60));
	ts.add(56);
	ts.add(-2);
	System.out.println(ts.headSet(56));
	System.out.println(ts.tailSet(56));
	
   
}
}
