package com.grayMatter;

public class Course {
	int id;
	String name;
	String duration;
	double fees;
	public Course() {
		super();
	}
	public Course(int id, String name, String duration, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", duration=" + duration + ", fees=" + fees + "]";
	}
	
}
