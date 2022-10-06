package q1Ex03Package;

public class Main {
	public static void main(String[] args){
		Song heh = new Song("heh", "curse");
		Singer Jeep = new Singer("Jeep");
		Singer Benz = new Singer("Benz");
		
		heh.setArtist(Jeep);
		heh.viewSong();
		
		Jeep.setFavSong(heh);
		Jeep.viewArtist();
		
		Benz.setFavSong(heh);
		Benz.setFavSong(heh);
		
		Venue WemSta = new Venue("Wembley Stadium");
		WemSta.displayVenuePoints();
		WemSta.levelUpAll(10);
		WemSta.displayVenuePoints();
		
		Jeep.performForAudience(100, heh);
		Jeep.viewArtist();
		
		Benz.performForAudience(100, Jeep, heh);
		Benz.viewArtist();
		
		Jeep.viewArtist();
		
		Singer.getTotalPerformances();
		
		Jeep.performForAudienceInVenue(10000, WemSta, Benz, heh);
		Jeep.viewArtist();
		Benz.viewArtist();
		
		Singer.getTotalPerformances();
		
		heh.viewSong();
	}
}
