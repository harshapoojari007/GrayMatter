package Assignment;

public  class User {
	String name;
	String username;
	String email;
	String id;
	
	
	void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name="+name+" Username="+username+" Email="+email+" Id="+id);
		
	}


	void setDetails(String name, String username, String email, String id) {
		// TODO Auto-generated method stub
		this.name=name;
		this.username=username;
		this.email=email;
		this.id=id;
		
		
	}
	public void display() {
		System.out.println("This is User class");
	}

}
