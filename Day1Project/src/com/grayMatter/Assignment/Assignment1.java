package com.grayMatter.Assignment;

import java.util.Scanner;

public class Assignment1 {
String name="Harsha";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Max of 4 Numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 4 Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		System.out.println("Max of 4 number is "+((a>b && a>c && a>d)?a:(b>c && b>d)?b:(c>d)?c:d));
		
		
		

	}

}
