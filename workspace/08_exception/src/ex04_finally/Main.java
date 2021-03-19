package ex04_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a;
		try {
				System.out.print("정수를 입력하세요. : ");
				a=sc.nextInt();
				System.out.println("입력은 " + a + " 입니다.");
		}catch(InputMismatchException e) {
			System.out.println("정수라고 ");
		}
		finally {
			System.out.println("프로그램을 종료합니다.");
			sc.close();
		}//finally문은 try catch 문의 맨~~마지막에 붙을 수 있음 .   오류가 나든 안나든 "무조건 실행"하는 영역!
		
		
		
		
		
		
		
	}

}
