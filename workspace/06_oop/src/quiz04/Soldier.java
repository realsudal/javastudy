package quiz04;

public class Soldier {
	private String name;
	private Gun gun;
	
	
	Soldier(String name,Gun gun){
		this.name=name;
		this.gun=gun;
	}
	
	
	void shoot() {
		
		System.out.println("빵야 -> ");
		gun.info();
		System.out.println("발남앗ㅅㅂ니다");
	}
	
	void reload(int i) {
		
	}
	
	void info() {
		
	}
}
