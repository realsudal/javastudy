package Quiz05;

public class MainClass {

	public static void main(String[] args) {
		Circle won=new Circle();
		won.getRadius(1.5);
		System.out.println("원둘레 : "+ won.getCircum());
		System.out.println("원넓이 : "+won.getArea());
	}

}
