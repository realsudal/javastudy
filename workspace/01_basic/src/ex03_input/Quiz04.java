package ex03_input;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		int price, grade;
		
		
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("매출액을 입력하세요: ");
		price=sc.nextInt();
		System.out.println("vip면 1번, 일반이면 2번 : ");
		grade=sc.nextInt();
		
		//equalsIgnoreCase() <- 대소문자를 가리지않는 비교 메소드
		//double discountRate = grade.equalsIgnoreCase("VIP") ? 0.5 : 0.02;
		if(grade==1) {
			price=(int)(price-(price*0.2));
		}else {
			price=(int)(price-(price*0.05));
		}
		
		System.out.print("가격 : "+ price);
		
		
		sc.close();
	}

}
