package ex06_throw;

public class Main {

	public static void main(String[] args) {

		//계산기를 만들어서 4가지연산 수행. 발생하수 있는 예외 예상
		
		Calculator c=new Calculator();
		try {
			c.addion(5);
			c.div(0);
			c.multi(5);
			c.sub(5);
		}catch(ArithmeticException e) {
			System.out.println("오류.");
		}
				//10/0   :   exception
				//10.0/0.0    :  infinite(무한대)
		
	}

}
