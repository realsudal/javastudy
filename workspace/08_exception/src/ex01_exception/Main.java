package ex01_exception;

/*
 * 1. exception : 예외 - 개발자가 회피할수있는 수준의 오류
 * 				-심각하면 에러임
 * 2. 모든 예외는 exception 클래스를 상속받은 클래스이다.
 * 
 */

public class Main {

	public static void main(String[] args) {
		//	System.out.println(2/0); 					ArithmeticException
		//Integer.parseInt(""); 						NumberFormatException  - 정수가아닌 오류
		/*String name=null;
		name.equals("jam");  								NullPointerException-널 오류*/
		//int[] a=new int[3];	a[30]=10;				ArrayIndexOutOfBoundsException:배열범위 벗어남
			
	}

}
