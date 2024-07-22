package com.grayMatter;

import java.util.Date;
import java.util.Scanner;

public class App implements UserInterface{
	
	AppEngine a=new AppEngine();
	
	public void initialAddings() {
		a.register(new Student(117, "Harsha Poojari", new Date("05/05/2003")));
		a.introduce(new Course(112,"B.Tech","4 Year",1000));
		
	}

	
	public static void scenario1() {
		
		Student s1=new Student(117, "Harsha Poojari", new Date("05/05/2003"));
		Student s2=new Student(118, "Aditya Poojari", new Date("12/12/2004"));
		Student s3=new Student(119, "Roopesh Poojari", new Date("12/12/2005"));
		Student s4=new Student(120, "Manish Poojari", new Date("12/12/2006"));
		
		Info i=new Info();
		i.display(s1);
		i.display(s2);
		i.display(s3);
		i.display(s4);
	}
	public static void scenario2() {
		Student []st=new Student[3];
		st[0]=new Student(121, "Sudarshan Poojari", new Date("05/06/2003"));
		st[1]=new Student(122, "Prathap Poojari", new Date("12/10/2004"));
		st[2]=new Student(123, "Prashanth Poojari", new Date("12/02/2005"));
		
		Info i1=new Info();
		for(Student i:st)
		{
			i1.display(i);
		}
		
	}
    
