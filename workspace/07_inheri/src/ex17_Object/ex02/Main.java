package ex17_Object.ex02;

public class Main {

	public static void main(String[] args) {

		Dog dog=new Dog("땝응이");
		
		System.out.println(dog);
		System.out.println(dog.toString()); //바로 위 코드와 같은 코드임.
		
		/*
		 * <Object 클래스의 toString>
		 * 
		 * public String toString(){
		 * 				return getClass().getName()+"@"+hashCode(); //클래스@메모리 참조값
		 * }
		 */
		
		
		
		
		
		
	}

	

}
