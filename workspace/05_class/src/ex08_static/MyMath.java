package ex08_static;

public class MyMath {

	//private한 생성자 -MyMath 내부에서만 객체 생성이 가능(= new 외부작성 불가능)
	private MyMath() {
		
	}
	public  static final double PI= 3.141592;
	
	//절댓값 메소드
	public static double abs(double n) {
		return(n>0)? n:-n;
	}
	
	//제곱 메소드
	public static double pow(double n,int m) {//n의 m제곱
		double result=1;
		for(int i=0;i<m;i++) {
			result*=n;
		}
		return result;
	}
	
}
