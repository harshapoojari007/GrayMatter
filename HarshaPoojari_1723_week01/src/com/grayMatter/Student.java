package com.grayMatter;

import java.util.Date;

public class Student {
	int id;
	String name;
	Date dateofbirth;
	public Student() {
		super();
	}
	public Student(int id, String name, Date dateofbirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateofbirth = dateofbirth;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dateofbirth=" + dateofbirth + "]";
	}
	
}
