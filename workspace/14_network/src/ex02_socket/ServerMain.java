package ex02_socket;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {

		
		//ServerSocket : 서버	-	 딱 1번만 실행
		
		ServerSocket server=null;
		
		try {
			
			
			//서버 생성
			server=new ServerSocket();
			System.out.println("클라이언트가 서버에 접속을 시도합니다.");
			//접속할 클라이언트 정보
			server.bind(new  InetSocketAddress("localhost",4966 ));
			//서버는 항상 켜져있다. (=무한루프)
			while(true) {
				System.out.println("서버 실행중입니다.");
				//클라이언트의 접속 허용.
				Socket client = server.accept();//반환타입은 소켓(클라이언트)
				
				//클라이언트의 주소 객체 생성
				InetSocketAddress isa = (InetSocketAddress) client.getRemoteSocketAddress();
				System.out.println("[ "+isa.getHostName()+" ] 가 접속되었습니다.");
				
				//클라이언트에게 웰컴메시지를 보내기 	- 포인트!! 이거 시험나옴!!
				String msg="Welcome to server!";
				//클라이언트에게 보낼수있는 스트림 객체 생성
				OutputStream os=client.getOutputStream();
				os.write(msg.getBytes("UTF-8"));//getbytes() : string -> byte로 변환 메서드!!!!!
				os.flush(); //혹시 스트림에 남아있는 데이터를 강제로 밀기
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(!server.isClosed())server.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
