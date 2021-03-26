package ex01_char;

import java.io.*;


//bufferedwriter 클래스
/*
 * 1. 보조 스트림
 * 2.' filewriter '클래스와 같은 메인 스트림과 '함께 사용'
 * 3. 내부 버퍼를 이용해서 동작 속도를 높여줌
 */

public class BufferedWriterMain {

	public static void main(String[] args) {

		FileWriter fw=null;
		BufferedWriter bw=null;
		
		try {
			fw=new FileWriter("text3.txt");
			bw=new BufferedWriter(fw);
			bw.write("안녕하세요/n");
			bw.write("방가");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//주의!! 보조 스트림 bw를 사용하는 경우에는 bw만 닫으면됨
			try {
				if(bw!=null) bw.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
