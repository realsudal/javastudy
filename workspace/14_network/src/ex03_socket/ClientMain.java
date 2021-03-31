package ex03_socket;

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
		
		try {
			//서버에 접속하기
			client=new Socket();
			client.connect(new InetSocketAddress("localhost", 4966));
			System.out.println("서버에 접속 되었습니다.");
			
			//서버에 메시지 보내기
			System.out.print("서버에 인사말을 건네보라. : ");
			String msg=sc.nextLine();//엔터 기준으로 문자 입력받음
			bos=new BufferedOutputStream(client.getOutputStream() ); //'바이트 기반 스트림'으로 출력해 보냄 (string 아님)
			
			bos.write(msg.getBytes("UTF-8"));
			
			bos.flush();//남아있는 것 내보냄
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(!client.isClosed())client.close();
					
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
