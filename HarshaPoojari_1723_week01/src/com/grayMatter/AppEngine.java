package com.grayMatter;

import java.time.LocalDate;
import java.util.Date;

public class AppEngine {
	Student []s=new Student[10];
	Course  []c=new Course[5];
	Enroll  []e=new Enroll[10];
	int i=0;
	int j=0;
	int k=0;
	public void introduce(Course course) { 
		c[j]=course;
		j++;
		
	 } 
	 public void register(Student student) { 
		 s[i]=student;
		 i++;
		 
	 } 
	 public Student[] listOfStudents() {
		return s; 
		 
	 } 
	 public Course[] listOfCourses() {
		return c; 
	 } 
	 public void enroll(Student student, Course course) { 
		 
		 e[k]=new Enroll(student,course,LocalDate.now());
		 k++;
	 } 
	 public Enroll[] listOfEnrollments() {
		return e;
	 } 
	 
	 
	 public String getSName(int id1)
	 {
		 for(Student st:s)
		 {
			 if(st.id==id1)
				 return st.name;
		 }
		 return "";
	 }
	 
	 public Date getDate(int id1)
	 {
		 for(Student st:s)
		 {
			 if(st.id==id1)
				 return st.dateofbirth;
		 }
		 return new Date();
	 }
	 public String getCName(int id1)
	 {
		 for(Course co:c)
		 {
			 if(co.id==id1)
				 return co.name;
		 }
		 return "";
	 }
	 
	 public String duration(int id1) {
		 for(Course co:c)
		 {
			 if(co.id==id1)
				 return co.duration;
		 }
		 return "";
		 
	 }
	 
	 public double fees(int id1)
	 {
		 for(Course co:c)
		 {
			 if(co.id==id1)
				 return co.fees;
		 }
		 return 0;
	 }

}
