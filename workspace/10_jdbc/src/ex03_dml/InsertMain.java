package ex03_dml;

import java.sql.*;

import connection.DBconnection;

public class InsertMain {

	public static void main(String[] args) {

		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=DBconnection.getConnection();
			String sql="INSERT INTO staff(no,name,department,hireDate) VALUES (1,'mimi','총무','2021-03-01')"; //no가 pk임
			ps=con.prepareStatement(sql);
			int result=ps.executeUpdate(); //result :  executeUpdate()메소드의 반환값은 '변화'가 생긴 "행(row)의 갯수" 반환됨.(=>실패시 0 반환,성공시 insert된 행의 개수반환)
			if(result==0) {
				System.out.println("행이 추가되지 않음 ㅜ.");
			}else {
				System.out.println("정상적으로 행추가댐");
			}
			
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
