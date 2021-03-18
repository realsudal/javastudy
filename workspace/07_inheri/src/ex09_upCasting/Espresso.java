package ex09_upCasting;

public class Espresso extends coffee{

	private int water;

	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("물 : "+water+"ml");
	}
	
	@Override
	public void taste() {
		System.out.println("에스프레소는 진하다.");
	}
}
