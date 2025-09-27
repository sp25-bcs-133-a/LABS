public class StudentDemo{
	public static void main(String[] args){
		Student s8 = new Student("Fatima Riaz", new Date(22, 3, 14), "Female", new Address("158-J", "Bahria Orchard", "Pakistan"));  // Parameterized constructor with Address object.
		Student s9 = new Student("Tayyaba Riaz", new Date(11, 11, 5), "Female", new Address("158-J", "Bahria Orchard", "Pakistan"));
		Student s10 = new Student(); // Default constructor.

		System.out.println("");

		System.out.println(s8.toString());
		System.out.println(s9.toString());
		System.out.println(s10.toString());

	}
}