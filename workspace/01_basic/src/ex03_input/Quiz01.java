package ex03_input;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		//int타입 점수 3개 입력받아 평균
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("점수1 을 입력하세요: ");
		n1=sc.nextInt();
		System.out.println("점수2 를 입력하세요: ");
		n2=sc.nextInt();
		System.out.println("점수3 을 입력하세요: ");
		n3=sc.nextInt();
		
		double avg=(n1+n2+n3)/3.0;
		
		System.out.print("평균 : "+ avg);
		
		sc.close();
	}

}
