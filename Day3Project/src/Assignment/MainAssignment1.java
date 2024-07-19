package Assignment;

public class MainAssignment1 {
public static void main(String[] args) {
	User c=new Customer();
	
 c=new Admin();
	
	c.setDetails("Surya", "surya007", "surya@gmail.com", "12345");
	c.display();
	
	 c=new Employee();
	c.setDetails("Hemant", "Hemant007", "Hemant@gmail.com", "12345");
	c.display();
	
	 c=new Employee();
	c.setDetails("Sangam", "Sangam007", "Sangam@gmail.com", "12345");
	c.display();
	
}
}
