package ex01_generic;

/*
 * <generic-제네릭>
 * 			ㄴ(일반화된 타입을 이용해서) 클래스 또는 메소드를 정의해 두고, "객체 생성or 메소드 호출시" 구체적으로 "타입을 지정"하는 방법
 */


public class Box<T> {	//box생성시 box<String> .. 등으로 사용된다.
	
	//필드
	private T item;

	
	//게터 세터
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}
