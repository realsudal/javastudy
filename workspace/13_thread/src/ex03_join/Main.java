package ex03_join;

public class Main {

	public static void main(String[] args) {

		Calcul cal1=new Calcul();
		Calcul cal2=new Calcul();
		cal1.setFrom(1);
		cal1.setTo(500);
		cal2.setFrom(501);
		cal2.setTo(1000);
		
		cal1.start();
		cal2.start();
		
		//main이 cal1과cal2가 끝날때까지 기다려줘야 답이 나옴
		//thread종료를 기다리는 메소드 : join()
		//join() 호출은 에외 처리가 필요하다.
		try {
			cal1.join();
			cal2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(cal1.getResult()+cal2.getResult());
	}

}
