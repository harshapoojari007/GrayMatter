package com.grayMatter;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
System.out.println("Enter the Num");
for(int i=1;i<=10;i++)
{
	System.out.println(num+"*"+i+"="+num*i);
}
	}

}
