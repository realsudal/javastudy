package ex04_control;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		char grade,point=' ';
		int score;
		
		System.out.print("점수(0~100) :");
		score=sc.nextInt();
		
		
		
		
		switch (score/10) {
		case 10:
			grade='S';
			break;
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		default:
			grade='F';
			break;
		}
		
		
		//987/654/3210
		if(score>69&&score<=99) {
			switch (score%10) {
				case 9:
				case 8:
				case 7:
					point ='+';
					break;
				case 6:
				case 5:
				case 4:
					point ='0';
					break;
				default:
					point ='-';
					break;
			}
		}else{
			point=' ';
		}
		
		System.out.println(" "+grade+point);
		sc.close();
	}

}
