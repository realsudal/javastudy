package ex08_static;

public class KoreanMain {

	public static void main(String[] args) {

		//korean1 ==인스턴스
		Korean korean1=new Korean();
		
		
		//인스턴스 필드에 접근하기 인스턴스 korean1을 통해 접근한다.
		korean1.name="정재현";
		
		//클래스 필드(static)에 접근하기
		System.out.println(korean1.country);	//방법1 . 인스턴스로 접근 (추천하지않습니다)
		System.out.println(Korean.country);	//방법2. 클래스로 접근
		
	}

}
