package ex03_socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {

		Socket client=null;
		Scanner sc=new Scanner(System.in);
		BufferedOutputStream bos=null;
		BufferedInputStream bis=null;
		
		try {
			//서버에 접속하기
			client=new Socket();
			client.connect(new InetSocketAddress("localhost", 4966));
			System.out.println("서버에 접속 되었습니다.");
			System.out.println("=======[클라이언트 페이지]=====");
			//서버에 메시지 보내기
			System.out.print("[클라이언트] 나 : ");
			String msg=sc.nextLine();//엔터 기준으로 문자 입력받음
			bos=new BufferedOutputStream(client.getOutputStream() ); //'바이트 기반 스트림'으로 출력해 보냄 (string 아님)
			
			bos.write(msg.getBytes("UTF-8"));
			
			bos.flush();//남아있는 것 내보냄
			
			
			
			//서버에서 보낸것 받기
			bis=new BufferedInputStream(client.getInputStream());
			byte[] b=new byte[1024];
			int length=bis.read(b);
			String str=new String(b, 0, length, "UTF-8");
			
			System.out.println("서버 :" +str);
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis!=null)
					bis.close();
				if(bos!=null)
					bos.close();
				if(!client.isClosed())client.close();
					
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
