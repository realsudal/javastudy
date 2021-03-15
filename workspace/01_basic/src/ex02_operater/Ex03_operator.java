package ex02_operater;

public class Ex03_operator {

	public static void main(String[] args) {

		//조건연산자(삼항연산자)
		//조건식 ? true일 때:false일 때;
		
		int score = 50;
		String pass = score>=60 ? "합격":"불합격";
		System.out.println(pass);
		
		//문제1. 평균이 85점 이상 이거나, 국어와 영어 점수가 모두 80점 이상이면 합격 아니면 불합격
		
		int kor=80;
		int eng=90;
		int avg=(kor+eng)/2;
		
		String result = avg>=85||(kor>=80&&eng>=80) ? "합격":"불합격";
		
		System.out.println(result);
		
		
		//문제2. 2자리(10-99)정수 중에서 하나를 임의로 선택하고
		//그 값이 '카프리카 수'이면 맞다. 아니면 아니다.
		//45,55,99
		int n=45; //45*45 ->2025 -> 20+25 -> 45 =>결과가 자신
		
		int m=n*n;
		int first=(int)(m*0.01);// m/100
		double last=(m*0.01-first)*100;	//m%100
		
		int ans=first+(int)last;
		result = ans==n ? "카프리카 맞음":"카프리카 아님";
		
		System.out.println(result);
				
		
		
		
	}

}
