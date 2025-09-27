public class Student{
	private String id;
	private String name;
	private Date dob;
	private Gender gender;
	private Address address;

	// Static because it needs to be accessible at class level.
	static int counter;



	// A parametered constructor. Since our id will be auto-generated, it is not important to add it as an argument.
	Student(String name, Date dob, Gender gender, Address address){
		id = String.format("SP25-BCS-%03d", counter++);
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
	}



	// A default constructor. It has no arguments and is used to create objects which will have pre-defined default values. When object is created using copy without any initializing, following values will be shown.
	Student(){
		id = String.format("SP25-BCS-%03d", counter++);
		this.name = "No Name";
		this.dob = new Date(1, 1, 1);
		this.gender = Gender.NotSet;
		this.address = new Address("No", "Address", "Set");
	}



	// A copy constructor. It takes another object as an argument and copies it into a new object.
	Student(Student s){
		this.id = s.getID();
		this.name = s.getName();
		this.dob = s.getDOB();
		this.gender = s.getGender();
		this.address = s.getAddress();
	}



	// Display.
	@Override
	// Don't need to pass in varibles as arguments because they are global variables.
	public String toString(){
		return String.format("%s %10s %10s %10s %10s", id, name, dob, gender, address);
	}


	// Compare two objects by id.
	@Override
	public boolean equals(Object o){
		Student s = (Student)o;
		return this.id.equals(s.getID());
	}


	// Setters.
	public void setID(String id){
		this.id = id;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setDOB(Date dob){
		this.dob = dob;
	}

	public void setGender(Gender gender){
		this.gender = gender;
	}

	public void setAddress(Address address){
		this.address = address;
	}




	// Getters.
	public String getID(){
		return id;
	}

	public String getName(){
		return String.format("%s", name);
	}

	public Date getDOB(){
		return dob;
	}

	public Gender getGender(){
		return gender;
	}

	public Address getAddress(){
		return address;
	}
}