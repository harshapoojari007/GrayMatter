package com.grayMatter;

import com.grayMatter.Assignment.Assignment1;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
System.out.println(s);
s.setId(117);
s.setStudName("Harsha");
s.setM1(100);
s.setM2(99);
s.setM3(100);
System.out.println(s.getId()+" "+s.getM1()+" "+s.getM2()+" "+s.getM3()+" "+s.getStudName());
Student sPara=new Student("Harsha",117,98,76,99);
Student oneStd=new Student("Harsha");

Assignment1 as=new Assignment1();
//as.name;



	}
}
