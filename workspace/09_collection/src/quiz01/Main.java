package quiz01;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
/*
 * 문제
 * 		임의의 Member를 3명 저장하고,
 * 		사용자로부터 회원 번호를 입력받아서 해당 회원의 삭제를 진행
 * 		
 */
	public static void main(String[] args) {

		java.sql.Date date=new java.sql.Date(System.currentTimeMillis());
		Scanner sc=new Scanner(System.in);
		
		Member m1=new Member(1000, "user1",new Date(System.currentTimeMillis()));
		Member m2=new Member(1000, "user1",new Date(System.currentTimeMillis()));
		Member m3=new Member(1000, "user1",new Date(System.currentTimeMillis()));
		
		
		list.add(m1);
		m1.add(m1);
		m1.add(m1);
		
		
		List<Member> members=new ArrayList<Member>();
		System.out.print("회원님의 번호를 입력하세요 : ");
		int mNo=sc.nextInt();
		
		int removeIdx=-1;//삭제할 회원의 인덱스
		int length=members.size();
		for(int i=0;i<length;i++) {
			if(members.get(i).getmNo==mNo) {
				removeIdx=1;
			}
		}
		
		if(removeIdx==-1) {//못찾았으면
			System.out.println(mNo+"회원 번호를 가진 회원 이없습니다.");
		}else {
			members.remove(removeIdx);
			System.out.println(mNo+"회원번호를 가진 회원의 정보를 삭제 했습니다.");
		}
		
		/*
		 Member 클래스는 toString 메서드가 오버라이딩 되어있으므로
		 system.out.println(m1);처럼 출력이 가능하다.
		 */
		
		System.out.println("한번에 확인 : "+members);
		System.out.println("순회");
		
		for(Member member:members) {
			System.out.println(member);
		}
		
		sc.close();
		
		
	}

}
