package com.grayMatter.Calculator;

public abstract class Arithmetic extends Calculator{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	 public void mul(int a,int b)
	 {
		 System.out.println(a*b);
	 }
	 public void div(int a,int b) {
		 System.out.println((float)a/b);
	 }

}
