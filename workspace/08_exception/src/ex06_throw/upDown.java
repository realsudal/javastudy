package ex06_throw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class upDown {

	
	private int answer; //발생된 난수
	private int count;
	private  Scanner sc=new Scanner(System.in);
	
	public upDown() {
		answer=(int)(Math.random()*100)+1;
	}
	public int challenge() throws UpDown_exception,InputMismatchException {//있을수있는 오류를 다적어야됨!!!!!!!!!!!!!!!!!!!!!!
		count++;
		System.out.println("1~100사이의 정수를 입력하세요. : ");
		int n=sc.nextInt();//입력이 정수가 아니면 inputMismatchException이 일어남
		if(n<1 || n>100) {
			throw new UpDown_exception();
		}
		return n;
	}
	
	
	
	public void play() {
		while (true) {
			try {
			int n=challenge();//UpDown_exception,InputMismatchException  이 발생되는 곳 입니다. (챌린지를 호출하면 같이 던져짐!!)
			if(n<answer) {
				System.out.println("up");
			}else if(n>answer){
				System.out.println("down");
			}else {
				System.out.println("정답!"+count+"만에 정답");
				return;//play 메소드 종료
			}
			}catch (UpDown_exception e) {
				System.out.println(e.getMessage());//1~100 사이를 입력해야합니다.
			}catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	
}
