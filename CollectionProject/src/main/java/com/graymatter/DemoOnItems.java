package com.graymatter;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnItems {
public static void main(String[] args) {
	LinkedList<Item> item=new LinkedList<Item>();
	Item i=new Item("Mug",10,100,"Godrej");
	Item i1=new Item("DipTea",10,100,"CCD");
	Item i2=new Item("Plate",10,100,"Haldirams");
	Item i3=new Item("Hanger",10,100,"DMart");
	Item i4=new Item("Belt",10,100,"Dmart");
	item.add(i);
	item.add(i1);
	item.add(i2);
	item.add(i3);
	item.add(i4);
	
	System.out.println("Before Sorting");
	Iterator it=item.iterator();
	while(it.hasNext())
	{
		System.out.println(  it.next());
		
	
	}
	System.out.println("After Sorting");
	item.sort(new NameComparator().thenComparing(new BrandComparator()));
	Iterator it1=item.iterator();
	while(it1.hasNext())
	{
		System.out.println(it1.next());
		
	}
	
	
}
}
