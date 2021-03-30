package ex01_network;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenStream_Main {

	public static void main(String[] args) {

		
		URL url=null;
		HttpURLConnection con=null;
		InputStreamReader isr=null; //reader로 끝나면 문자기반
		
		File file=null;
		BufferedReader br=null;
		StringBuffer sb=new StringBuffer();
		
		try {
			url=new URL("http://m.naver.com/");
			con=(HttpURLConnection)url.openConnection(); //결과만 캐스팅하는 con
			isr=new InputStreamReader(con.getInputStream());
			br=new BufferedReader(isr);
			
			
			while(true) {
				
				String line= br.readLine();//.readLine() : 한 줄씩 읽어옴 , 끝나면 null이됨
				if(line==null) {
					break;
				}
				sb.append(line).append("\n"); //System.out.println(line);
			}
			System.out.println("글자 수 : "+ sb.toString().length());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
				if(con!=null)con.disconnect(); 		//HttpURLConnection con 닫을때는 disconnect()
				
					
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
