package ex10_downCasting;

import ex03_hasA.student;

/*
 * downcasting
 */
public class Main {

	public static void main(String[] args) {
		//컴파일->실행
		//코드 -> new 처리
		
		Person p1;
		p1=new Student();
		p1.eat();
		p1.sleep();
		//p1.study(); //Person p; 만보고 호출할 메소드를 결정하기 때문에 불가능.
		
		//person타입의 p1을 stdent 타입으로 변경해줌
		//작업 1 : (Student)p1
		//작업 2 : (Student)p1.study() : 정상 동작하지 않는다.      		*연산자 촤우선 순위 :  ' . ' 마침표, 	=> p1.study()가 먼저 호출되버림 ㅜ => 괄호 필요
		//작업 3 : ((Student)p1).study() : 캐스팅을 먼저 처리하고 나면 study()가 호출된다.
		((Student)p1).study();
		
		
		
		Person p2=new Worker();
		p1.eat();
		p1.sleep();
		((Worker)p2).work(); 		//☆☆☆☆☆☆☆☆☆ 프로그램에서 아주중요한 코드 (다운캐스팅)
		
		Person p3=new Student();
		p1.eat();
		p1.sleep();
		((Worker)p3).work();  	// java.lang.ClassCastException 오류
		
		
		//타입을 확인한 뒤 캐스팅 할 수 있다.
		//ex) p3가 student이면 Student로 캐스팅하고
		//p3가 worker이면 Worker로 캐스팅하라.
		
		if(p3 instanceof Student) {// p3가 student'의 객체이면'~ 
			((Student)p3).study();
		}else if(p3 instanceof Worker) {
			((Worker)p3).work();
		}
	}
	
	
	

}
