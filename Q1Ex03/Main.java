
public class Main {
	//Create your own Java class (you may use as a basis the one represented by data in Exercise 01) with at least one constructor, and create 
		//three instances of that class in the main method.

	//Make another class called Song with at least one constructor. Determine the fields and methods that would belong to such a class 
		//and create another two instances.
	
	//Lastly, create a class called Singer with at least one constructor with the following fields and methods:
	
	//name - String
	//noOfPerformances - integer
	//earnings - double
	//favoriteSong - Song
	//performForAudience(given number of people) - increases noOfPerformances by 1 and earnings by 100 for each person 
		//(e.g. 5 people results in 500 increase)
	//changeFavSong(new Song) - changes favoriteSong
	//In the main method, make an instance of a Singer. Assign a favorite Song to the Singer, and have the Singer perform for 12 people. 
		//Then, change the favorite Song of the Singer.
	
	//Send a zip containing the project (should have 4 java files, one for each class and one with a main method).
	
	
	public static void main(String[] args) {
		Song heh = new Song("heh", "curse");
		Singer Jeep = new Singer("Jeep");
		
		heh.setArtist(Jeep);
		heh.viewSong();
		Jeep.setFavSong(heh);
		Jeep.viewArtist();
		
		Jeep.performForAudience(500);
		Jeep.viewArtist();
		heh.viewSong();
		
	}
	
}
