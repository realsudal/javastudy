package ex03_input;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		double w,h,hm,result;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("몸무게를 입력하세요: ");
		w=sc.nextDouble();
		System.out.println("키(cm)를 입력하세요: ");
		h=sc.nextDouble();
		
		hm=h*0.01;
		result=w/(hm*hm);
		
		//19이하 저체중/ 20-24정상/ 25이상 과체중
		
		if(result<=19) {
			System.out.print("저체중");
		}else if (result<=24) {
			System.out.print("정상");
		}else {
			System.out.print("과체중");
		}
		//String a=result<=19 ? "저체중": result<=24 ? "정상":"과체중";
		sc.close();
	}

}
