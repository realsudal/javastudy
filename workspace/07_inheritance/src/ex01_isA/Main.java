package ex01_isA;

//student 도 eat을 하고싶음

/*
 * 상속(inheritance)
 * 	-어던 클래스가 다른클래스의 기능을 확장해서 가지는 것
 *	-상속이 가능한 대표적인  클래스 관계는 is-a 관계
 *	-is a
 *		person is a student 사람은 학생이다.x
 *		student is a person	학생은 사람이다.o ->is a 관계(부분집합)
 *		(수퍼)studet는 person의 기능 을 확장 가능하다.
 *
 */

/*
 * 슈퍼 클래스와 서브 클래스
 *  -class 부모 클래스(person)
 *  -class 자식 클래스(student) extends 슈퍼클래스 {}
 *  
 */

public class Main {

	public static void main(String[] args) {
		Person p=new Person();
		
		p.eat();
		
		Student s=new Student();
		s.study();
	}

}
