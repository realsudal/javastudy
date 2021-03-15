package ex02_operater;

public class Ex01_operator {

	public static void main(String[] args) {
		//산술연산자 : +, -,*, /, %
		int x=1;
		int y=2;
		
		int temp=x;
		x=y;
		y=temp;
		
		
		//money를 5%증가 시키기
		int money=100;
		double per=money*0.05;
		
		money+=(int)per;
		System.out.println(money);
		
		//money*=1.05; ->한방에 5% 증가
		
		
		
		
	}

}
