package ex05_loop;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		//맞힐때까지 물어보는 퀴즈
		//수도 seoul 서울
		//정답
		//틀리면 오답입니다 다시물어보가
		
		String ans;
		Scanner sc=new Scanner(System.in);
		
	while(true) {
		System.out.println("한국의 수도는 ?");
		ans=sc.next();
			if(ans.equals("서울")||ans.equalsIgnoreCase("seoul")) {
				System.out.println("정답");
				break;
			}else {
				System.out.println("틀렸습니다.");
				
			}
		}
	
	
	
	/*
	 * Stirng city=""; <-초기화
	 * 
	 * do{
	 * 	if(city!=null){
	 * 		System.out.println("틀렸습니다.");
	 *  }
	 * 	System.out.println("한국의 수도는 ?");
		city=sc.next();
	 * }while(!city.equals("서울")&&!city.equals("seoul"))
	 * 	System.out.println("정답");
	 * 
	 */
	
	
	}

}
