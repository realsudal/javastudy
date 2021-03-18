package ex06_override;

public class Coffee {

	private String bean;
	
	public Coffee(String bean) {
		this.bean=bean;
	}
	public void taste() {
		System.out.println(bean+" 원두는 맛이 없습니다.");
	}
}
