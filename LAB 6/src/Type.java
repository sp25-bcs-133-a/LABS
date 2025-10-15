public enum Type{
	RES_5_MARLA("RES_5_MARLA", 4000000), RES_10_MARLA("RES_10_MARLA", 500000), RES_1_KANAL("RES_1_KANAL", 14000000), COMM_SHOP("COMM_SHOP", 3000000), COMM_OFFICE("COMM_OFFICE", 5000000), PARKING("PARKING", 200000);

	private String name;
	private double price;
	Type(String name, double price){
		this.name = name;
		this.price = price;
	}

	public String getName(){
		return name;
	}

	public double getPrice(){
		return price;
	}
}