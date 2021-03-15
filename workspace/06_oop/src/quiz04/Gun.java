package quiz04;

public class Gun {
	private String model;
	private int bullet;//현재 발
	private final int al=6; //최대발
	
	Gun (String model,int bullet){
		this.model=model;
		this.bullet=bullet;
	}

	
	public void Bullet() {
		if(bullet<0) {
			return;
		}
		System.out.println(bullet);
		this.bullet--;
	}
	
	public void info() {
		System.out.println("현재 "+bullet+"발남음");
	}

	public int getAl() {
		return al;
	}
	
	
}
