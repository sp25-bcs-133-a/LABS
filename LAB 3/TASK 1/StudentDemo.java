public class StudentDemo{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student("Tayyaba Riaz", "11-11-05", "Female", "Bahria Orchard");
		Student s3 = new Student("Tayyaba Riaz", "11-11-05", "Female", "Bahria Orchard");

		Student s4 = new Student(s2);

	System.out.println(s1.toString());
	System.out.println(s2.toString());
	System.out.println(s3.toString());

	if(s1.equals(s2))
		System.out.println("Same.");
	else
		System.out.println("Same.");


	}
}