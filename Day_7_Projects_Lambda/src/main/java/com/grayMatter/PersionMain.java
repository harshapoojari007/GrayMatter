package com.grayMatter;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Predicate;

public class PersionMain {
public static void main(String[] args) {
	ArrayList<Person> persons=new ArrayList<Person>();
	Person p1=new Person("Harsha Poojari",35,new Date("05/05/2003"));
	Person p2=new Person("Aditya Poojari",36,new Date("05/04/2003"));
	Person p3=new Person("Shamanth Poojari",40,new Date("05/05/2001"));
	Person p4=new Person("Kiran Poojari",22,new Date("05/05/2002"));
	Person p5=new Person("Rahuk Poojari",20,new Date("05/05/2004"));
	
	persons.add(p1);
	persons.add(p2);
	persons.add(p3);
	persons.add(p4);
	persons.add(p5);
	
	
	Predicate<Person> p=(person)->{
		if(person.getAge()>35 && (person.getName().startsWith("A")||person.getName().startsWith("a")))
			return true;
		return false;
	};
	persons.forEach((person)->{
		if(p.test(person))
			System.out.println(person);
	});
	
	
	
}
}
