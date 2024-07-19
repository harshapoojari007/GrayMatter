package com.grayMatter.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOnByteStreams {
public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("demo.txt");
	String s="Harsha";
	fos.write(s.getBytes());
	fos.close();
	
	FileInputStream fin=new FileInputStream("demo.txt");
	StringBuffer sb=new StringBuffer();
	int ch;
	while((ch=fin.read())!=-1) {
		sb.append((char)ch);
	}
	System.out.println(sb.toString());
	fin.close();
}
}
