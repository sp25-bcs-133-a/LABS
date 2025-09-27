public class DataTypes {
	public static void main(String a[]){
		System.out.println("Basic Types in Java:");

		long l = 100; // Big numbers.
		int i = 10;
		short s = 50; // Small numbers to 2^16.
		byte b = 50; // Used to store integers.
		
		double d = 10.0;
		float f = 20.0f; // Error because float is 8 bytes and 20.0 is 4 bytes.
				// So f is used.

		char c = 'c';

		boolean b1 = true; // Booleans are true or false and are stored in 1 byte.

		// The 8 types of java's primitive data types.
		// String is not included in this.

		System.out.println("Print and cursor moves to new line.");
		System.out.print("Print and curor remains on the same line.");

		System.out.printf("\nThe integer is %d.", i); // %f for float, %d for digits.
		System.out.printf("\nThe long is %d.", l);
		System.out.printf("\nThe short is %d.", s);
		System.out.printf("\nThe long is %d.", b);

		System.out.printf("\nThe double is %f.", d);
		System.out.printf("\nThe float is %f.", f);
		
		System.out.printf("\nThe character is %c.", c);
		
		System.out.printf("\nThe boolean is %b.", b1);

		System.out.printf("\nMy name is %s", "Tayyaba."); // Negative sign (-50) aligns left. It is written between % and s sign.
		
		System.out.err("Error Log"); // Message printed to the standard error stream.
	}
}