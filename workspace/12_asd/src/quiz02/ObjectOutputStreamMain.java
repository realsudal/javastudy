package quiz02;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamMain {

	public static void main(String[] args) {

		ObjectOutputStream oos=null;
		
		try {
			oos=new ObjectOutputStream(new FileOutputStream("board.dat"));
			//1.개별저장이 가능
			Board board1=new Board("공지", "필수","관리인");
			//2. arraylist 저장 가능
			List<Board> boardList=new ArrayList<Board>();//보드 객체에는 반드시 직렬화가 필요함
			boardList.add(new Board("필독","읽기", "관리자"));
			boardList.add(new Board("dsad", "dasdasf", "fdsafsdaf"));
			
			System.out.println("파일이 생성");
			oos.writeObject(boardList);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos!=null)oos.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
