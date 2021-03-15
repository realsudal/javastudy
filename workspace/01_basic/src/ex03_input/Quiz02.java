package ex03_input;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		//double타입 실수 2개받아 값 교환

		double n1,n2,temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("n1 을 입력하세요: ");
		n1=sc.nextDouble();
		System.out.print("\n n2를 입력하세요: ");
		n2=sc.nextDouble();
		
		temp=n1;
		n1=n2;
		n2=temp;
		
		System.out.print("\n\n스왑후 \n n1= "+ n1+",n2 = "+n2);
		sc.close();
	}

}
