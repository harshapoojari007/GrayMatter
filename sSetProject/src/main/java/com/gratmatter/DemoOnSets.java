package com.gratmatter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoOnSets {
public static void main(String[] args) {
	HashSet<Integer> hs=new HashSet<Integer>();
	//no duplicates
	//Insertioin order not preserved
	hs.add(122);
	hs.add(122);
	hs.add(112);
	hs.add(90);
	hs.add(80);
	//hs.add(null);
	System.out.println(hs);
	Iterator<Integer> it=hs.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	HashSet<Integer> hs1=(HashSet<Integer>) hs.clone();
	System.out.println(hs1);
	
	Integer ia[]=hs.toArray(new Integer[hs.size()]);
    List<Integer> ls=new LinkedList<>(hs);
	ArrayList<Integer> al=new ArrayList<>(hs);
	System.out.println(ia[0]);
	
	
	
	
	
	
	
}
}
