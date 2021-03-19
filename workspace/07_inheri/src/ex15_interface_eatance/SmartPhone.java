package ex15_interface_eatance;

public class SmartPhone extends Phone implements Computerable {

	//Computerable의 playApp을 반드시 오버라이드
	@Override
	public void playApp() {
		System.out.println("앱을 실행한다");
	}
	
	
	
	
}
