package ex01_variable;

public class Ex06_parsing {

	public static void main(String[] args) {
		/*
		 * String 관련 데이터 타입변환은 
		 * 		String a="10"
		 * 		(int)a 로는 불가능함
		 * 
		 * 
		*/
		
		
		//int -> String 변환방법
		int a=10;
		String a2=String.valueOf(a);	//a를 string타입으로 변환
		String a3=""+a;	//문자열+연산은 연결임.
		
		System.out.println(a2+","+a3);
		
		
		
		//String -> int 변환방법  <- 제일많이 사용됨
		String b="123";
		int bb=Integer.parseInt(b);
		System.out.println(bb);
		

		 //String -> Double 변환 방법
		String c="1.5";
		double c2=Double.parseDouble(c);
		System.out.println(c2);

	}

}
