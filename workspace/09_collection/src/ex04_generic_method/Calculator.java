package ex04_generic_method;

public class Calculator {

	
	//방법1
	public <T> double getTotal1(T[] a) {
		double total=0.0;
		for(int i=0;i<a.length;i++) {
			total+=((Number )a[i]).doubleValue(); 	//캐스팅됨 (=클래스간 타입변환)
		}
		return total;
	}
	
	//방법2
	public <T extends Number> double getTotal2(T[] a) {//T는 Number를 상속받는 클래스(int,double)만 가능.
		double total=0.0;
		for(int i=0;i<a.length;i++) {
			total+=a[i].doubleValue(); 	//캐스팅됨 (=클래스간 타입변환)
		}
		return total;
	}
	
}
