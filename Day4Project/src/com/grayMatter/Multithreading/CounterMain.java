package com.grayMatter.Multithreading;

public class CounterMain extends Thread{

	CounterClass cc;

	public CounterMain() {
		super();
	}

	public CounterMain(CounterClass cc) {
		super();
		this.cc = cc;
	}
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.print(currentThread().getId()+" ");
			cc.updateCount();
			try {
				sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		CounterClass cc=new CounterClass();
		CounterMain cm1=new CounterMain(cc);
		CounterMain cm2=new CounterMain(cc);
		
		cm1.start();
		cm2.start();
		
	}
	
}
