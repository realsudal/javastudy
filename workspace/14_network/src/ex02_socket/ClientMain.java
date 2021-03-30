package ex02_socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;



public class ClientMain {

	public static void main(String[] args) {

		
		//Socket : 클라이언트  - 	나중에 실행 + 계속 재실행해도됨.
		
		
		Socket client=null;
		
		
		try {
		
			//클라이언트 생성
			client=new Socket();
			//클라이언트가 서버에 접속을 시도
			client.connect(new InetSocketAddress("localhost",4966));	//외우기
			//socket.connect(new InetSocketAddress(InetAddress.getByName("localhost"),4966));   위와 둘중 하나만 쓰면됨
			
			//접속성공
			System.out.println("접속 성공");
			
			//server로부터 메시지 받기  - 이거 시험에 나옴
			InputStream is=client.getInputStream();
			byte[] b=new byte[50];
			int length=is.read(b);//읽은 내용은 b에 저장, 읽은 바이트 수(글자수)는 length에 저장
			// new string() 메서드 : byte[] ->string
			String msg=new String(b, 0, length, "UTF-8");//b배열을 0부터 b배열길이까지 한글로 읽음
			System.out.println(msg);
			
			
			
			
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
