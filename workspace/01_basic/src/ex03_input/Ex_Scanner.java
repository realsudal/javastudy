package ex03_input;

import java.util.Scanner;

public class Ex_Scanner {

	public static void main(String[] args) {

		/*Scanner클래스
		 * 패키지 : java.util
		 * java.lang은 import 필요없음
		 * 
		 * nextInt() 
		 * nextLong()
		 * nextDouble()
		 * 
		 * next() : 공백없는 String 입력
		 * nextLine() : 공백있는 String 입력
		*/
		
		/*
		 * '입력'을 위해서는 "표준입력 스트림"이 필요하다.
		 * System.in
		 */
		
		Scanner scan=new Scanner(System.in);
		
		//1.이름입력받기
		System.out.print("이름 : ");
		String name=scan.nextLine();//이름의 공백이 가능함
		
		//2.나이를 입력하세요
		System.out.print("\n나이 : ");
		int age=scan.nextInt();
		
		//3.키 입력하기
		System.out.print("\n키 : ");
		double h=scan.nextDouble();
		
		//4.성별입력
		System.out.print("\n성별 : ");
		char g=scan.next().charAt(0); 
		//next가 모든 글자를처리 ->charAt이 0번째 인덱스만 추출
		
		
		//입력정보 확인하기
		System.out.println("\n이름:"+name+" 나이:"+age+" 키:"+h+" 성별:"+g);
	
		
		//스트림 닫기
		scan.close();
	}

}
