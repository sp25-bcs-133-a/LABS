public class StudentDemo{
	public static void main(String[] args){
		Student s11 = new Student("Fatima Riaz", new Date(22, 3, 14), Gender.Female, new Address("158-J", "Bahria Orchard", "Pakistan"));  // Parameterized constructor with enum gender.
		Student s12 = new Student("Saqlain Haider", new Date(30, 11, 3), Gender.Male, new Address("158-J", "Bahria Orchard", "Pakistan"));
		Student s13 = new Student(); // Default constructor.

		System.out.println("");

		System.out.println(s11.toString());
		System.out.println(s12.toString());
		System.out.println(s13.toString());

	}
}