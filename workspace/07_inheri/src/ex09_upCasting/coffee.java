package ex09_upCasting;

public class coffee {

	private String bean;

	public coffee(String bean) {
		super();
		this.bean = bean;
	}
	
	public void info() {
		System.out.println("원두의 원산지 : "+ bean);
	}
	
	public void taste() {
		System.out.println("맛이 쓰다.");
	}
	
}
