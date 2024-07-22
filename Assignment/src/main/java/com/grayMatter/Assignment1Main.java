package com.grayMatter;

import java.util.Date;
import java.util.LinkedList;

public class Assignment1Main {
public static void main(String[] args) {
	LinkedList<Item> items1=new LinkedList<Item>();
	Item i=new Item("Mug",5,25,"Godrej");
	Item i1=new Item("DipTea",20,10,"CCD");
	Item i2=new Item("Plate",15,50,"Haldirams");
	Item i3=new Item("Hanger",12,25,"DMart");
	Item i4=new Item("Belt",5,200,"Dmart");
	Item i5=new Item("Brush",2,150,"Gaala");
	Item i6=new Item("Biscuit",10,100,"Unibic");
	items1.add(i);
	items1.add(i1);
	items1.add(i2);
	items1.add(i3);
	
	LinkedList<Item> items2=new LinkedList<Item>();
	items2.add(i4);
	items2.add(i5);
	items2.add(i6);
	
	LinkedList<Item> items3=new LinkedList<Item>();
	items3.add(i1);
	items3.add(i3);
	items3.add(i5);
	
	LinkedList<Item> items4=new LinkedList<Item>();
	items4.add(i2);
	items4.add(i4);
	items4.add(i6);
	
	
	Order o1=new Order(121,new Date(),items1);
	Order o2=new Order(122,new Date(),items2);
	Order o3=new Order(123,new Date(),items3);
	Order o4=new Order(124,new Date(),items4);
	
	int maxOrder=0;
	Order max=new Order();
   System.out.print("Order 1 Total Cost: ");
   System.out.println(o1.TotalOrderCost());
   if(o1.TotalOrderCost()>maxOrder)
   {

	   maxOrder=o1.TotalOrderCost();
	   max=o1;
   }
	   
   
   System.out.print("Order 2 Total Cost: ");
   System.out.println(o2.TotalOrderCost());
   if(o2.TotalOrderCost()>maxOrder) {
	   maxOrder=o2.TotalOrderCost();
	max=o2;   
   }
   
   System.out.print("Order 3 Total Cost: ");
   System.out.println(o3.TotalOrderCost());
   if(o3.TotalOrderCost()>maxOrder)
	   
   {
	   maxOrder=o3.TotalOrderCost();
	   max=o3;
   }
	  
   
   System.out.print("Order 4 Total Cost: ");
   System.out.println(o4.TotalOrderCost());
   if(o4.TotalOrderCost()>maxOrder)
   {
	   maxOrder=o4.TotalOrderCost();
	   max=o4;
   }
	 
   
	
	System.out.println("The Max order is:"+maxOrder+"\n"+max);
	
	
}
}
