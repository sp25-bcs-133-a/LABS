public class SeatDemo{
	public static void main(String args[]){
		Cinema c1 = new Cinema("IPEX", 2);

		c1.getScreen(0).showScreen();

		c1.getScreen(0).bookSeat("1-003");

		c1.getScreen(0).showScreen();
		c1.getScreen(1).showScreen();
	}
}