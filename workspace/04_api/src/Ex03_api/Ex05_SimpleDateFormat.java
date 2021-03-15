package Ex03_api;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Ex05_SimpleDateFormat {

	public static void main(String[] args) {
		/*
		 * 요일 : e (일~토)
		 * 오전 오후: a
		 * 시간
		 * h,hh:12시간
		 * HH,HH:24시간
		 * 
		 * sdf
		 */
		
		Date date=new Date(System.currentTimeMillis());
		String pattern="yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		System.out.println(date);
		System.out.println(sdf.format(date)); 
		
		
		
		
		
		
		
	}

}
