package ex03_File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {

		//원본 windmill.mp4
		//FileInputStream을 통해 읽음
		//속도를 높이기 위해서 bufferdInputStream을 사용
		BufferedInputStream bis=null;
		
		FileInputStream fis=null;
		
		//복사본을 c>mytemp>windmaill.mp4
		//경로지정을 위해 file 클래스 씀
		//FileOutputStream을 통해 만듦
		//속도를 높이기 위해서 bufferdOutputStream을 사용
		
		BufferedOutputStream bos=null;
		File cpy=new File("c:\\MyTemp","Ocean.mp4");
		FileOutputStream fos=null;
		
		try {
			bis=new BufferedInputStream(new FileInputStream("Ocean.mp4"));//현재 디렉토리의 Ocean
			bos=new BufferedOutputStream( new FileOutputStream(cpy));	//c:\\mytemp 디렉터리의 Ocean를 복사
			
			//복사 시작시간
			long start=System.currentTimeMillis();
			byte[] b=new byte[10];
			int length=0;	//읽어들인 바이트 b의 길이
			while((length=bis.read(b))!=-1) {
				bos.write(b, 0, length);//b가 다 채워지지 않을 수도 있어서 맨끝을 length로 지정함.
			}
			//복사 종료시간
			long end=System.currentTimeMillis();
			System.out.println(cpy.getAbsolutePath() + " 파일이 복사 되었습니다.");
			System.out.println("복사 소요시간 : "+((end-start)*0.001)+" 초");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
