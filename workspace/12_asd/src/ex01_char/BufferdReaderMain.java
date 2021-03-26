package ex01_char;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * 
 */
public class BufferdReaderMain {

	public static void main(String[] args) {

		try(BufferedReader br=new BufferedReader(new FileReader("text3.txt"))){
			
			/*긴버전
			StringBuilder sb=new StringBuilder();
			while(true) {
				char[] cbuf=new char[5];
				int readCharCount=br.read(cbuf);
				if(readCharCount==-1) {
					break;
				}
				sb.append(cbuf,0,readCharCount);//읽은 글자 수 만큼만 sb에 저장
			}
			System.out.println(sb.toString());
			*/
			
			//짧은 버전
			StringBuilder sb=new StringBuilder();
			char[] cbuf=new char[5];
			int readCharCount=0;
			while((readCharCount=br.read(cbuf)) != -1){
				sb.append(cbuf,0,readCharCount);
			}
			System.out.println(sb.toString());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
