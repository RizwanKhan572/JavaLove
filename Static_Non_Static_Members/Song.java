package Static_Non_Static_Members;

public class Song {
	
	String artist;
	String title;
	
	void play() {
		
		
		System.out.println(artist+" playing "+ title);
	}
	
	public static void main(String[] args) {
		
		Song track1=new Song();
		track1.artist="Arijit";
		track1.title="Sawre";
		
		track1.play();
		
		Song track2=new Song();
		track2.artist="KK";
		track2.title="Tum mile";
		
		track2.play();
	}
	
	
}
