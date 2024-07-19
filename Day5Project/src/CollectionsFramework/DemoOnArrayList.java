package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoOnArrayList {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	//al.add(null);
	al.add(234);
	al.add(222);
	System.out.println(al);
	//Collections.sort(al);
	System.out.println(al);
	al.add(2,123);
	
	for(int i:al)
	{
		System.out.println(i);
	}
	
	
	
	ArrayList hetero=new ArrayList();
	
	hetero.add("Harsha");
	hetero.add(true);
	hetero.add(117);
	
	
	System.out.println(hetero);
	
	for(int i=0;i<hetero.size();i++)
	{
		System.out.println(hetero.get(i));
	}
	
	//al.addAll(3,hetero);
	al.add(1);
	al.add(1);
	al.add(1);
	al.add(1);
	
	System.out.println(al);
	al.remove((Integer)1);
	//al.remove(1);
    
	System.out.println(al);

	
//	Collections.sort(hetero);
//	System.out.println(hetero);
	
	System.out.println(al);
	Iterator<Integer> i=al.iterator();
	while(i.hasNext())
	{
	    if(i.next()==1)
	    	i.remove();
		
	}
	System.out.println(al);
//	
//	ListIterator<Integer> li=al.listIterator();
//	System.out.println("Using List Iterrator");
//	while(li.hasNext())
//	{
//		li.add(-1);
//		System.out.println(li.next());
//		
//	}
//	System.out.println(al);
//	
//	while(li.hasPrevious())
//	{
//		
//		System.out.println(li.previous());
//	
//		
//	}
//	System.out.println(al);
	
	
}
}
