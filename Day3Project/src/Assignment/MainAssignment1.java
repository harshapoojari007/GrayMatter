package Assignment;

public class MainAssignment1 {
public static void main(String[] args) {
	User c=new Customer();
	User e=new Employee();
	User a=new Admin();
	
	c.setDetails("Surya", "surya007", "surya@gmail.com", "12345");
	e.setDetails("Hemant", "Hemant007", "Hemant@gmail.com", "12345");
	a.setDetails("Sangam", "Sangam007", "Sangam@gmail.com", "12345");
	
	a.getDetails();
	e.getDetails();
	c.getDetails();
}
}
