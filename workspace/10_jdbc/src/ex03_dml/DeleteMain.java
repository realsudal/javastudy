package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBconnection;

public class DeleteMain {

	public static void main(String[] args) {

		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=DBconnection.getConnection();
			String sql="DELETE FROM staff WHERE department= '영업' ";
			ps=con.prepareStatement(sql);
			int result=ps.executeUpdate();
			if(result==0) {
				System.out.println("삭제된 정보가 없음");
			}else {
				System.out.println(result+"명의 정보가 삭제되었습니다.");
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
