package ex02_byte;

import java.io.*;


public class BuffedInputStreamMain {

	public static void main(String[] args) {

		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("byte2.txt"))){
			byte[] bytes=new byte[5];
			while(true) {
				int readByte=bis.read(bytes); //'읽은 데이터는 bytes 배열'에 저장됨. 실제'읽은 바이트 수가 readByte'에 저장됨
				if(readByte==-1)break;
			}
			System.out.println(new String(bytes));//string 으로 변환
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
