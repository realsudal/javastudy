package ex07_recusive;

public class MainClass {

	public static void main(String[] args) {
		SayHello sh=new SayHello();
		sh.say(5);
		
		
		Adder adder=new Adder();
		
		adder.calculate(10);
		System.out.println(adder.getTotal());
		
		
		Calculater cal=new Calculater();
		int n=3;
		System.out.println(n+"! = "+cal.getFactorial(n));
	}

}
