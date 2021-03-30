package ex01_network;

import java.net.URL;

public class URL_Main {

	public static void main(String[] args) {

		//url : Luniform resource location : 형식이 정해져있는 자원의 표기법 (정형화됨)
		//프로토콜://호스트:포트?파라미터
		
		URL url=null;
		URL url2=null;
		try {
			
			url=new URL("https://www.naver.com?query=java"); 	//-https : 프로토콜 	- ?: 앞으로 전달하는 변수 값 -물음표 뒷쪽 :쿼리문
			System.out.println("url.getHost()\t\t"+url.getHost());
			System.out.println("url.getDefaultPort()\t"+url.getDefaultPort());
			System.out.println("url.getProtocol()\t"+url.getProtocol());
			System.out.println("url.getQuery()\t\t"+url.getQuery()+"\n");
			
			url2=new URL("https://www.naver.com/webtoon/webtoon.jsp");
			System.out.println("url.getFile()\t\t"+url.getFile()); ///webtoon/webtoon.jsp 부분
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
