package com.grayMatter.ExceptionHandling;

public class Person {
private String name;
private long aadhar;
private int age;
public Person() {
	super();
}
public Person(String name, long aadhar, int age) {
	super();
	this.name = name;
	this.aadhar = aadhar;
	this.age = age;
}
@Override
public String toString() {
	return "Person [name=" + name + ", aadhar=" + aadhar + ", age=" + age + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getAadhar() {
	return aadhar;
}
public void setAadhar(long aadhar) {
	this.aadhar = aadhar;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


}
