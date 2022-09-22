public class Singer {
	private String name;
	private int noOfPerformances;
	private double earnings=0;
	private Song favoriteSong;
	
	public Singer(String n) {
		this.name = n;
	}
	
	public String getSinger() {
		return name;
	}
	
	public void setFavSong (Song s) {
		this.favoriteSong = s;
	}
	
	public void viewArtist() {
		System.out.printf("Artist %n%nName: %s %nNumber of Performances: %d %nEarnings: %.2f %nFavorite Song: %s %n%n", name, noOfPerformances, earnings, favoriteSong.getTitle());
	}
	
	public void performForAudience(int audience) {
		this.noOfPerformances  += 1;
		this.favoriteSong.streams +=1;
		for (int i=0; i<audience;i++) {
			this.earnings += 100;
		}
	}
	
	public void changeFavSong(Song ns) {
		this.favoriteSong=ns;
	}
}
