package com.grayMatter.Calculator;

import java.util.List;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Scientific sc=new Scientific();
//    sc.add(1, 2);
//    sc.sub(1, 3);
//    sc.div(9, 3);
//    sc.mul(5, 05);
//    sc.pow(2, 3);
//    sc.sqrt(36);
//    
//    Arithmetic ac=new Scientific();
//    ac.pow(3, 9);
		
		MyScientificCalculator msi=new MyCalculator();
		msi.pow(1,2);
		
		MyCalculator ms=new MyCalculator();
		ms.add(7,4);
		ms.sqrt(9);
		
		MyCalculator mc=new MyCalculator();
	//	mc.owner(); not possible 
		
		MyScientificCalculator.owner();
		
		
		
		
    
    
}}
	
