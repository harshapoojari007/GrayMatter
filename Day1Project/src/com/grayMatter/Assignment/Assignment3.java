package com.grayMatter.Assignment;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Max of 5 Numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 4 Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		
		if(a>b && a>c && a>d )
			System.out.println(a);
		else if(b>c && b>d)
			System.out.println(b);
		else if(c>d)
				System.out.println(c);
		else
				System.out.println(d);
		
		
		
		

	}
}
