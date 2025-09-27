// Name: Tayyaba Riaz
// Reg no: SP25-BCS-133

public class Student{
	private String name;
	private String email;
	private double cgpa;

	public Student(String name, String email, double cgpa){
		this.name = name;
		this.email = email;
		this.cgpa = cgpa;
		
		display();
	}

	public void display(){
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("CGPA: " + cgpa);
	}

	public void setName(String name){
		this.name = name;
		display();
	}

	public void getName(){
		System.out.println("Name: " + name);
	}


}