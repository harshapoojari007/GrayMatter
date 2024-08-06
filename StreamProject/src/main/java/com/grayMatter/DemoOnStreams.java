package com.grayMatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoOnStreams {
public static void main(String[] args) {
	Stream<Integer> stream=Stream.of(10,20,30);
	System.out.println(stream);
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(4);
	al.add(29);
	al.add(30);
	Stream<Integer> stream1=al.stream();
	stream1.forEach((s)->{
		System.out.println(s);
	});
	
	System.out.println(al.stream().count());
	al.stream()//Stream Generatio
	.limit(2)
	.filter(i->i%2==0)//Inter
	.map(i->i+10)//Intermediat Op
	.forEach(i->System.out.println(i));//terminal
	
	List<Integer> list= al.stream()//Stream Generatio
	.limit(2)
	.filter(i->i%2==0)//Inter
	.map(i->i+10)//Intermediat Op
//    .forEach(i->System.out.println(i));//terminal
	.collect(Collectors.toList());
	
	System.out.println(list);
	
	
	List<Integer> all=Arrays.asList(1,2,3,4,4,5,65,9);
	all.stream()
	.distinct()
	.forEach(i->System.out.println(i));
	
	
	List<String> str=Arrays.asList("Harshe","Mane","MS","MG");

	str.stream()
	.filter(i->i.endsWith("e"))
	.map(i->i.toUpperCase())
	.forEach(i->System.out.println(i));
	
	
	int total= all.stream()
    .skip(3)
    .reduce(0,(a,b)->a+b);
 
    System.out.println(total);
    
    List<Integer> fact=Arrays.asList(1,2,3,8,6,5);
    List<Integer> li= fact.stream()
	.map(i->{
		int f=1;
		for(int j=1;j<=i;j++)
			f*=j;
		return f;
	}).collect(Collectors.toList());
	//System.out.println(all);
    System.out.println(li);
    
    
    //MapToInt
    System.out.println(li.stream().mapToInt(i->i).sum());
    System.out.println(li.stream().mapToInt(i->i).max());
    System.out.println(li.stream().mapToInt(i->i).min());
    System.out.println(li.stream().mapToInt(i->i).average());
    li.stream().mapToInt(i->i).sorted().forEach(System.out::println);
    
    
    List<String> str1=Arrays.asList("Harsha","Manish","MS","MG");
    str1.stream()
    .filter(s->s.length()>5)
    .map(s->s.toUpperCase())
    .forEach(i->System.out.println(i));
    
    System.out.println(fact);
    fact.stream()
   .mapToInt(i->i).sorted().skip(fact.size()-2).limit(1).forEach(System.out::println);
    
    fact.stream()
    .mapToInt(i->i).sorted().limit(2).skip(1).forEach(System.out::println);
    
    //List of strings in alphabetical order
    //Average of List of Doubles
    //If a number is prime or not
    //concatenate to strings
    //Count words in paragraph
    
    
    List<String> str2=Arrays.asList("Harsha","Manish","MS","MG");
    
    
    
    
    
    
    
    
}
}
