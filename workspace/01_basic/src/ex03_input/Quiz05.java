package ex03_input;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		int num;
		String gender;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("주민번호 8번째 번호 입력 : ");
		num=sc.nextInt();
		
		
		gender = num%2==1 ? "남자":"여자";
		
		System.out.print("\n성별 : "+ gender);
		sc.close();
	}

}
