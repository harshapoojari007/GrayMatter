package com.grayMatter;

import java.util.ArrayList;
import java.util.List;

public class Assignment1 {
	
public static void main(String[] args) {
	List<String> li=new ArrayList<String>();
	li.add("Harsha");
	li.add("Naman");
	li.add("Karthik");
	li.add("Varma");
	li.add("Thomas");
	li.add("Milton");
	
	li.stream().sorted().forEach(System.out::println);
}
}
