package ex04_proirty;

public class Main {

	public static void main(String[] args) {

		//스레드의 우선 순위 (3단계) 낮 ->높
		System.out.println("우선 순위 낮음 : " + Thread.MIN_PRIORITY);
		System.out.println("우선 순위 중간 : "+ Thread.NORM_PRIORITY);
		System.out.println("우선 순위 높음 : "+Thread.MAX_PRIORITY);
		
		Thread watchTV =new Thread(new WatchTV());
		Thread homework =new Thread(new  Homework());
		
		//homwork 우선 높
		//tv 우선 낮
		homework.setPriority(Thread.MAX_PRIORITY);
		watchTV.setPriority(Thread.MIN_PRIORITY);
		
		watchTV.start();
		homework.start();
	}

}
