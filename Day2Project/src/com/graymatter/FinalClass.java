package com.graymatter;

public class FinalClass {
private final String name;
private  String companyName;
public void changName(String name) {
	//this.name=name;
}
public FinalClass(String name) {
	this.name=name;
	System.out.println(name);
}
public final String printName(String companyName) {
	this.companyName=companyName;
	return companyName;
}
}
