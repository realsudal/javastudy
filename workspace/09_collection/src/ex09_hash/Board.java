package ex09_hash;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {

	private int bNo;
	private String title;
	private String writer;
	@Override
	public String toString() {
		return "[bNo=" + bNo + ", title=" + title + ", writer=" + writer + "]";
	}
	
	@Override
	public int hashCode() {
		//return 1; 모든 보드는 해쉬코드가 1 - > 허접함
		//return title.length(); //타이틀의 글자수가 같으면, 같은 Board의 가능성이있음
		return title.length()+writer.length();	// 타이틀의 글자수 +글쓴이 글자수 가 같으면 같은 게시물일 가능성이 있음 
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj instanceof Board) {	//전달받은 값이 보드인지 확인
			Board board=(Board)obj;
			return this.bNo==board.bNo;		//게시글번호 (bNo)가 같으면 같은 Board이다.
		}
		return false;//전달 값이 board가 아님
	}
}


/*
 		HashSet에 Board를 저장하고자 합니다. 
 		
 		동일한 Board의 경우 저장이 안되도록 설정을 해야한다.
 		
 		1. 자바의 기본동작
 			- 저장할 Board의 hashcord를 확인한다. (저장된 주소)
 		 	- 같은 해시코드를 가지고있는 Board가 있습니까 ? ->없음
 		 	- 따라서 같은 Board는 없음
 		 	- 따라서 무조건 저장됨
 		
 		2.추가해야 할 작업
 			-같은 Board는 같은 해시코드를 가질 수 있도록 hashCode() 메소드를 오버라이드 합니다.
 			-같은 Board인지 비교할 수 있도록 equals() 메소드를 오버라이드 해줘야함
 			-같은 해시코드를 가지고 , equals() 결과가 true이면 동일한 Board가 있다고 판단 하므로 저장되지않는다.
 			
 			
 			
 		최종결론 : hash 기반의 컬렉션 프레임 워크 (해시셋,해시맵 ..) 애 저장할 객체들은 모두 source의  gennerate hashcode and equals ()탭에서 만들자.
 */







