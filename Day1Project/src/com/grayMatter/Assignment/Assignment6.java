package com.grayMatter.Assignment;

import java.util.Scanner;

import com.grayMatter.Student;

public class Assignment6 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int n=sc.nextInt();
    switch(n) {
    case 1:System.out.println("ONE");break;
    case 2:System.out.println("TWO");break;
    case 3:System.out.println("THREE");break;
    case 4:System.out.println("FOUR");break;
    case 5:System.out.println("FIVE");break;
    case 6:System.out.println("SIX");break;
    case 7:System.out.println("SEVEN");break;
    case 8:System.out.println("EIGHT");break;
    case 9:System.out.println("NINE");break;
    case 10:System.out.println("TEN12");break;
    default:System.out.println("Number Limits to 10");
    }

	}
}
