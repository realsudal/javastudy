package ex05_loop;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		//만원 모두 사용하기 
		//결제금액 입력받기
		//결제 5000,현재 ㅡㅡㅡ원 있ㅅ습니다
		//결제금액 -100원  >결제할수없습니다.현재 ---원있습니다
		//사용할 금액 >>5만원 ->---얼마 부족합니다.
		//결제금액 5000원 >> 현재 0원있습니다 > 종료
		
		Scanner sc=new Scanner(System.in);
		
		int myMoney=10000;
		int usem;
		
		System.out.println("만원 있습니다.");
		
		while(myMoney>=0) {
			System.out.print("결제금액 :");
			usem=sc.nextInt();
			
			if(myMoney>usem) {
				myMoney-=usem;
				System.out.print("결제"+usem+"원, 현재 "+myMoney+"원 남음\n");
			}else if(myMoney==usem) {
				System.out.println("현재 0원 있음.");
				break;
			}else if(myMoney<usem) {
				usem-=myMoney;
				System.out.println("현재 "+usem+"원 부족함");
				
			}
			
			sc.close();
		}
	}

}
