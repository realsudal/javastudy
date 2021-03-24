package ex03_dml;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import connection.DBconnection;

public class InsertMain2 {

	public static void main(String[] args) {

		Connection con=null;
		PreparedStatement ps=null;
		
		try {
		con=DBconnection.getConnection();
		//쿼리문에 변수처리되는 부분은 '?'으로 처리함
		String sql="INSERT INTO staff(no,name,department,hireDate) VALUES (?,?,?,?)";
		ps=con.prepareStatement(sql);
		//변수가 4개이기때문에 ->변수 처리하기
		ps.setInt(1,4); //1번째 ?에 2전달
		ps.setString(2, "mimi2");
		ps.setString(3, "인사");	//3번째 ?에 인사 전달
		ps.setDate(4,new Date(System.currentTimeMillis()));	//4번째 물음표에 현재 날짜 데이터 전달
		int result=ps.executeUpdate();
		
		if(result==0) {//실패
			System.out.println("행이 추가되지않았습니다.");
		}else {//성공
			System.out.println("행이 추가되었습니다.");
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
