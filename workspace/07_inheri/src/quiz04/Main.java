package quiz04;

public class Main {

	public static void main(String[] args) {

		Fighter fighter1=new KoreanFighter("정찬성"); //에너지 , 공격력은 랜덤임
		Fighter fighter2=new GlobalFighter("에드가");
		
		
		//선빵 결정 :50%
		boolean myTurn=Math.random()<0.5;
		
		do{
			if(myTurn) {
				fighter1.attack(fighter2);
			}else {
				fighter2.attack(fighter1);
			}

		}while(fighter1.);
		
	}

}
