package ex17_Object.ex02;

public class Dog {

	private String name;
	
	public Dog(String name) {
		super();
		this.name=name;
	}
	
	
	/*Object클래스의 toString()을 사용하지 않기 위해서
	 * toString() 메서드를 오버라이드 하겠다!
	 */
	
	@Override
	public String toString() { 	//객체가 가지고있는 값들을 살펴보는 용도로 좋음

		return "[name : " +name+"]";
	}
	
	
}
