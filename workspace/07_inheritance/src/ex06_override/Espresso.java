package ex06_override;

public class Espresso extends Coffee {

	private int water;

	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}
	
	
	//Espresso클래스는 이미 coffee클래스의 메소드를 사용 가능
	//Espresso클래스는 coffee클래스의 teste()메소드를 사용 불가!!!!!!!!!
	//Espresso는 새롭게 taste메소드 만드는 것이 좋다.
	
	/*-메소드 오버라이딩
	 * 	슈퍼 클래스의 메소드를 이용하지 않기 위해서 서브클래스가 슈퍼클래스의 메서드를 다시 정의하는 것	
	 * 	주의!! - 똑! 같! 이! 만들어야됨 !@@@@!!!!!!!!!!!!
	 * 	@Override : 애노테이션 - 자바야~ 이거 오버라이딩이다~ 알려줌
	 * 
	 */
	
	
	@Override
	public void taste() {
		System.out.println("에스프레소는 쓰다.");
	}
}


