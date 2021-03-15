package ex07_recusive;

public class Calculater {
	
	//getFactorial()메소드는 n!값을 반환한다.
	//3! =3x2x1 =>연산속도를 확인해서 메모리 활동을 테스트 할수있음
	
	
	public int getFactorial(int n) {
		
		if(n==1) {
			return 1;
		}else {
			return n*getFactorial(n-1);
		}
				
	}
}
