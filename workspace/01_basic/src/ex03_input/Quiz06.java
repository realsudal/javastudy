package ex03_input;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		String res;
		char num;
		String gender;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("주민번호 전체 입력(하이폰없이) : ");
		res=sc.next();
		num=res.charAt(6); 
		
		
		/*문자는 코드값은 가지고있습니다.
		문자를 연산하는 경우 "코드값"(아스키코드)이 연산된다.
		
		0:48
		A:65
		a:97
		
		*/
		gender = num%2==1 ? "남자":"여자";
		
		System.out.print("\n성별 : "+ gender);
		sc.close();
	}

}
