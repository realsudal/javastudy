package ex02_try_catch;
/*
 *	 try{
 * 			코드작성(예외가 발생할수도 있음.
 * 		}catch(예외처리 매개변수){
 * 			예외 처리
 * 		}
 */
public class Main {

	public static void main(String[] args) {

			int a=0;
		
		
			try {
				//System.out.println(2/0);		//예외가 발생하면 try문이 바로 종료됨. ->실행 안됨
				Integer.parseInt("1.5");
				a=10;
			}catch(NumberFormatException e) {
				System.out.println("null 예외가 발생했습니다.");
			}catch (ArithmeticException e) {
				System.out.println("나눌 수 없는 수 예외가 발생했습니다.");
			}
		System.out.println(a);  //결과는 0
		
		
		
		try {
			String name=null;
			name.contentEquals("james");
			
		}catch(NullPointerException e) {
			System.out.println("널 이다.");
		}catch (Exception e) {
				System.out.println("무슨 예외든지 다 발생시켜줌 ");
		}
		
		
		
		
		
		
		
	}

}
