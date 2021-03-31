package ex03_socket;

import java.io.BufferedInputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerMain {

	public static void main(String[] args) {

		ServerSocket server=null;
		Socket client=null;
		BufferedInputStream bis=null;
		
		
		try {
			//서버 생성
			server =new ServerSocket();
			server.bind(new InetSocketAddress("localhost", 4966));
			
			while(true) {
				//클라이언트 접속
				System.out.println("==서버 동작중==");
				
				client=server.accept();
				InetSocketAddress isa=(InetSocketAddress)client.getRemoteSocketAddress();
				System.out.println("접속 클라이언트"+ isa.getHostName());
				
				
				//클라이언트가 보낸 메시지
				bis=new BufferedInputStream(client.getInputStream());
				byte[] b=new byte[1024];
				int length=bis.read(b);//메시지는 b , 글자수 length
				String msg=new String(b, 0, length, "UTF-8");//byte -> String 으로 변경
				System.out.println(msg);
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(!server.isClosed())
				server.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
