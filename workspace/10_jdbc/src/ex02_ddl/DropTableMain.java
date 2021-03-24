package ex02_ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBconnection;

public class DropTableMain {

	public static void main(String[] args) {
		
		Connection con=null;//try안에서만 선언하면 외부에서 fially에서 못쓰니까 밖으로 꺼냄
		PreparedStatement ps=null;//위와 같음
		
		try {
			con=DBconnection.getConnection();
			String sql="DROP TABLE staff";
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		
			System.out.println("staff 테이블이 삭제되었습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
				try {
					if(ps!=null) 
							ps.close();
					if(con!=null) 
							con.close();
						
				}catch (Exception e) {
						e.printStackTrace();
				}
		}
		
		
		
	}

}
