package ex03_input;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		//나이를 입력받아 성인 미성년자 구분하기 20살기준
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		age=sc.nextInt();
		
		String result = age>=20 ? "성인":"미성년자"; 
		
		System.out.print("당신은 "+ result+"입니다.");
		sc.close();
	}

}
