package ex08_casting;

public class Main {
									//☆☆☆☆☆☆☆☆☆☆☆☆
	public static void main(String[] args) {
		
		Tv tv=new Tv(200, "samsung");
		tv.info();//tv클래스의 info를 호출 (elec아님!) 
		
		Elec e=tv; //up- casting :tv타입의 객체를 elec 타입으로 변환 (= 자식클래스->'부모클래스로' 변환)
					//up casting은 별도의 문법이없음!
		e.info();//elec클래스의 info!!!
		
		/*메소드의 호출
		 	1.객체의 타입에 따라 결정된다. : 호출할 메소드를 결정하는 것을 '바인딩'이라고 한다.
		 	2.자바는 "동적 바인딩"이다
		 		1) 메소드 호출 시점(실행 전)에는 객체의 타입을 본다.  - 정적바인딩
		 			Elec e=tv;  이므로 elec.info()는 elec꺼
		 		2) 실행전 실제 객체를 확인한다.									- 동적바인딩
		 			Tv tv=new Tv(200, "samsung"); 이므로 tv객체가 tv타입인것을 인지함
		 		3)실제객체 타입으로 바꿔서 호출하고 싱행한다.			-
		 			elec.info()가 실행될때 까지는 tv의 info()가 호출된다.
		*/
		
		
		
		Elec e2=new Tv(300, "LG"); //e2도 Elec으로 선언했으니까 elec 클래스 안에있는 info
		e2.info();
	}

}
