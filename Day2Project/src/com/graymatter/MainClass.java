package com.graymatter;

public class MainClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
     
     
     School sc=new School("Sandeepan","Udupi");
     
     Student st[]=new Student[3];
     st[0]=new Student("Harsha",123);
     st[1]=new Student("Adi",124);
     st[2]=new Student("Mani",125);
     
     ClassRoom c=new ClassRoom(7,4,st);
     
     System.out.println(sc);
     System.out.println(c);
     for(int i=0;i<3;i++)
    	 System.out.println(st[i]);
     
     MainClass mc=new MainClass();
     mc.finalize();
     
	}
	@Override
	protected  void finalize() throws Throwable {
		System.out.println("Manal invoke to finalize");
		System.gc();
	}

}
