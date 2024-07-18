package com.grayMatter;

import java.util.Scanner;

public class Not3Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=50;i++)
		{
			if(i%3!=0)
				System.out.println(i);
		}
		
	}

}
