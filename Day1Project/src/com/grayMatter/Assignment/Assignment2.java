package com.grayMatter.Assignment;

import java.util.Scanner;

public class Assignment2 {
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
		
		System.out.println("Max of 4 number is "+((a>b && a>c && a>d && a>e)?a:
												(b>c && b>d && b>e)?b:(c>d && c>e)?c:
												(d>e)?d:e));
		
		
		

	}
}
