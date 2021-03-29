package ex05_throw;

public class Calculator {

	
	private int result;
	
	public void addion(int a) {
		result+=a;
		System.out.println(result);
	}
	public void sub(int a) {
		result-=a;
		System.out.println(result);
	}
	public void div(int a)throws ArithmeticException,NumberFormatException { //2.div 메소드가 어떤 예외들을 던지는 지 적어준다.
		if(a==0) {
			throw new ArithmeticException();	//1. 예외를 직접 던집니다.
		}
		result/=a;
		System.out.println(result);
	}
	public void multi(int a) {
		result*=a;
		System.out.println(result);
	}
	
	
	
}
