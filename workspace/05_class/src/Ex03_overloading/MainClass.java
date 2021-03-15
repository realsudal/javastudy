package Ex03_overloading;



public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 오버로딩 
		 * 	'메소드의 이름이 같아도' '매개변수의 갯수'나 '매개변수의 타입'이 다르면 => 다른 메소드가 가능함
		 */
		
		//직사각형
		Rectangle sq=new Rectangle();

		sq.set(-3,-4);
		System.out.println("넓이 : "+sq.getArea());
	}

}
