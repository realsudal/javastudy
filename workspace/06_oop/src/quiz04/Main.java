package quiz04;

public class Main {

	public static void main(String[] args) {
		Gun gun=new Gun("m4",2);//총과 현재 장전수
		Soldier soldier=new Soldier("mimi",gun);
		
		// 실재 총관련 필드는 gun이 있기 때문에 gun메소드에서 작업후 soldier는 넘겨서 받아오기만 하는것이 포인트~~ ^^ㅗ
		
		soldier.shoot();//빵야 -> 1발남앗ㅅㅂ니다
		soldier.shoot();//빵야 -> 0발남앗ㅅㅂ니다
		soldier.shoot();//없어
		
		soldier.reload(2);//2발 장전됨. 현재 2발
		soldier.reload(2);//4발 장전되엇다. 현재 6발
		soldier.reload(2);//0발이 장전 현재 6발
		
		soldier.info();//mimi,m4에 현재 6발 남앗다.
		
		
	}

}
