package ex04_sochet_thread;

import java.io.BufferedInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {

		Socket client=null;
		Scanner sc=new Scanner(System.in);
		File dir=null;
		File file=null;
		DataOutputStream dos=null;
		BufferedInputStream bis=null;
		
		try {
			client=new Socket();
			client.connect(new InetSocketAddress("localhost",4966));
			
			//c:\\myclient 디렉터이 내부 파일 중 하나의 이름을 받아서 해당 파일 전송
			System.out.println("전송할 파일명 입력 : ");
			String fileName=sc.nextLine();
			dir=new File("c:\\MyClient");
			file=new File(dir,fileName);
			
			//서버로 파일명 보내기
			dos=new DataOutputStream(client.getOutputStream());
			dos.writeUTF(fileName);//한글 섞여있으니 utf로함 
			
			//파일내용을 읽어서 서버로 파일내용보내기 - FileInputStream() -> 성능을 더 높일려면 버퍼쓰기
			bis=new BufferedInputStream(new FileInputStream(file)); //file=new File(dir,fileName);
			byte[] b=new byte[1024];
			int length=0;
			while((length=bis.read(b))!=-1){
				dos.write(b, 0, length);
			}
			System.out.println(file.getAbsolutePath()+"파일을 서버로 전송했습니다.");
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(dos!=null)dos.close();
			if(bis!=null)bis.close();
			if(!client.isClosed())
				client.close();}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
