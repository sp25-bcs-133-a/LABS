public class Address{
	String street;
	String city;
	String country;

	public Address(String street, String city, String country){
		this.street = street;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString(){
		return String.format("%s, %s, %s", street, city, country);
	}
}