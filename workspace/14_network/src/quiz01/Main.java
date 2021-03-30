package quiz01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class Main {

	public static void main(String[] args) {

		//http://m.naver.com/을 c드라이브:\mnaver.html 로 저장
		
		
		URL url=null;
		HttpURLConnection con=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try {
			
			//읽어옴
			url=new URL("http://m.naver.com/");
			con=(HttpURLConnection)url.openConnection(); //결과만 캐스팅하는 con
			isr=new InputStreamReader(con.getInputStream());
			br=new BufferedReader(isr);
			
			File file =new File("c:\\mnaver.html");
			bw=new BufferedWriter(new FileWriter(file));
			
			String line=null;
			while((line= br.readLine())!=null) {
				
				line= br.readLine();//.readLine() : 한 줄씩 읽어옴 , 끝나면 null이됨
				if(line==null) {
					break;
				}
				sb.append(line).append("\n"); //System.out.println(line);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(br!=null)br.close();
			if(con!=null)con.disconnect();
		}
			
		
		
	}

}
