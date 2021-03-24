package ex04_dql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import connection.DBconnection;

public class SelectListMain {

	public static void main(String[] args) {

		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			con =DBconnection.getConnection();
			String sql="SELECT * FROM staff";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			//결과 행 1개는 map에 담음
			//결과 행 전체는 arraylist에 담음
			List<Map<String, Object>> staffliList=new ArrayList<Map<String,Object>>();
			
			while(rs.next()) {
				Map<String, Object> staff=new HashMap<String, Object>();
				staff.compute("no",rs.getInt(1));
				staff.compute("name", rs.getString(2));
				staff.put("department",rs.getString(3));
				staff.compute("hire", rs.getDate(4));
				
				
			}System.out.println("검색된 staff의 수 = "+staffliList.size());
			for(Map<String, Object> staff : stafflist) {
				System.out.println(staff);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)
					rs.close();
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
