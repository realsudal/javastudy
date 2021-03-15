package ex05_loop;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		//비번은 "asdf"
		//5번안에 일치하면 "로그인되었습니다."
		//아니면 비밀번호를 확인하세요 ==> 5번 실패시 "로그인 횟수 초과" 출력
		Scanner sc=new Scanner(System.in);
		
		String pass="asdf";
		String pass2;
		for(int i=0;i<5;i++) {
			System.out.print("비번 :");
			pass2=sc.next();
			
			if(pass.equals(pass2)) {
				System.out.print("로그인 성공");
				break;
			}else if(i<4) {
				System.out.println("비밀번호를 확인하세요");
			}
			else if(i==4){
				System.out.print("로그인 실패");
			}
			
			
		}
	}

}
