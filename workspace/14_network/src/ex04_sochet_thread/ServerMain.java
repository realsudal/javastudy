package ex04_sochet_thread;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
//여기는 재평가  ->이전까지 했던게 본평가 범위
	public static void main(String[] args) {

		//클라이언트들이 파일을 전송한다. => thread
		//파일전송 작업은 thread로 작업한다.
		
		ServerSocket server=null;
		Socket client=null;
		try {
			server=new ServerSocket();
			server.bind(new InetSocketAddress("localhost",4966));
			
			while(true) {
				//클라이언트들의 접속처리
				client=server.accept();
				//클라이언트들의 파일 전송
				FileUploadThread upload=new FileUploadThread();//스레드 객체 생성
				upload.setClient(client); //세터를 이용해 client를 넘겨줌(client를 통한 스트림 생성이 필요하므로 전달해줌)
				upload.start();//스레드 실행
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(client=)client.close();
				if(server=)server.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	}

}
