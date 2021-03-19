package quiz04;

public class Main {

	public static void main(String[] args) {

		Fighter fighter1=new KoreanFighter("정찬성"); //에너지 , 공격력은 랜덤임
		Fighter fighter2=new GlobalFighter("에드가");
		
		fighter1.info();
		fighter2.info();
		
		
		System.out.println("경기 시작");
		
		//선빵 결정 :50%
		boolean myTurn=Math.random()<0.5;
		
		do{
			
			if(myTurn) {
				fighter1.attack(fighter2);//fighter1의 공격
			}else {
				fighter2.attack(fighter1);
			}

		}while(fighter1.isAlive() &&fighter2.isAlive());
		
		
		System.out.println("겜 끝");
		
		if(fighter1.isAlive()) {
			System.out.println(fighter1.getName()+"의  승리 , 남은 에너지는 "+fighter1.getEnergy());
		}else {
			System.out.println(fighter2.getName()+"의  승리 , 남은 에너지는 "+fighter2.getEnergy());
		}
	}

}
