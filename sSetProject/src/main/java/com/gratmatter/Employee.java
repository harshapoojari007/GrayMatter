package com.gratmatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Comparable{
private int id;
private String name;
private double salary;
private String city;

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Employee e=new Employee();
	e=(Employee)o;
	
	//return this.getId()-e.getId();
	//return this.getName().compareTo(e.getName());
	return (int) (this.getSalary()-e.getSalary());
}




}
