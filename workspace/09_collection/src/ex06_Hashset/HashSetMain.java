package ex06_Hashset;

import java.util.HashSet;
import java.util.Set;

/*
 * HashSet 클래스
 *	 	1. Set 인터페이스를 구현한 클래스 입니다,
 * 		2. 기본특징 (집합같음)
 * 			-인덱스가 없음 (순서가 없음)
 * 			-중복저장이 불가능
 * 		3. 기본적인 사용법 List와 같지만, 인덱스가 없음에 주의한다.
 * 
 * 
 */
public class HashSetMain {

	public static void main(String[] args) {
		
		//선언
		Set<String> set=new HashSet<String>();
		//추가
		set.add("java");
		set.add("java");
		set.add("jsp");
		set.add("jsp");
		set.add("spring");
		set.add("spring");
		//개수 세기
		System.out.println("요소개수 : "+set.size());
		
		
		
		// ~향상 for문~  (출력방법)
		for(String s:set) {
			System.out.println(s);
		} 
		
		
		
	}

}
