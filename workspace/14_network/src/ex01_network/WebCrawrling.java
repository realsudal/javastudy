package ex01_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebCrawrling {

	public static void main(String[] args) {
		
		
		URL url=null;
		HttpURLConnection con=null;
		BufferedReader br=null;
		
		
		try {
			url=new URL("https://www.daum.net/");
			con=(HttpURLConnection)url.openConnection();
			br=new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String line=null;
			while((line=br.readLine())!=null) {
				//<a href="https://search.daum.net/search?w=tot&amp;q=%EC%82%AC%ED%9A%8C%EC%A0%81+%EA%B1%B0%EB%A6%AC%EB%91%90%EA%B8%B0&amp;DA=NPI" class="link_favorsch @6">사회적 거리두기</a>
				//위와같은 link_favorsch 만 포함된 line이 필요함
				if(line.contains("link_favorsch @")) {//line에 link_favorsch 포함되면 실행
					//System.out.println(line);
					String[] temps=line.split(">");//>기준으로 쪼갬
					//System.out.println(temps[1]);
					//line.split(">")[1] : 코로나19 발생현황</a
					//line.split(">")[1].split("<"); :{ "코로나19 발생현황" ,  "</a"}
					System.out.println(line.split(">")[1].split("<")[0]); // : "코로나19 발생현황"
					
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(br!=null) { br.close();}
			if(con!=null)con.disconnect();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
