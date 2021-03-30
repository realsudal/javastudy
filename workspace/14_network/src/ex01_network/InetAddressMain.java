package ex01_network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressMain {

	public static void main(String[] args) {
		String host="www.naver.com";
		
		//인터넷 주소를 처리하는 InetAddress
		InetAddress ia=null;
		//원격 호스트
		try {
		
			ia=InetAddress.getByName(host);
			System.out.println(ia);	//  www.naver.com/125.209.222.142
			System.out.println(ia.getHostName()); //www.naver.com     = >    host name (=도메인)
			System.out.println(ia.getHostAddress());//125.209.222.142 	=> 	host address (= ip)
			
			InetAddress[] ias=InetAddress.getAllByName(host);
			for(InetAddress i :ias) {
				System.out.println(i.getHostName()+"의 ip주소는 "+i.getHostAddress());
				/*결과 
				 *	 www.naver.com의 ip주소는 125.209.222.141
					 www.naver.com의 ip주소는 223.130.195.95
				 */
			}
			
			
			byte[] byteIp= ia.getAddress();
			System.out.println(Arrays.toString(byteIp));
			
			short[] ip=new short[byteIp.length];
			for(int i=0;i<ip.length;i++) {			//여기 코드 삼항연산자로도 풀수있음 
				if(byteIp[i]<0) {
					ip[i]=(short) (256+byteIp[i]);
				}else {
					ip[i]=byteIp[i];
				}
			}
			
			
			System.out.println(Arrays.toString(ip)); //결과 : [125, -47, -34, -115] -> 음수로 떨어진 애들은 256을 더해주면 원래 ip로 바뀜
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
