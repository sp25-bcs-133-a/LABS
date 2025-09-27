public class StudentDemo{
	public static void main(String[] args){
		Student s5 = new Student("Fatima Riaz", new Date(22, 3, 14), "Female", "Bahria Orchard");  // Parameterized constructor with Date object.
		Student s6 = new Student(s5); // Copy constructor.
		Student s7 = new Student(); // Default constructor.

		System.out.println(s5.toString());
		System.out.println(s6.toString());
		System.out.println(s7.toString());

		s5.setID("SP25-BCS-001");
		s6.setID("SP25-BCS-002");
		s7.setID("SP25-BCS-003");

		System.out.println("");

		System.out.println(s5.toString());
		System.out.println(s6.toString());
		System.out.println(s7.toString());

	}
}