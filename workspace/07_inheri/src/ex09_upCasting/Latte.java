package ex09_upCasting;

public class Latte extends Espresso {

	private int milk;

	public Latte(String bean, int water, int milk) {
		super(bean, water);
		this.milk = milk;
	}
	
	@Override
	public void info() {
		super.info(); //espreso의 info함수
		System.out.println("우유를 "+milk+" ml 추가합니다.");
	}
	
	@Override
	public void taste() {
		System.out.println("라떼는 부드럽다.");
	}
	
}
