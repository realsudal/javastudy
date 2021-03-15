package ex05_loop;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		//영화 평점 입력받아 * 출력
		//1~5정수
		//잘못된 평점은 다시 입력하도록하기
		
		Scanner sc=new Scanner(System.in);
		
		int ans=0;
		
		while(true) {
			
			System.out.print("정수 1~5까지 평점 입력(정수):");
			ans=sc.nextInt();
			
			if(0<ans&&ans<6) {
				System.out.print("평점 :");
				for(int i=0;i<ans;i++) {
					System.out.print("*");
				}
				break;
			}else {
				System.out.println("다시입력");
			}
			
		}
		
		
	}

}
