package com.grayMatter.ExceptionHandling;

public class Main {
public static void main(String[] args) throws InvalidAgeToVote{
	Person p=new Person("Harsha",89098789,17);
	
	if(p.getAge()<18)
		throw new InvalidAgeToVote("Person age should be minimum 18" );
	
}
}
