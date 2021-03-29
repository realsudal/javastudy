package ex03_File;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;



/*
 * File 클래스
 * 1.파일을 조작하는 클래스
 * 2. 파일을 생성, 삭제, 파일명, 파일 크기, 수정 날짜 등의 확인이 가능
 */
public class FileOverviewMain {

	public static void main(String[] args) {

		//디렉토리 조작
		File  dir=new File("C:\\MyTemp"); //경로 구분 (\\ == file.separator)
		//File dir=new File("C:" + File.separator+"MyTemp");  <-리눅스와 윈도우 호환용
		
		System.out.println(dir.exists());//존재하는 경로이면 true반환, 없으면 false
		
		if(dir.exists() ==false) {//if(!dir.exists()) 와 같음 	(=존재 x)
			dir.mkdirs();//dir을 만들어 주쇼
			System.out.println("mytemp 디렉토리가 생성되었습니다.");
		}
		/*
		if(dir.exists()==true) {//if(dir.exists()) 가 더 가독성 좋음
			dir.delete();
			System.out.println("mytemp 디렉토리가 삭제되었습니다.");
		}
		*/
		
		//파일조작
		//File file=new File("c:\\MyTemp\\MyFile.txt");
		//File file=new File("c:\\MyTemp", "MyFile.txt"); //위와 같은코드
		File file=new File(dir,"MyFile.txt");   //=    dir=new File("C:\\MyTemp");위와 같은코드
		
		
		System.out.println(file.exists());
		try {
			if(file.exists() ==false) {//if(!dir.exists()) 와 같음
				file.createNewFile();	//내용이 없는 파일을 생성
				}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(file.getAbsolutePath());//결과 : C:\MyTemp\MyFile.txt  - 파일 경로알아낼때
		System.out.println(file.getPath());//C:\MyTemp\MyFile.txt		
		System.out.println(file.getParent());//C:\MyTemp		폴더이름
		System.out.println(file.getName());//MyFile.txt		파일이름
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a h:mm"); //api 과목을 참고
		System.out.println( sdf.format(new Date(file.lastModified())));//1616978477444 최종 수정일 -> 2021-03-29로 변경 (=>new java.sql.Date)  -> sdf.mormat을 이용해 :  2021-03-오전 9:41
		System.out.println(file.length()+"\n\n");//0
		
		
		
		//디렉토리 내의 모든 디렉토리 파일 목록 출력하기
		File javaDir=new File("C:\\Program Files\\Java\\jdk1.8.0_202"); // javaDir 는 서버저장소
		File[] files= javaDir.listFiles();
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		
		for( File f:files) {
			System.out.print(sdf2.format(new Date(f.lastModified())) + "\t");
			if(f.isDirectory()) {//폴더라면
				System.out.print("<DIR> ");
			}else {
				System.out.print("\t\t" +new DecimalFormat("#,##0").format(f.length() ));
			}
			System.out.println("\t"+f.getName());
		}
		
		}
	}


