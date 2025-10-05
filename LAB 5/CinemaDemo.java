public class CinemaDemo{
	public static void main(String args[]){
		CityCinema karachiCinemas = new CityCinema("KARACHI", 2);
		CityCinema lahoreCinemas = new CityCinema("LAHORE", 2);
		CityCinema islamabadCinemas = new CityCinema("ISLAMABAD", 2);

		lahoreCinemas.addCinema("LOL", 2);
		lahoreCinemas.findCinema("LOL").getScreen(0).showScreen();
		lahoreCinemas.getCinema(2).getScreen(0).bookSeat("1-001");
		lahoreCinemas.getCinema(2).getScreen(0).showScreen();
		lahoreCinemas.removeCinema("LOL");
		lahoreCinemas.showAllCinemas();
	}
}