package ex04_proirty;

public class WatchTV extends Weekend implements Runnable{

	@Override
	public void run() {
		System.out.println("TV 봅니다.");
	}
}
