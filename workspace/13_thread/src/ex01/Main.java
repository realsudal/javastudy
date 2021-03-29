package ex01;

public class Main {

	public static void main(String[] args) {

		Person p1=new Person("뿡이");
		Person p2=new Person("탭응");
		Person p3=new Person("태풍");
		/*
		p1.eat();
		p2.eat();
		p3.eat();
		*/
		
		//thread 호출 - thread는 JVM에 의해서 스케줄링되기 때문에 코드작성 순서대로 작동하지 않을 수 있음
		
		p1.start();//자동으로 p1의 run메소드를 실행한다.
		p2.start();
		p3.start();
		
		System.out.println("모두 식사끝남");	//thread상활일때는 틀린 메시지.
	}

}
