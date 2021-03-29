package quiz03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleDelete_Main {

	public static void main(String[] args) {

		//c:\\mytemp 디렉터리를 삭제합니다. =>안에 모든 파일이나 데이터를 먼저 지워야 지워짐
		
		
		//디렉토리 
		File dir=new File("c:\\Mytemp");

	
	
		//파일과 폴더 삭제
		if(dir.exists()==true) {
			File[] files=dir.listFiles();
			for(File file : files) {
				if(file.isFile()) {
				System.out.println(file.getName()+" 파일 을 삭제합니다.");
				file.delete();
				}else {
					System.out.println(file.getName()+"디렉터리를 삭제합니다.");
				}
			}
			dir.delete();
			System.out.println(dir+"가 디렉토리가 삭제되었습니다.");
		}
	}

}
