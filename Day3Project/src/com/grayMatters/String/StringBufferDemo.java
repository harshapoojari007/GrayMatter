package com.grayMatters.String;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sbf1=new StringBuffer("Hello");
		StringBuffer sbf2=new StringBuffer("");
		 System.out.println(sbf2.capacity());
		 sbf1.toString();
		 
		 System.out.println(sbf2.isEmpty());
		 System.out.println(sbf2.length());
		 System.out.println(sbf1);
		 System.out.println(sbf1);
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 
		 String []names=new String[3];
		 names[0]="Harsha";
		 names[1]="String";
		 names[2]="seetha";
		 
		 
		 for(String st:names)
		 {
			 if(st.startsWith("S"))
					 System.out.println(st);
		 }
		 
		 String para="Hello This this is Graymatter Company";
		 String sarr[]=para.split(" ");
		 
		 System.out.println(Arrays.toString(sarr));
		 
		 StringTokenizer tokens=new StringTokenizer(para," ");
		 while(tokens.hasMoreTokens())
			 System.out.println(tokens.nextToken());
		 
		 StringJoiner sjr =new StringJoiner(",");
		 sjr.add("Apple");
		 sjr.add("Banana");
		 
		 System.out.println(sjr);
		 
		 
	}
}
