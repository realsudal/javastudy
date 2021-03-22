package ex01_generic;

public class Main {

	public static void main(String[] args) {

		Box<String> box1=new Box<String>();		//"구체화"가 진행됨  ->  Box의 모든 T가 String으로 변환되어 실행됨
		//Box<String> box1=new Box<>();  뒤에 String 없어도, 위와 같은코드
		
		box1.setItem("하이");
		System.out.println(box1.getItem());
		
		/*
		 <※주의사항※>
		 
		제네릭 타입의 구체화는 "기본자료형"(int,double)으로 불가능하다.(=참조형만 가능)
		기본자료형이 필요한 경우, 해당 wrapper class(=Integer 같은 풀네임사용하는 db에좋은거 잇잔아)를 사용한다.
		
		*/
		Box<Integer> box2=new Box<Integer>();
		box2.setItem(100);
		System.out.println(box2.getItem());
		
		
		Box<Fruit> box3=new Box<Fruit>();
		box3.setItem(new Fruit("apple", 1000));
		System.out.println(box3.getItem());
	}

}
