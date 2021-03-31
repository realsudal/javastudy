package quiz03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {

		Socket client=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		Scanner sc=new Scanner(System.in);
		
		try {
			client=new Socket();
			//클라이언트가 서버소켓에 연결
			client.connect(new InetSocketAddress("localhost",4966));
			System.out.println("====[ 클라이언트 페이지]==== \n 서버에 접속되었습니다.");
			
			while(true) {
				
			//받아
			System.out.print("[client] 나 :");
			String sendMsg=sc.nextLine();
			//보냄
			bos=new BufferedOutputStream(client.getOutputStream());
			bos.write(sendMsg.getBytes("UTF-8"));
			
			bos.flush();
			
			if(sendMsg.equalsIgnoreCase("exit")) {
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
			if(!client.isClosed())
				client.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
