package ex09_hash;
/*
 * 몇몇 아이디가 있습니다.
 * 각각의 해시코드를 몇몇 규칙으로 생성해보자
 * 
 * 1)첫 글자에 따라서 해시코드를 정한다
 * 							해시코드
 * apple					1
 * africa				1
 * avatar				1
 * banana				2	
 * bous					2
 * bravo				2
 * 
 * 2)글자수에 따라 해시코드를 정한다
 *  							해시코드
 * apple					5
 * africa				6
 * avatar				6
 * banana				6
 * bous					5
 * bravo				5
 * 
 * 
 * 입력의 아이디를 검색하고자 한다.
 * 검색 속도를 높이기 위햐서 hash 개념 사용됨
 * 
 * 
 * 검색예시
 *	검색할 아이디 : april
 *	사용 해시코드 :글자수
 *			1.april의 해시코드(글자수)를 구함 -> 5
 *			2.해시코드가 5인 apple,bonus,bravo 중에서 april을 찾음
 */
public class HashCodeMain {

	public static void main(String[] args) {

		
		
		Integer a=10;
		System.out.println(a.hashCode());
		
		Double b=1.5;
		System.out.println("b의 해시코드 : "+ b.hashCode());
		
		String str="hello";
		System.out.println("str의 해시코드 : "+str.hashCode());
		
		
		//결론 : 내장된 클래스 타입의 객체들은 나름의 해시태그가 있다.
		
		Dog dog=new Dog();
		Cat cat=new Cat();
		
		System.out.println(dog); //- 주소
		System.out.printf("%x \n",dog.hashCode());//object의 해쉬코드 - 주소
		
		System.out.println(cat);
		System.out.printf("%x \n",cat.hashCode());//object의 해쉬코드
		
		
		//결론 : object의 hashcode 는 객체의 메모리 주소를 반환한다.
		
		
		/*
		   <hashset과 hashmap의 공통점>
		 		ㄴ 중복이 불가능한 데이터가 있음.
		 		
		 	->중복확인 방법
		 			ㄴ 1) 해시코드 확인(hashCode())함.해시코드가 같아야 다음단계를 실행
		 			ㄴ 2) 실제로 같은지 비교한다. (equals()메서드로)
		 			ㄴ 3) 그 결과가 같으면 "중복 데이터" 가 있는 것으로 판단함
		 */
		
		
		
		
	}

}

class Dog{} //아무것도 안들어있으니 object
class Cat{}	//아무것도 안들어있으니 object