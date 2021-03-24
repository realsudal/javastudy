package ex04_dql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import connection.DBconnection;

public class SelectOneMain {

	public static void main(String[] args) {

		//resultset에 하나씩 저장
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;//select문의 결과 행을 저장함
		
		try {
			con=DBconnection.getConnection();
			String sql="SELECT no,name,department,hireDate FROM staff WHERE no = 3";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();//select 문은 executeQuery()를 씀 update아님
			//rs에 저장된 데이터는 "반드시" next() 메소드로 호출되야함 
			//next() 메소드 : 결과 행에서 순서대로 한 행씩 꺼낸다.
			//1. 결과 행에서 순서대로 하나씩 꺼냅니다.
			
			//2.꺼낼 결과 행이 존재하면 true반환,없으면 false반환 
			if(rs.next()) {
				/*
				int no=rs.getInt(1); //
				String name=rs.getString(2);
				String department=rs.getString(3);
				Date hireDate =rs.getDate(4);
				*/
				//hashmap에 저장하기
				Map<String, Object> staff= new HashMap<String, Object >();
				staff.put("no",rs.getInt("no"));
				staff.put("name", rs.getString("department"));
				staff.put("hireDate",rs.getDate("hireDate"));
				//이름을 staff으로 모으기
				System.out.println("no"+no+", name ="+name+", depart"+department+", hire"+hireDate);
				
				
			}else {
				System.out.println("해당 스텝이 없습니다.");
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
