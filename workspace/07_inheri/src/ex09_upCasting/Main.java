package ex09_upCasting;

public class Main {

	public static void main(String[] args) {
		
		//up-casting 이 없는경우   => 타입이 다르다,커피마다 커피를 담는 컵이 다르다.
		Espresso espresso=new Espresso("콜롬비아", 800);
		Latte latte=new Latte("비싼인도", 800000, 90000);
		espresso.info();
		espresso.taste();
		System.out.println(" ");
		latte.info();
		latte.taste();
		
		System.out.println("\n upcating");
		//up-casting : 자식 Espresso가 부모인 coffee를 업 캐스팅함
		coffee c1=new Espresso("콜롬비아", 10);
		coffee c2=new Latte("콜롬뺙", 15,150);
		
		c1.info();
		c1.taste();
		System.out.println(" ");
		c2.info();
		c2.taste();
	}

}
