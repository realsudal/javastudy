package ex09_hash;

import java.util.HashSet;
import java.util.Set;

public class BoardMain {

	public static void main(String[] args) {
		
		Board board1=new Board(1000,"공지","관리자");
		Board board2=new Board(1000,"공지","관리자");
		Board board3=new Board(1000,"공지","관리자");
		
		//동일한건 저장이 안된다고 했는데 정말 그럴까?
		Set<Board> set=new HashSet<Board>();
		set.add(board1);
		set.add(board2);
		set.add(board3);
		
		System.out.println(set);
		
	}

}
