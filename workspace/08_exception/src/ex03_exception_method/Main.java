package ex03_exception_method;

public class Main {

	public static void main(String[] args) {

		try {
			int a=2/0;
		}catch (ArithmeticException e) {
				//e에는 뭐가 들어있을까 ?
			System.out.println("예외 메시지 : "+ e.getMessage()); //e 에 들어있는 메시지
			e.printStackTrace();//어디서 예외인지 알려줌 (개발자에게~^^,개발자가 넣어줌)
			
		}
		
	}

}
