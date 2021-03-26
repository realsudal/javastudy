package ex01_char;

import java.io.FileReader;

/*
FileRead 클래스
1. "문자 기반 + 입력 스트림"입니다. (Reader)
2. 상대방이 보낸문자를 읽을때 사용합니다.
   1) 통신 : 상대방이 보낸문자를 읽을때
   2) 파일 : 텍스트 파일을 읽을 때
3. 입력 메소드
   read()
4. 출력 단위
   char[],int
5. 예외 처리가 필요합니다.
*/
public class FileReaderMain {

	public static void main(String[] args) {

	try(FileReader fr=new FileReader("text1.txt")){
		//read() 메소드를 이용해서 읽기
		char[] cbuf=new char[5]; 	//배열이 5개라 덮어쓰기하면 => 안녕하세요.반갑습니다.갑습  나옴.
		while(true) {
			int readCahrCount=fr.read(cbuf);//읽은 내용은 cbuf에 저장되고, readcharcount에는 읽은 문저의 갯수가 저장
							//파일 끝에 도달하면 -1 을 readcharCount에 반환
			if(readCahrCount==-1)
				break;
			System.out.println(cbuf);
		}
		
		
		
		/*
		while(true) {
			int ch=fr.read();//ch에 읽은문자되거나 혹은 -1(파일을 다 읽었을때=종료조건) 이 저장됨
			if(ch==-1) {
				break;
			}
			System.out.print((char)ch);
		}*/
		int ch=0;
		while((ch=fr.read())!=-1) {
			System.out.println((char)ch);
		}
	}catch (Exception e) {
		e.printStackTrace();
	}


	}
}
