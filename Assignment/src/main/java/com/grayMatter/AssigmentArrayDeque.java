package com.grayMatter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class AssigmentArrayDeque {
public static void main(String[] args) {
	ArrayDeque<Customer> ad=new ArrayDeque<Customer>();
	Customer c1=new Customer(121,"Harsha Poojari",true,1000);
	Customer c2=new Customer(122,"Ankush Poojari",false,400);
	Customer c3=new Customer(123,"Shashanth Poojari",true,10000);
	Customer c4=new Customer(124,"Kiran Poojari",false,499);
	Customer c5=new Customer(125,"Keshav Poojari",false,199);
	
	//ADD
	ad.add(c1);
	ad.add(c2);
	ad.add(c3);
	ad.add(c4);
	ad.add(c5);
	ad.addFirst(c4);
	ad.push(c5);
	
	
	Iterator<Customer> i1=ad.iterator();
	while(i1.hasNext())
	System.out.println(i1.next());
	
	//REMOVE
	ad.remove();// Removes First ELement
	ad.remove(c5);
	ad.removeLast();
	
	
	//Retrieve
	System.out.println("After REmoval");
	Iterator<Customer> i=ad.iterator();
	while(i.hasNext())
	System.out.println(i.next());
	
	//Contains
	System.out.println(ad.contains(c1));
	
	List<Customer> list = new ArrayList<>(ad);
	Collections.sort(list);
	
	Iterator<Customer> i2=list.iterator();
	while(i2.hasNext())
	System.out.println(i2.next());
	
}
}

