package com.grayMatter;

public class DemoDataTypes {
	public static void main(String []args)
	{
		int num=5;
		System.out.println("num=" +num);
		boolean flag=false;
		System.out.println(flag);
		
		int a=1,b=5,c=6;
		System.out.println("Sum="+(a+b));
		System.out.println("Sub="+(a-b));
		System.out.println("Div="+((float)a/b));
		System.out.println("Div="+(a/(float)b));
		System.out.println("Mul="+(a*b));
		System.out.println("Modulo="+(a%b));
		
		System.out.println(a>b&&a>c ?a:b>c?b:c);
		System.out.println(a>b?(a>c?a:c):(b>c?b:c));
		
		//Assignment 1: Max of 4
		//Assigment 2: Max of 5
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
		a=a+b+c;
		b=a-b-c;
		c=a-b-c;
		a=a-b-c;
		System.out.println(a+" "+b+ "  "+c);
		
		
		System.out.println(b%2==0?"Yes":"No");
		int d=9;
		d=d&1;
		System.out.println("d="+d);
		System.out.println(d==0?"Yes":"No");
		
		int num3=60;
		System.out.println(num3>>3);// /2 /2 /2
		System.out.println(num3<<3);// *2 *2 *2
		
		
	}

}
