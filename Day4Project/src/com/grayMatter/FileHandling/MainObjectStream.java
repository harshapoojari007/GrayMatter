package com.grayMatter.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainObjectStream {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Customer c=new Customer("Harsha",117);
	System.out.println(c);
	
	FileOutputStream fos=new FileOutputStream("obj.txt");
	ObjectOutputStream out=new ObjectOutputStream(fos);
	
	out.writeObject(c);
	out.close();
	fos.close();
	
	FileInputStream fis=new FileInputStream("obj.txt");
	ObjectInputStream in=new ObjectInputStream(fis);
	
	Customer c1=(Customer)in.readObject();
	System.out.println(c1);
	
	
	
//	
}
}
