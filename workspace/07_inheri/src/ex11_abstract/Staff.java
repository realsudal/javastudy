package ex11_abstract;

/*1. 추상 메소드
 * 			-본문이 없는 메소드
 * 			-메소드를 정의할 때 abstract 키워드를 추가한다.
 * 			-중괄호'{ }'를 빼고, 세미콜론' ; '을 붙 임 . 
 * 2. 추상 클래스
 * 			-추상 메서드가 1개 이상 포함된 클래스
 * 			-클래스 정의아페 abstract 키워드를 추가합니다.
 * 	
 */

public abstract class Staff { 	//추상 클래스~

	private String name;
	
	//생성자
	public Staff(String name) {
		super();
		this.name = name;
	}
	
	//메소드
	public void info() {
		System.out.println("직원명 : "+name);
	}
	
	/*
	public int getPay() {
		
		return 반환할 수 있는 값은 없음;
	}
	*/
	//이럴때 추상 메서드를 씀.
	
	public abstract int getPay(); //abstract public 도 가능.    <-	추상 메서드~
	
}
