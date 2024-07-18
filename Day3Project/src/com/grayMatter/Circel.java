package com.grayMatter;

public class Circel extends Shape {
	double radius;
	public static final double pi=3.14;
	public Circel(double radius) {
		super();
		this.radius = radius;
	}

	public Circel() {
		super();
	}

	
	public void getArea() {
		System.out.println(pi*radius*radius);
	}
	public void getPerimeter() {
		System.out.println(2*pi*radius);
	}

}
