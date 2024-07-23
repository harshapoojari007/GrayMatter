package com.grayMatter;

interface HelloInterface{
	public String sayHello();
	
}
interface PrintName{
	public void printName(String name);
	
}

interface Addition{
	public int add(int a,int b);
}

interface Display{
	public void display();
}
public class DemoOnLambda{
public static void main(String[] args) {
//	HelloInterface hi=new DemoOnLambda();
//	System.out.println(hi.sayHello());
	
	HelloInterface hi=()->"Hello..";// No Parameter Return 
	System.out.println(hi.sayHello());
	
	PrintName pn=(name)->System.out.println(name);//With parameter but No Return Value
	pn.printName("Harsha");
	
	Addition ad=(a,b)->a+b;// WIth Parameter With Return Value
	System.out.println(ad.add(10, 20));
	
	Display d=()->System.out.println("Inside Display Method");//No Parameter No Return
	d.display();
	
}

public String sayHello() {
	// TODO Auto-generated method stub
	return "Hello....";
}
}
