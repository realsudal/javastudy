package ex03_join;

public class Main {

	public static void main(String[] args) {

		Calcul cal=new Calcul();
		Calcul cal2=new Calcul();
		cal.addition(1, 500);
		cal.addition(501, 502);
		System.out.println(cal.getResult()+cal2.getResult());
	}

}
