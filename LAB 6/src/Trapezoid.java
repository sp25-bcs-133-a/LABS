public class Trapezoid extends Plot{
	private double length;
	private double width;
	private double height;

	public double calculateArea(){
		return 0.5 * height * (length + width);
	}
}