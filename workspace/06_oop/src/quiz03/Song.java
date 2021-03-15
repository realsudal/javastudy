package quiz03;

public class Song {
	
	
	private String title;
	private double playTime;
	
	Song(String title, double playTime){
		this.title=title;
		this.playTime=playTime;
	}
	void info() {
		System.out.println(title+","+playTime);
	}
	
	
}
