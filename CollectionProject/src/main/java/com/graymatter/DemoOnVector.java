package com.graymatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class DemoOnVector {
public static void main(String[] args) {
	Vector<Integer> v=new Vector<Integer>();
	
	//Its is resizable array
	//it is a legacy class
//	Initial Capacity is 10
//	If vector capacity get exhausted then capacity becomes double
	
	System.out.println(v.capacity());
	for(int i=0;i<11;i++)
	{
		v.add(i);
	}
	System.out.println(v.capacity());
	
//	while(myEnum.hasMoreElements())
//		System.out.println(myEnum.nextElement());
//	
	Iterator<Integer> it=v.iterator();
	while(it.hasNext())
	{
		int i=it.next();
		if(i%2==0)
			it.remove();
		System.out.println(i);
	}
	System.out.println(v);
	
	//v.spliterator()
     Collections.sort(v);
     System.out.println(v);
     Enumeration<Integer> myEnum=v.elements();
     Collections.sort(v);
     System.out.println(v);
     
     v.add(0,100);
     List al=Arrays.asList("Harsha","2","3","4","5","6");
     ArrayList<Integer> a=new ArrayList<Integer>();
     a.add(10);
     a.add(20);
     a.addAll(al);
     System.out.println(al);
     v.addAll(al);
    
     System.out.println(v);
     
     
   

	
}
}
