package ex03_File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_FileReader_Main {

	public static void main(String[] args) {

		File file=new File("c:\\MyTemp\\text.txt");
		try(FileReader fr=new FileReader(file)){
			int ch=0;
			
			while((ch=fr.read())!=-1) {//fr.read() : 파일을 한글자씩 읽어들이기, -1이되면 글을 다읽었다는 뜻.
				System.out.print((char)ch);//int를 char로~
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

}
