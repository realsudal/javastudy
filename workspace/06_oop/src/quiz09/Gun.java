package quiz09;

public class Gun {

	private String model;
	private int bullet;
	private final int FULL_BULLET=6;
	
	//생성자 - 총,총알
	Gun(String model,int bullet){
		this.model=model;
		this.bullet=bullet;
	}
	

	//메서드  - 총을 쏨
	public void shoot() {
		if(bullet>0) {
			bullet--;
			System.out.println(model+"을 쐈다. 빵야("+bullet+"발 남음)");
		}else if(bullet==0) {
			System.out.println(model+"을 못 쐇습니다.");
		}
	}
	//메서드 - 총알 추가
	public void reload(int bullet) {
		if(this.bullet+bullet<FULL_BULLET) {
			this.bullet+=bullet;
			System.out.println(model+"("+bullet+"발 추가됨. 현재 "+this.bullet+" 발)");
		}else {
			int realbull=FULL_BULLET-this.bullet;
			this.bullet=FULL_BULLET;
			System.out.println(model+"("+realbull+"발 추가됨. 현재 "+this.bullet+" 발)");
		}
		
	}
	//메서드 - '총알 정보' 출력 
	public void info() {
		System.out.println(model+"("+bullet+"발 남아있음)");
	}

	//모델을 알려주는 게터 세터
	public String getModel() {
		return model;
	}


	public int getBullet() {
		return bullet;
	}


	public void setBullet(int bullet) {
		this.bullet = bullet;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	
}
