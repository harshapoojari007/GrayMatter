package com.grayMatter;

import java.util.Arrays;

public class Asssignment5 {
public static void main(String[] args) {
	String s="package com grayMatter public class Asssignment5public class void main String args";
	
   System.out.println(Arrays.stream(s.split("\\s+")).count());
}
}
