package ex04_this;

public class Car {

	String model,manufacturer;
	int price;
	
	Car(String model,String manuString,int price) {
		
	}
	Car(String model,int price) {
		//기본 생성자 호출
		this("model","0",price);
	}
	
}
