public class Venue {
	private String nameVenue;
	private int lightsValue = 10;
	private int stageValue = 100;
	private int decorationValue = 50;
	private int venueValue;
	
	public Venue (String nV) {
		this.nameVenue=nV;
	}
	
	public Venue (String nV, int lV, int sV, int dV) {
		this.nameVenue=nV;
		this.lightsValue = lV;
		this.stageValue = sV;
		this.decorationValue = dV;
	}
	
	public Venue (String nV, int all) {
		this.nameVenue=nV;
		this.venueValue = all;
	}
	
	public String getNameVenue () {
		return nameVenue;
	}
	
	public void levelUpAll(int allAmount) {
		for(int i=0; i<allAmount; i++) {
			this.lightsValue+=20;
			this.stageValue+=100;
			this.decorationValue+=50;
		}
	}
	
	public void levelUpLights(int lightsAmount) {
		for(int i=0; i<lightsAmount; i++) {
			this.lightsValue+=20;
		}
	}
	
	public void levelUpStage(int stageAmount) {
		for(int i=0; i<stageAmount; i++) {
			this.stageValue+=100;
		}
	}
	
	public void levelUpDecor (int decorAmount) {
		for(int i=0; i<decorAmount; i++) {
			this.decorationValue+=50;
		}
	}
	
	public int getVenueValue () {
		this.venueValue = this.lightsValue + this.stageValue + this.decorationValue;
		return venueValue;
	}
	
	public void displayVenuePoints () {
		this.venueValue = this.lightsValue + this.stageValue + this.decorationValue;
		System.out.printf("%s %nTotal venue points: %d %n%n", nameVenue, venueValue);
	}
}
