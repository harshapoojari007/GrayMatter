package com.grayMatter;

import java.util.Arrays;
import java.util.List;
class Prime{
	public static boolean isPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
}
public class Assignment3 {
public static void main(String[] args) {
	List<Integer> li=Arrays.asList(3,5,6,8,11,9,34,2221,34423);
	li.stream().filter(Prime::isPrime).forEach(System.out::println);
}
}
