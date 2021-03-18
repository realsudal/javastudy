package ex07_override;

public class Main {

	public static void main(String[] args) {
		
		Pizza pizza=new Pizza("기본", 2);
		pizza.info();
		
		System.out.println(" ");
		
		SweetPotatoPizza sweetPotetoPizza=new SweetPotatoPizza("아보카도", 3, "우리나라 고구마");
		sweetPotetoPizza.info();
	}

}
