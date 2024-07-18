package com.grayMatter.Calculator;

public interface MyScientificCalculator {
	public void add(int a, int b);

	public void sub(int a, int b);
	public void mul(int a, int b);

	
	public void div(int a, int b);

	
	public default void pow(int a, int b) {
		System.out.println(Math.pow(a,b));
	}
	
	public default void sqrt(int a) {
		System.out.println(Math.sqrt(a));
	}
	public static void owner()
	{
		System.out.println("This is from MyScientificCalculator Interface");
	}

}
