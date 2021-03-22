package ex17_Object.ex01;

//object 클래스
//1. 모든 클래스의  최상위 슈퍼클래스이다.
//2. extends 처리는 하지않는다.
//3. 모든 데이터는 object타입으로 저장할 수 있다.

public class Main {

	public static void main(String[] args) {

		Object obj1=1;
		Object obj2=1.5;
		Object obj3=new Dog();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		//Object에 저장된 객체는!!!!!!!!!!!!!!!!!!!!!!!
		//다운캐스팅한(super->sub) 뒤 사용가능합니다!!!!!!!!!!
		((Dog)obj3).move();
	}

}
