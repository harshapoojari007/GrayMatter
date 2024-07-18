package com.grayMatter;

import java.util.Scanner;

public class SwitchExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		char op;
		System.out.println("Enter Two Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter the operator");
		op=sc.next().charAt(0);
		
		switch (op){
		case '+':System.out.println(a+b);break;
		case '-':System.out.println(a-b);break;
		case '/':System.out.println((float)a/b);break;
		case '*':System.out.println(a*b);break;
		case '%':System.out.println(a%b);break;
		default:System.out.println("INvalid Operator");
		
		}

	}

}
