package com.grayMatter.Multithreading;

public class DemoOnThreads extends Thread{
	
	@Override
		public void run() {
			// TODO Auto-generated method stub
//			System.out.println("In Run method");
//			System.out.println(currentThread().getName());
//			System.out.println(currentThread().getPriority());
//			System.out.println(currentThread().MAX_PRIORITY);
//			System.out.println(currentThread().MIN_PRIORITY);
//			System.out.println(currentThread().isAlive());
//			System.out.println(currentThread().isDaemon());
		
		  for(int i=0;i<5;i++)
		  {
			  System.out.println(currentThread().getId()+" "+i);
		  }
		}
public static void main(String[] args) throws InterruptedException {
	System.out.println(currentThread().getName());
	System.out.println(currentThread().getPriority());
	System.out.println(currentThread().MAX_PRIORITY);
	System.out.println(currentThread().MIN_PRIORITY);
	System.out.println(currentThread().isAlive());
	System.out.println(currentThread().isDaemon());
	System.out.println();
	
	DemoOnThreads dot=new DemoOnThreads();
	dot.start();
	
	
	DemoOnThreads dot1=new DemoOnThreads();
	//dot1.sleep(3000);
	dot1.start();
	
	
	
}
}
