package com.grayMatter;

import java.util.Scanner;

public class PrimeNumberCheck {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	
	int i=2;
	boolean flag=true;
	while(i<=Math.sqrt(a))
	{
		if(a%i==0)
		{
			System.out.println("Not a Prime");
			flag=false;
			break;
		}
			
		i++;
	}
	if(flag==true)
	System.out.println("Yes a is Prime");
}
}
