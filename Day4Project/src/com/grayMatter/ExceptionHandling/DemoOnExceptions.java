package com.grayMatter.ExceptionHandling;

public class DemoOnExceptions {
public static void main(String[] args) {
	int num=7,deno=0;
	int []a=new int[5];
  
	try{
		//System.out.println(num/deno);
		if(deno==0)
			throw new ArithmeticException();
		else
			System.out.println(num/deno);
			
		System.out.println(a[7]);
	}catch(ArithmeticException e) {
		
		//System.out.println("Dviding By Zero");
		e.printStackTrace();
		System.out.println(e.getMessage());
	}catch(RuntimeException e)
	{
		//System.out.println("Dviding By Zero");
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	
	System.out.println("End of main block");
	
}
}
