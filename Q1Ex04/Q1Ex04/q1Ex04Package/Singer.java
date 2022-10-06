package q1Ex04Package;

public class Singer {
	private String nameSinger;
	private int noOfPerformances;
	private double earnings=0;
	private Song favoriteSong;
	private Venue venVal;
	private static int totalPerformances;
	
	public Singer(String n) {
		this.nameSinger = n;
	}
	
	public String getSinger() {
		return nameSinger;
	}
	
	public void setFavSong (Song s) {
		this.favoriteSong = s;
	}
	
	public void viewArtist() {
		System.out.printf("Artist %nName: %s %nNumber of Performances: %d %nEarnings: %.2f %nFavorite Song: %s %n%n", nameSinger, noOfPerformances, earnings, favoriteSong.getTitle());
	}
	
	public static void getTotalPerformances() {
		System.out.printf("Amount of performances of all singers combined: %d%n%n", totalPerformances);
	}
	
	public void performForAudience(int audience, Song song) {
		this.noOfPerformances  += 1;
		Singer.totalPerformances  += 1;
		for (int i=0; i<audience;i++) {
			this.earnings += 100;
			song.streams +=1;
		}
	}
	
	public void performForAudience(int audience, Singer duet, Song song) {
		this.noOfPerformances  += 1;
		duet.noOfPerformances  += 1;
		Singer.totalPerformances  += 1;
		for (int i=0; i<audience;i++) {
			this.earnings += 100/2;	
			duet.earnings += 100/2;	
			song.streams +=1;
		}
	}
	
	public void performForAudienceInVenue(int audience, Venue vn, Song song) {
		this.venVal=vn;
		double venueVal = venVal.getVenueValue();
		
		this.noOfPerformances  += 1;
		Singer.totalPerformances  += 1;
		for (int i=0; i<audience;i++) {
			this.earnings += (100 + venueVal*0.30);
			this.earnings -= (venueVal*0.15);
			song.streams +=1;
		}
	}
	
	public void performForAudienceInVenue(int audience, Venue vn, Singer duet, Song song) {
		this.venVal=vn;
		double venueVal = venVal.getVenueValue();
		
		this.noOfPerformances += 1;
		duet.noOfPerformances += 1;
		Singer.totalPerformances  += 1;
		for (int i=0; i<audience;i++) {
			//Adding income
			this.earnings += (100 + venueVal*0.30);
			duet.earnings += (100 + venueVal*0.30);
			
			
			//Taking money for renting venue
			this.earnings -= (venueVal*0.15);
			duet.earnings -= (venueVal*0.15);
			
			//Adding to song streams
			song.streams +=1;
		}
	}
	
	public void changeFavSong(Song ns) {
		this.favoriteSong=ns;
	}
}
