package ex02_byte;

import java.io.FileOutputStream;
import java.io.IOException;

/*
FileOutputStream클래스
1. "바이트 기반 + 출력 스트림"입니다. (Stream)
2. 문자를 보낼 때 사용합니다.
   1) 통신 : 상대방에게 데이터를 보낼 때
   2) 파일 : 텍스트 파일을 만들 때
3. 출력 메소드
   write()
4. 출력 단위
   byte[], int
5. 예외 처리가 필요합니다.
*/
public class FileOutputStreamMain {

	public static void main(String[] args) {

		
		FileOutputStream fos=null;
		
		try {
			fos=new FileOutputStream("byte1.txt");
			
			String str1="Hello java";
			String str2="안녕하쇼 방가z";
			int ch='!';
			
			fos.write(str1.getBytes());//string을 byte로 변환해서 넣어줌
			fos.write(ch);
			fos.write('\n');
			fos.write(str2.getBytes());
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null) fos.close();
			}catch (Exception e) {

			}
		}
		
		
	}

}
