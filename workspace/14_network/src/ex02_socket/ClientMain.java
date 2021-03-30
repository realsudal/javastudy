package ex02_socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) {

		
		//Socket : 클라이언트  - 	먼저 실행
		
		
		Socket client=null;
		
		
		try {
		
			//클라이언트 생성
			client=new Socket();
			//클라이언트가 서버에 접속을 시도
			client.connect(new InetSocketAddress("localhost",4966));	//외우기
			//socket.connect(new InetSocketAddress(InetAddress.getByName("localhost"),4966));   위와 둘중 하나만 쓰면됨
			
			//접속성공
			System.out.println("접속 성공");
			
			
			
			
		}catch (IOException e) {
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
