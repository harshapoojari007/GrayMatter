package com.grayMatter;

import java.util.Scanner;

public class DemoOnIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         boolean flag=false;
         if(flag)
        
        	 System.out.println("Hii If State");
         else
        	 
        	 System.out.println("Bye");
         
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter two num");
         int a=sc.nextInt();
         int b=sc.nextInt();
         
         if(a>b)
        	 System.out.println(a);
         else
        	 System.out.println(b);
         
         System.out.println("Enter 3rd num");
         int c=sc.nextInt();
         if(a>b && a>c)
         {
        	 System.out.println("a");
         }else if(b>a && b>c)
        	 System.out.println("b");
         else {
        	 System.out.println("c");
         }
         
         if(a%2==0)
        	 System.out.println("a is an even num");
         else
        	 System.out.println("a is an odd num");
         
        if(a>b)
        {
        	if(a>c)
        		System.out.println("a");
        	else
        		 System.out.println("c");
        		
        }else {
        	if(b>c)
        		System.out.println("b");
        	else
        		System.out.println("c");
        }
         
	}

}
