public class L_Shape extends Plot{
	private double length1;
	private double width1;
	private double length2;
	private double width2;

	public double calculateArea(){
		return (length1 * width1) + (length2 * width2);
	}
}