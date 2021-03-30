package ex05_synchronized;
/*critical section 
 * 		1. 임계 영역
 * 		2. 공유 지원을 관리하기 위해서 한번에 한  스레드의 접근만 허용.
 * 			 ㄴ> thread safe하다.	
 * 		3. synchronized 키워드를 추가한다.
 * 		
 */


/*
 * synchronized
 * 		ㄴ한 스레드만 floorCleaning()나 otherCleaning() 에 접근할수있다.
 * 		ㄴ동시 접근 x
 */
public class Dyson {

	public synchronized void floorCleaning() {
		try {
			
		System.out.println("바닥 청소를 하고 있다.");
		Thread.sleep(1000); //1000m/s(=1초)  중지
		notify();//다른 thread에게 floorCleaning이 끝났음을 알리는 코드. -> otherCleaning() 실행
		wait();//다른 thread가 끝났다고 알려줄때 까지 기다리는 코드
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void otherCleaning() {
		
		try {

			System.out.println("바닥 이외의 곳을 청소중이다.");
			Thread.sleep(1000);
			notify();
			wait();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	
	
}
