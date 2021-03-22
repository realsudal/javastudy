package ex12_abstract;
//정사각형
public class Square extends Rectangle {

	// field가 없습니다.
	
	// constructor
	public Square(int width) {
		super(width, width);
	}
	
	// Rectangle의 메소드는 이미 사용할 수 있습니다.
	// getter, setter, getArea()는 이미 사용할 수 있습니다.
	
}