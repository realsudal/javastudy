package ex05_loop;

import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {
		//do while 문
		
		//반드시 한번은 실행
		Scanner sc=new Scanner(System.in);
		int n,total=0;
		do{
			n=sc.nextInt();
			total+=n;
			System.out.println("s");
		}while(n>=0); //<--이(while) 안의 값이 참이라면 do문 반복

	}
}
