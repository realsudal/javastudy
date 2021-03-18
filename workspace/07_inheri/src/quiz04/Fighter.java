package quiz04;

public abstract class Fighter {

	private String name;
	private boolean isAlive; //에너지가 0이면 거짓
	private int energy; 	//1~100
	private int power; //공격력(1~10)
	
	public Fighter(String name, int energy, int power) {
		super();
		this.name = name;
		this.energy = energy;
		this.power = power;
		this.isAlive=true;
	}
	
	
	//메서드
	public abstract  void attack(Fighter fighter) {
		
	}
	
	
	
}
