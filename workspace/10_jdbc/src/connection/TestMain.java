package connection;

import java.sql.Connection;

public class TestMain {

	public static void main(String[] args) {

		//DBConnection 클래스의 getConnection() 메소드를 호출 
		//getConnection() throws Exeption 이므로 try-catch로 처리
		try {
			/*
			
			 --인스턴스로 메소드호출 : new--추천x
			DBconnection connection=new DBconnection();	//객체를 여러개 만들어도 같은 값이 반환되기때문에 new를 안씀.
			Connection con=connection.getConnection();
			
			*/
			/*
			 
			  	--클래스로 매소드로 호출 : DBconnection.getConnection();--
			  클래스 메소드 처리는 Connection클래스에게 static을 붙임으로써 처리합니다.
			  
			 */
			Connection con=DBconnection.getConnection();	//클래스 메소드로 호출
			System.out.println("DB에 접속");
			con.close();
			System.out.println("DB접속 해재");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
