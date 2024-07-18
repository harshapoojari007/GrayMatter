package com.grayMatter.ExceptionHandling;

public class ThrowingException {
	
	public static void divide(int a,int b){
		if(b==0)
			throw new RuntimeException();
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide(10,20);
		
		

	}

}
