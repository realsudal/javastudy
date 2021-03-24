package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBconnection;

public class UpdateMain {

	public static void main(String[] args) {

		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=DBconnection.getConnection();
			String sql="UPDATE staff SET department=? WHERE no=? ";//처음 =은 대입, 두번째 =은 ==같다. (sql은 =가지고 둘다씀)
			ps=con.prepareStatement(sql);
			ps.setString(1, "영업");
			ps.setInt(2, 3);
			
			int result=ps.executeUpdate();
			if(result==0) {
				System.out.println("정보 수정안됨");
			}else {
				System.out.println("정보가 수정됨");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null)//con말고 ps먼저 닫기!
					ps.close();
				if(con!=null)
					con.close();
			}catch (Exception e) { 
				e.printStackTrace();
			}
		}
		
	}

}
