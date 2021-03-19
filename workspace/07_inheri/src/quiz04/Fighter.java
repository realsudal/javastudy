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
	public abstract  void attack(Fighter fighter);


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isAlive() {
		return isAlive;
	}


	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}


	public int getEnergy() {
		return energy;
	}


	public void setEnergy(int energy) {
		this.energy = energy;
	}


	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}

	
	public void info() {
		System.out.println("이름 :"+name+", 에너지"+energy+"공격력 : "+power+"]");
	}

	
}
