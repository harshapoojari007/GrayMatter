package com.grayMatter.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
public static void main(String[] args) throws IOException {
	File  file=new File("demo.txt");
	System.out.println(file.getName());
	System.out.println(file.getParent());
	System.out.println(file.getPath());
	System.out.println(file.getAbsolutePath());
	
	System.out.println(file);
	
	FileWriter fw=new FileWriter(file);
	
	
	
	fw.write("Harsha");
	String str="Harsha Poojari Is the Boss";
	for(char c:str.toCharArray())
		fw.write(c);
	fw.close();
	System.out.println(file);
	
	
	FileReader fr=new FileReader(file);
	int ch;
	StringBuffer sbf=new StringBuffer("");
	while((ch=fr.read())!=-1) {
		
		sbf.append((char)ch);
	}
	
	System.out.println(sbf.toString());
	
	fr.close();
	
	
	//FIle Class methods
	
	File fnew=new File("create.txt");
	
	System.out.println(fnew.createNewFile());
	
	
	
	
	
	
	
}
}