package q1Ex03Package;

public class Song {
	private Singer artist;
	private String title;
	private String album;
	int streams=0;
	
	public Song(String n, String a) {
		this.title=n;
		this.album=a;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getStreams() {
		return streams;
	}
	
	public void setArtist(Singer s) {
		this.artist=s;
	}
	
	public void viewSong() {
		System.out.printf("Song %nTitle: %s %nAlbum: %s %nArtist: %s %nStreams: %d %n%n", title, album, artist.getSinger(), streams);
	}
}
