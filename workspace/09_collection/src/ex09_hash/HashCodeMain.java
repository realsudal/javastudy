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
		// TODO Auto-generated method stub

	}

}
