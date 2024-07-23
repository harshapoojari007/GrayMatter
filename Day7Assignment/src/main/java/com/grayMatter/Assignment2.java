package com.grayMatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment2 extends Thread {
public static void main(String[] args) {
	List<Double> li=Arrays.asList(1.0,2.0,3.0,4.0,5.0,56.0,0.0);
	System.out.println(li.stream().mapToDouble(i->i).average());
	
	
	
}
  }

