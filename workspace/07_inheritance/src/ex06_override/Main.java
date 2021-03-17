package ex06_override;

public class Main {

	public static void main(String[] args) {

		Coffee coffee=new Coffee("콜롬비아");
		coffee.taste();
		
		
		Espresso espresso=new Espresso("인도", 30);
		espresso.taste();

	}

}
