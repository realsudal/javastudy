package ex04_generic_method;
//메소드의 generic
//단! 01~03파트의 기본 generic이 더중요함.	지금 04파트는 그냥..저냥..
public class Main {

	public static void main(String[] args) {

		Integer[] a= {1,2,3};
		Double[] b= {1.5, 2.5, 3.5};
		String[] s= { "hi" , "mimi" , "me"};
		
		Calculator calc=new Calculator();
		System.out.println(calc.getTotal1(a)); //string->number
		//System.out.println(calc.getTotal1(s));	//메소드 내부에서 s타입 string 이 number로 캐스팅 되다가 예외 발생(막상 실행시키면 오류남ㅡㅡ)
		
		System.out.println(calc.getTotal2(b)); 
		//System.out.println(calc.getTotal2(s));	-->오류가 나는 이유 :  <T extends Number> 때문에, String은 전달 자체가 안된다.(화면에서 오류를 띄워 자체 오류라고해줌 ㅎㅎ)
	}

}
