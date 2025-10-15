public class Plot{
	private String name;
	private Type type;
	private double price;
	private boolean availability;

	Plot(Type type, boolean availability){
		name = type.getName();
		this.type = type;
		price = type.getPrice();
		this.availability = availability; 
	}

	@Override
	public String toString(){
		return String.format("[%s - %.2f - %b]", name, price, availability);
	}
}