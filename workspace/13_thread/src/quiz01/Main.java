package quiz01;

public class Main {

	
public static void main(String[] args) {

		
	Thread gun1=new Thread(new Gun("베베",10));
	Thread gun2=new Thread(new Gun("콜트",10));
		
		gun1.start();
		gun2.start();
		
		//콜1 ,2 베 1,2
		
	}
}
