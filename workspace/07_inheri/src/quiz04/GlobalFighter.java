package quiz04;

public class GlobalFighter extends Fighter{

	//attack() : 10퍼센트 확률로 한방에 ko시킴
	public GlobalFighter(String name) {
		super(name, (int)(Math.random()*100)+1,  (int)(Math.random()*10)+1);
	}

	@Override
	public void attack(Fighter fighter) { //중요!!!! 코리아,글로벌파이터 둘다되는 슈퍼클래스 타 입 !
		//나:this  , 상대 : fighter
		if(Math.random()<0.1) {//10퍼 확률
			fighter.setEnergy(0);
			System.out.println(fighter.getName()+" ko" );
		}else {
			fighter.setEnergy(fighter.getEnergy()-this.getPower());
			System.out.println("공격 : "+this.getName()+"["+fighter.getName()+"남 ]");
		}
	}
}
