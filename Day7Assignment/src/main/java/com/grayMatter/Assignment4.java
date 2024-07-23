package com.grayMatter;

import java.util.Arrays;
import java.util.List;

public class Assignment4 {
public static void main(String[] args) {
	List<String> li=Arrays.asList("H","A","R","S","H","A");
	System.out.println(li.stream().reduce("",(a,b)->a+b));
}
}
