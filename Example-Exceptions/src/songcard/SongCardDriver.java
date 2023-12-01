package songcard;

public class SongCardDriver {

	public static void main(String[] args) {
		
		SongCard myCard = new SongCard(2);
		myCard.buyASong();
		myCard.activate();
		myCard.activate();
		myCard.buyASong();
		myCard.buyASong();
		myCard.buyASong();
	}

}
