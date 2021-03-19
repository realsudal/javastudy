package ex16_interface_expend;

public class Dog extends Pet implements Walkerable  {
	//dog는 슈퍼클래스 타입이 2개이다.
	//pet, walkerable 

	public Dog(String name) {
		super(name);
	}

}
