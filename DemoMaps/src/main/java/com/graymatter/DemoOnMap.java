package com.graymatter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMap {
public static void main(String[] args) {
	Map<Integer,String > mp=new HashMap<>();
	mp.put(1, "Harsha");
	mp.put(2, "Poojari");
	mp.put(3,"Nagor");
	System.out.println(mp);
	
	System.out.println(mp.get(4));
	System.out.println(mp.get(1));
	System.out.println(mp.keySet());
	System.out.println(mp.values());
	
	mp.put(4, "Udupi");
	mp.put(5, "Kundapura");
	
	Set<Entry<Integer, String>> es=mp.entrySet();
	Iterator<Entry<Integer, String>> it=es.iterator();
	while(it.hasNext()) {
		
		System.out.println(it.next());
	}
   System.out.println( mp.getOrDefault(9, "kfj"));
   

   Employee e1=new  Employee(1723,"Harsha Poojari",140000,"Udupi");
	Employee e2=new  Employee(1724,"Aditya Poojari",160000,"Udupi");
	Employee e3=new  Employee(1725,"Manish Poojari",90000,"Udupi");
	Employee e4=new  Employee(1726,"Shamanth Poojari",80000,"Mangalore");
	Employee e5=new  Employee(1727,"Rahul Poojari",10000,"Kundapura");
	Employee e6=new  Employee(1728,"Mani Poojari",10000,"Byndoor");
	Employee e7=new  Employee(1500,"Mani Poojari",10000,"Byndoor");
	Employee e8=new  Employee(1501,"Mani Poojari",10000,"Byndoor");
//	
//	TreeMap<Integer, Employee> treeMap=new TreeMap<Integer, Employee>();
//	treeMap.put(1, e1);
//	treeMap.put(2, e2);
//	treeMap.put(3, e3);
//	treeMap.put(4, e4);
//	treeMap.put(5, e5);
//	treeMap.put(6, e6);
//	treeMap.put(7, e7);
//	treeMap.put(8, e8);
	
//	for(Entry<Integer,Employee> e:treeMap.entrySet())
//	System.out.println(e);
	
	
	TreeMap<Employee, Address> treeMap1=new TreeMap<>();
	   Address add=new Address("Udu","Kar");
	   
	   treeMap1.put(e1, add);
	   treeMap1.put(e2,add);
		treeMap1.put(e3, add);
		treeMap1.put(e4, add);
		treeMap1.put(e5, add);
		treeMap1.put(e6, add);
		treeMap1.put(e7, add);
		treeMap1.put(e8, add);
//		
         
		for(Entry<Employee, Address>  e:treeMap1.entrySet())
			System.out.println(e.getKey());
	   
	

	
	
	
}
}
