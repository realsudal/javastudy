package quiz02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyProgram {

	public static void main(String[] args) {
		BufferedInputStream bis=null;
		FileInputStream fis=null;
		FileInputStream fis=null;

	 	int bf=BufferedInputStream(FileOutputStream fos=null);
		
		try {
			bio=new FileInputStream("Ocean - 62249.mp4");//원본
			bos=new FileOutputStream("Ocean - 622492.mp4");//복사본
			byte[] b=new byte[1024]; //1kb
			while(true) {
				int readByte=fis.read(b); //영상 저장은 b, 실제 읽은 바이트 수는 readbyte[]에 저장
				if(readByte==-1) {
					break;
				}
				fos.write(b, 0, readByte);
			}
			System.out.println("파일이 복사됨");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(fos!=null)fos.close();
			if(fis!=null)fis.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
