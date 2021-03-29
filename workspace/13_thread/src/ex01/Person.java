package ex01;
/*
 * 스레드 (thread)
 * 		1. 자바의 세부 작업 단위이다.
 * 		2. 생성방법 (택 1)
 * 						- 1)Thread  클래스를 상속 받음.->상속받은 애들이 (extends Thread)  <- 지금 클래스에서 사용
 * 						- 2) Runnable 인터페이스를 구현한다. (implements Runnable)
 * 		3. 기본 규칙
 * 					단계1)run() 메소드 : 스레드의 작업을 작성하는 메소드이다.(오버라이드해서 사용함)
 * 					단계2)start() 메소드 : 스레드를 실행하는 메소드이다. (run()메소드를 호출하지않는다)
 */
public class Person extends Thread {


	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public void eat() {
		
			System.out.println(name+"(이)가 먹는 음식을 먹는 중이다.");
		
	}

	@Override
	public void run() {//스레드가 동작 시키는 메소드
		for(int i=0;i<3;i++) {
			eat();
		}
	}


	
}
