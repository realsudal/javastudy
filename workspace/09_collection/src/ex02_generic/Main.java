package ex02_generic;

public class Main {

	public static void main(String[] args) {

		Box<String,Integer> box1=new Box<String, Integer>();	//타입의 구체화
		box1.setItem1("mimis");
		box1.setItem2(5);
		
		System.out.println(box1.getItem1()+","+box1.getItem2());
		
		
		Box<String,Pet> box2=new Box<>();
		box2.setItem1("앨리스");
		box2.setItem2(new Pet("댕댕이",2));
		System.out.println(box2.getItem1()+","+box2.getItem2());
		
		
	}

}
