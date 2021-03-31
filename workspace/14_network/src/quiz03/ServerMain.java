package quiz03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		Socket client=null;
		ServerSocket server=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		Scanner sc=new Scanner(System.in);
		try {
			//서버 생성
			server =new ServerSocket();
			server.bind(new InetSocketAddress("localhost", 4966));
			System.out.println("==[서버 페이지]==");
			
			client=server.accept();
			InetSocketAddress isa=(InetSocketAddress)client.getRemoteSocketAddress();
			System.out.println("접속 클라이언트"+ isa.getHostName());
			
			
			while(true) {			
				bis=new BufferedInputStream(client.getInputStream());
				byte[] b=new byte[1024];
				int length=bis.read(b);
				String getMsg=new String(b, 0, length, "UTF-8");
				
				System.out.println("클라이언트의 답 : " +getMsg);
				
				if(getMsg.equalsIgnoreCase("exit")) {
					System.out.println("===종료===");
					break;
				}
				
				
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis!=null)
					bis.close();
				if(bos!=null)
					bos.close();
			if(!server.isClosed())
				server.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
