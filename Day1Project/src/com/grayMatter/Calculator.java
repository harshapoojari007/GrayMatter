package com.grayMatter;

import java.util.Scanner;

public class Calculator {
/**
 * @param args
 */
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int a,b;
	char op;
	System.out.println("Enter Two Numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Enter the operator");
	op=sc.next().charAt(0);
	
	if(op=='+')
		System.out.println(a+b);
	else if(op=='-')
		System.out.println(a-b);
	else if(op=='*')
		System.out.println(a*b);
	else if(op=='/')
		System.out.println((float)a/b);
	else if(op=='%')
		System.out.println(a%b);
	else 
		System.out.println("Invalid Operator");
	
}
}
