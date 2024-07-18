package com.graymatter;

public class DemoOnStatic {
	
	static String name;
	
	static {
		System.out.println("Static block 1");
		
	}
	static {
		System.out.println("Static Block 2");
	}
	static {
		System.out.println("Static BLock3");
	}
	
	public  void sayHello(String name) {
		this.name=name;
		System.out.println("Hello..."+name);
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main method");
		main();
		//sayHello();
		DemoOnStatic ds1=new DemoOnStatic();
		ds1.sayHello("Harsha");
		DemoOnStatic ds2=new DemoOnStatic();
		ds2.sayHello("Poojari");
		System.out.println(name);
		
		
		
		
	}
	public static void main()
	{
		System.out.println("Static Main without Argument");
	}
	static {
		System.out.println("Static Block 4");
	}

}
