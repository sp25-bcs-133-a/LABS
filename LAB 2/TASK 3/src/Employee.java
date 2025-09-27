// Tayyaba Riaz
// SP25-BCS-133 A

public class Employee{
	private String name;
	private double ssNumber;
	private double baseSalary;
	private String address;

	public Employee(String name, double ssNumber, double baseSalary, String address){
		this.name = name;
		this.ssNumber = ssNumber;
		this.baseSalary = baseSalary;
		this.address = address;
	}

	public void display(){
		System.out.println("Employee Information");
		System.out.println("Name: " + name);
		System.out.println("Social Security Number: " + ssNumber);
		System.out.println("Basic Salary: " + baseSalary);
		System.out.println("Address: " + address);
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		System.out.println("Displaying Updated Employee Name");
		return name;
	}
}
