package ex15_interface_eatance;

public class Main {

	public static void main(String[] args) {
		
		//1. Phone 타입의 smartphone
		Phone phone1=new SmartPhone();
		phone1.sendCall();
		((Computerable)phone1).playApp();
		
		
		//2. Computerable타입의 smartphone
		Computerable phone2=new SmartPhone();
		((Phone)phone2).sendCall();
		phone2.playApp();
		
		//smartphone타입의 smartphone
		SmartPhone phone3=new SmartPhone();
		phone3.sendCall();
		phone3.playApp();
		
	}

}
