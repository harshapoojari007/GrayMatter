package com.graymatter;

import java.lang.reflect.Method;

public class MethodOverloading {
	//change on Type
	public void add(int a , int b)
	{
		System.out.println(a+b);
	}
	public void add(float f1,float f2)
	{
		System.out.println(f1+f2);
	}
	public void add(String s1,String s2)
	{
		System.out.println(s1+s2);
	}
	
	//change on number
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public void add(double d1,double d2, double d3,double d4)
	{
		System.out.println(d1+d2+d3+d3);
	}
	
	//change on order
	public void add(int a,double d)
	{
		System.out.println(a+d);
	}
	
	public void add(double d, int a)
	{
		System.out.println(a+d);
	}
	
	public void add(Complex c1,Complex c2)
	{Complex c=new Complex();
	c.img=c1.img+c2.img;
	c.real=c1.real+c2.real;
		System.out.println(c.real+"+"+c.img+"i");
	}
   public static void main(String[] args) {
	MethodOverloading mo=new MethodOverloading();
	mo.add(1, 2);
	mo.add(1.2f, 1.2f);
	mo.add(1.2, 1.2,1.2,1.2);
	mo.add("Harsha", "Poojari");
	Complex c1=new Complex(3,4);
	Complex c2=new Complex(4,6);
	mo.add(c1,c2);
	
	mo.add(1, 1);
	
	
	
	
}
}
