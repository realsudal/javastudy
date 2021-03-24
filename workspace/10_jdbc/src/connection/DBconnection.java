package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

	
	//1.결과타입 : Connection
	//2. 메소드명 : getConnection
	//3. 매개변수 : 없음
	//4. 예외처리 : ClassNotFoundException, SQLException
	
	
	/*throws를 이용해
	 *  getConnection()메소드에서는 예외처리를 하지않고, 
	 * 이 메소드를 호출하는 쪽으로 예외처리 던짐
	 */

	//public Connection getConnection() throws ClassNotFoundException,SQLException 아래 코드와 같음
	public static Connection getConnection() throws Exception{
			Class.forName("oracle.jdbc.driver.OracleDriver");//OracleDriver클래스를 메모리에올림. OracleDriver클래스 사용할게욥~~말함.
			String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user="spring";
			String password="1111";
			Connection con=DriverManager.getConnection(url, user, password);
			return con;
		}
	 
}