	public static void scenario3() {
		Student []st=new Student[3];
		for(int i=0;i<3;i++)
		{
		 System.out.println("For student "+(i+1));
		 System.out.println("Id:");
		 Scanner sc=new Scanner(System.in);
		 int id=sc.nextInt();
		 System.out.println("Name:");
		 String name=sc.next();
		 System.out.println("DOB:");
		 String dateofbirth=sc.next();
		 
		 Date d=new Date(dateofbirth);
		 st[i]=new Student(id, name,d);
		 
		 
		 
		}
		Info i1=new Info();
		for(Student i:st)
		{
			i1.display(i);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		scenario1();
//		scenario2();
//		scenario3();
		
		
		//AppEngine a=new AppEngine();
//		a.register(new Student(117, "Harsha Poojari", new Date("05/05/2003")));
//		a.introduce(new Course(100, "B.TECH","4 Years", 100000));
//	   System.out.println(a.listOfCourses()); 
//		a.listOfStudents();
//		a.enroll(new Student(117, "Harsha Poojari", new Date("05/05/2003")), new Course(100, "B.TECH","4 Years", 100000));
		
//		a.listOfEnrollments();
		
	
//		
		App a1=new App();
		a1.initialAddings();
		a1.showFirstScreen();
		
//		
		
		
		
		
	}
	@Override
	public void showFirstScreen() {
		// TODO Auto-generated method stub
		
		boolean ch=true;
		do {
		System.out.println("Welcome to SMS(Student Mgmt. System) v1.0"); 
		 System.out.println("Tell us who you are : \n1. Student\n2. Admin\n3. Exit"); 
		 System.out.println("Enter your choice ( 1 or 2 ) : "); 
		 Scanner scanner = new Scanner(System.in); 
		 int op = Integer.parseInt(scanner.nextLine()); 
		 switch(op) { 
		 case 1: 
		 showStudentScreen(); 
		 break; 
		 case 2: 
		 showAdminScreen(); 
		 break; 
		 case 3:
			 ch=false;break;
		 } 

		}while(ch);
	}
	@Override
	public void showStudentScreen() {
		// TODO Auto-generated method stub
		boolean ch=true;
		do {
		System.out.println("1. Register New Student\n2. Enroll\n3. Go Back");
		 System.out.println("Enter your choice: "); 
		 Scanner scanner = new Scanner(System.in); 
		 int op = Integer.parseInt(scanner.nextLine()); 
		 switch(op) { 
		 case 1: 
			 showStudentRegistrationScreen();
		 break; 
		 case 2:
			 enrollingCourse();break;
//		 case 3:
//			 enrollments();break;
		 case 3:
			 ch=false;break;
			 
		 default:System.out.println("Invalid choice");
		 } 
		}while(ch);
		
	}
	@Override
	public void showAdminScreen() {
		// TODO Auto-generated method stub
		boolean ch=true;
		do {
		System.out.println("1. Introduce New Course\n2. List All Students\n3. List All Courses\n4. List all enrollments\n5. Go Back");
		 System.out.println("Enter your choice: "); 
		 Scanner scanner = new Scanner(System.in); 
		 int op = Integer.parseInt(scanner.nextLine()); 
		 switch(op) { 
		 case 1: 
			 introduceNewCourseScreen() ;
		 break; 
		 case 2:showAllStudentsScreen();break;
		 case 3:showAllCoursesScreen();break;
		 case 4:showAllEnrollments();break;
		 case 5:ch=false;break;
		 default:System.out.println("Invalid choice");
		 } 
		
		}while(ch);
	}
	@Override
	public void showAllStudentsScreen() {
		// TODO Auto-generated method stub
		Info i1=new Info();
		for(Student i:a.listOfStudents())
		{
			i1.display(i);
		}
		
		
	}
	@Override
	public void showStudentRegistrationScreen() {
		// TODO Auto-generated method stub
		
		 System.out.println("Id:");
		 Scanner sc=new Scanner(System.in);
		 int id=sc.nextInt();
		 System.out.println("Name:");
		 String name=sc.next();
		 System.out.println("DOB:");
		 String dateofbirth=sc.next();
		 Date d=new Date(dateofbirth);
		 
		 a.register(new Student(id, name,d));
		 System.out.println("Student Registered Successfully");
		
		
		
		
	}
	@Override
	public void introduceNewCourseScreen() {
		// TODO Auto-generated method stub
		 System.out.println("Id:");
		 Scanner sc=new Scanner(System.in);
		 int id=sc.nextInt();
		 System.out.println("Name:");
		 String name=sc.next();
		 System.out.println("Duration:");
		 String dur=sc.next();
		 System.out.println("FEES:");
		 double fees=sc.nextDouble();
		
		 
		 a.introduce(new Course(id, name,dur,fees));
		 System.out.println("Course Added Successfully");
		
		
	}
	@Override
	public void showAllCoursesScreen() {
		// TODO Auto-generated method stub
		Info i1=new Info();
		for(Course i:a.listOfCourses())
		{
			i1.display(i);
		}
		
	
		
		
	}
	
	public void showAllEnrollments(){
		// TODO Auto-generated method stub
		Info i1=new Info();
		for(Enroll i:a.listOfEnrollments())
		{
			i1.display(i);
		}
		
	
		
		
	}
	
	
   public void enrollingCourse() {
	   
	  
	     System.out.println("Student Id");
		 Scanner sc=new Scanner(System.in);
		 int sid=sc.nextInt();
		 
		 showAllCoursesScreen();
		 System.out.println("Please select the above courses");
		   
		   
		 System.out.println("Course Id:");
		 int cid=sc.nextInt();
		 String sname=a.getSName(sid);
		 Date dob=a.getDate(sid);
		 String cname=a.getCName(cid);
		 String dur=a.duration(cid);
		 double fees=a.fees(cid);
		 
		 a.enroll(new Student(sid,sname,dob),new Course(cid,cname,dur,fees));
		 System.out.println("Successfully Enrolled for the Course");
		
	}
   
   public void enrollments(){
	   System.out.println("Student Id");
	   Scanner sc=new Scanner(System.in);
	   int sid=sc.nextInt();
	   
	   Info i1=new Info();
		for(Enroll i:a.listOfEnrollments())
		{
			Student s=i.getStudent();
			if(s.id==sid)
			i1.display(i);
		}
   }
   
   
}
