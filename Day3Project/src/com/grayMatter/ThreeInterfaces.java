package com.grayMatter;

public class ThreeInterfaces implements Interface1,Interface2,Interface3{
public  void display() {
	System.out.println("Diplaying");
}

public static void main(String []args)
{
	ThreeInterfaces t=new ThreeInterfaces();
	t.display();
}
}
