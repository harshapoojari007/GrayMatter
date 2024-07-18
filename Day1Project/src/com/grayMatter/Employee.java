package com.grayMatter;

import java.util.Scanner;

public class Employee {
// Instance variablesS
String name;
int id;
double sal;
String mobile;
String email;
//static String compName;// static variable, shared variable

public void setDetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Details");
	this.name=sc.next();
	this.id=sc.nextInt();
	this.sal=sc.nextDouble();
	this.mobile=sc.next();
	this.email=sc.next();
	
}

public Employee(String name, int id, double sal, String mobile, String email) {
	super();
	this.name = name;
	this.id = id;
	this.sal = sal;
	this.mobile = mobile;
	this.email = email;
}

public void getDetails()
{
	System.out.println(this.email+" "+this.id+" "+this.name+" "+this.sal+" "+this.mobile+" ");
}

}
