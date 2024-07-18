package com.graymatter;

import java.util.Date;

public class Employee extends Person{
private String deptName;
private double salary;
private Date dateOfJoining;
public Employee() {
	super();
}
public Employee(String name, int id, String mobile, String email, Date dob, String deptName, double salary,
		Date dateOfJoining) {
	super(name, id, mobile, email, dob);
	this.deptName = deptName;
	this.salary = salary;
	this.dateOfJoining = dateOfJoining;
}
@Override
public String toString() {
	return "Employee [deptName=" + deptName + ", salary=" + salary + ", dateOfJoining=" + dateOfJoining
			+  ", toString()=" + super.toString() + "]";
}

}
