package ex11_abstract;

public class Main {

	public static void main(String[] args) {

		Staff staff=new SalaryMan("mimi", 300);
		staff.info();
		
		/*staff의 getPay()는 어떻게 호출 할 수 있 을 까 ? ㅎ ㅋ ㅎㅋ ㅋㅎㅋ
		*staff.getPay(); 를 하고싶다!
		*	1. staff클래스에 getpay를 추가한다.
		*			-모든 staff는 getpay()를 가져야 함으로 이방법을 선호함.
		*	2. SalaryMan 클래스로 캐스팅한다.
		*
		*/
		System.out.println(staff.getPay());
	}

}
