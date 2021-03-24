package ex01_connection;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.Spring;

public class Main {

	public static void main(String[] args) {

		try {
		//1, oracle.jdbc.driver.OracleDriver 클래스를 메모리에 (올림)로드함
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.접속 정보
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";//Oracle 11g Express Edition 용 url임..    , 127.0.0.1은 우리 DB서버 주소(=localhost)
		
		String user="spring";	//대소문자 구분 없음
		String password="1111";
		
		//2.접속
		//DriverManager 클래스가 접속을 담당하고
		//접속 결과는 Connection 인터페이스에 저장합니다.
		Connection con=DriverManager.getConnection(url, user, password); //SQL Exeption 발생가능 줄
		
		//4. 접속이 성공했을때
		System.out.println("DB에 접속 되었습니다.");
		
		//5.접속을 종료시킴
		con.close();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
