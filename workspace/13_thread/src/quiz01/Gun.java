package quiz01;

public class Gun extends Weapon implements Runnable {//extends Weapon가 되있으니 extends Thread안되고 implements Runnable로 가능!

	private String name;
	private int bull;
	
	public Gun(String name, int bull) {
		this.name = name;
		this.bull = bull;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < bull; i++) {
			shoot(i);
		}
	}
	
	public void shoot(int i) { //1발씩 쏘는 메소드
		
		if(bull==0) {
			System.out.println("총알이 없음");
			return;
		}
		System.out.println(name+"총으로 "+(i+1) +"발 쏨");
			
	}
	

}
