package com.grayMatters.String;

public class DemoOnString {
	public static void main(String[] args) {
		String str="harsha";
		System.out.println(str.hashCode());
		str="Hii";
		System.out.println(str.hashCode());
		
		String s=new String("harsha");
		System.out.println(s.hashCode());
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		String s2=s;
		String s3=s2+"world";
		
		System.out.println(s.equals(s2));
		System.out.println(s==s2);
		
		s="apple";
		String s1="apll";
		String st="  ";
		String st2="";
		System.out.println(s.compareTo(s1));
		System.out.println(s.endsWith("le"));
		System.out.println(st.isBlank());// 
		System.out.println(st2.isEmpty());
		
		
		
		
		
		
		
		
		
	}


}
