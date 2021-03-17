package ex04_constructor;
//부모가 먼저 태어나야 자식이 태어나기 가능  -> sub클래스의 new
//'서브클래스의 생성자'는 '슈퍼클래스의 생성자'를 "반드시" 먼저 호출해야된다! (생략 가능한 경우 : 슈퍼클래스의 생성자가 "디폴트 생성자"일 때)

import ex03_hasA.student;

/*슈퍼클래스 키워드
 * 	-super.멤버 : super.필드, super.메소드()
 * 	-super() : super클래스의 생성자 호출
 * 	
 */

public class Student extends Person{
	
	private String school;
	
	public Student(String name,String school) {
		super(name);	//반드시 super의 생성자가 먼저!!!!!!!!!!!!!!
		this.school=school;
		
	}
	
	public void info() {
		System.out.println(school);
		System.out.println(getName());//상속을 했으니 메소드를 가져와 쓸수있음 , 필드는 private라 안됨
	}
	

	
}
