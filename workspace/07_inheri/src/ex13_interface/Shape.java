package ex13_interface;
/*
 * 인터페이스
 * 		1. 모든 메소드가 추상 메소드인 추상 클래스이다.
 * 		2. jdk 1.8 이후에 default 메소드와 static 메소드를 가질수있다.
 * 		3. 모든 필드는 fanal 상수를 가진다. (변하지않음)
 */
public interface Shape{ //interface == abstract calss

	
	//모든 ㅎ도형은 크기가잇다
	public abstract double getArea();	//interface는 public abstract를 생략해도 자동으로 삽입되고 처리됩니다. 중 요 , , ! (☆☆☆☆☆☆☆☆☆☆☆)
	
	

	
	
}
