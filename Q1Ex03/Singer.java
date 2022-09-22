public class Singer {
	private String nameSinger;
	private int noOfPerformances;
	public double earnings=0;
	private Song favoriteSong;
	private Venue venVal;
	
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
	
	public void performForAudience(int audience) {
		this.noOfPerformances  += 1;
		for (int i=0; i<audience;i++) {
			this.earnings += 100;
			this.favoriteSong.streams +=1;
		}
	}
	
	public void performForAudienceInVenue(int audience, Venue vn) {
		this.venVal=vn;
		double venueVal = venVal.getVenueValue();
		
		this.noOfPerformances  += 1;
		for (int i=0; i<audience;i++) {
			this.earnings += (100 + venueVal*0.30);
			this.earnings -= (venueVal*0.15);
			this.favoriteSong.streams +=1;
		}
	}
	
	public void changeFavSong(Song ns) {
		this.favoriteSong=ns;
	}
}
