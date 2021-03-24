package ex03_dml;

import java.sql.*;



import connection.DBconnection;

public class InsertQuiz {

	public static void main(String[] args) {

		//임의의 3명의 직원 스탭을 삽입하기
		//반복문과 배열을 사용하기
		Connection con=null;
		PreparedStatement ps=null;
		
		int[] noList= {3,4,5};
		String[] naemList= {"ty","oo","ng"};
		String[] department= {"총무","영업","고객"};
		try {
			con=DBconnection.getConnection();
			
			String sql="INSERT INTO staff(no,name,department) VALUES (?,?,?)";
			ps=con.prepareStatement(sql);
			int result=0;
			//변수가 4개이기때문에 ->변수 처리하기
			for(int i=0;i<noList.length;i++) {
			ps.setInt(1,noList[i]); //1번째 ?에 2전달
			ps.setString(2,naemList[i]);
			ps.setString(3, department[i]);	//3번째 ?에 인사 전달
			result+=ps.executeUpdate();  //=대입이 아니라 +=
			}
			
		
		
				System.out.println(result+"행이 추가되었습니다.");
			
			
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
