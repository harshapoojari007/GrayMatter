package com.grayMatter;

import java.util.HashSet;

public class PersonMain {
public static void main(String[] args) {
	HashSet<Person> persons=new HashSet<Person>();
	Person p1=new Person("Harsha",21,"Udupi","1234567");
	Person p2=new Person("Harsh",20,"Udupi","1234567");
	Person p3=new Person("Hars",17,"Udupi","1234567");
	Person p4=new Person("Har",16,"Udupi","1234567");
	Person p5=new Person("Poojari",18,"Udupi","1234567");
	persons.add(p1);
	persons.add(p2);
	persons.add(p3);
	persons.add(p4);
	persons.add(p5);
	
	persons.stream().filter(i->
	{
		try{if(i.getAge()<18)
			throw new InvalidAgeToVote("Age not Sufficient:"+i.getAge());
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}).forEach(System.out::println);;
}
}
