package ex01_network;

import java.net.URL;
import java.net.URLConnection;

public class URLConnection_Main {

	public static void main(String[] args) {

		URL url=null;
		URLConnection con=null;
		
		
		try {
			url=new URL("https://www.naver.com");
			con=url.openConnection();
			System.out.println(con.getContentType());//con.getContentType() : 인터넷 문서 타입 확인 법  ->외우면 머 편리합니다..ㅋㅋ
			System.out.println(con.getContent());
			System.out.println(con.getURL());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
