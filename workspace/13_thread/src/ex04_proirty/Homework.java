package ex04_proirty;

public class Homework extends Weekend implements Runnable{

	
	@Override
	public void run() {
		System.out.println("숙제합니다.");
	}
}
