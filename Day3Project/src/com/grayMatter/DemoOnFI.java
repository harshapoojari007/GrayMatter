package com.grayMatter;

public class DemoOnFI implements FunctionalInterface{

	@Override
	public double cube(int a) {
		// TODO Auto-generated method stub
		return a*a*a;
	}
	public static void main(String[] args) {
	     DemoOnFI df=new DemoOnFI();
	     System.out.println(df.cube(8));
	}

}
