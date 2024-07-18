package com.grayMatter.Assignment;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Max of 5 Numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		if(a>b && a>c && a>d && a>e)
			System.out.println(a);
		else if(b>c && b>d && b>e)
			System.out.println(b);
		else if(c>d && c>e)
				System.out.println(c);
		else if(d>e)
				System.out.println(d);
		else
				System.out.println(e);
		
		
		

	}
}
