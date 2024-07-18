package com.grayMatter.Assignment;

import java.util.Scanner;

import com.grayMatter.Student;

public class Assignment5 {
	public static void main(String[] args) {
	Student s=new Student("Harsha",117,95,46,30);
	
	System.out.println("Student Progress Report");
	System.out.println("Name: "+s.getStudName());
	System.out.println("ID: "+s.getId());
	System.out.println("M1: "+s.getM1());
	System.out.println("M2: "+s.getM2());
	System.out.println("M3: "+s.getM3());
	System.out.println("Total: "+s.getTotal());
	float avg=(float)s.getTotal()/3;
	System.out.println("Average: "+avg);
	System.out.println("Result: "+(avg>60?"FIRST CLASS"
			:(avg>50 && avg< 60)?"SECOND CLASS"
			:(avg>40 &&avg <50)?"THIRD CLASS":"FAILED"));
		
		

	}
}
