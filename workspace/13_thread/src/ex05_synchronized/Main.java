package ex05_synchronized;
/*
 * 동기화 : 하나뿐인 자워ㄴ을 여러명이서 쓸려해서 순서대로 정렬 
 */
public class Main {

	public static void main(String[] args) {

		
		Dyson v11=new Dyson();	//청소기 1대
		
		Mama ma=new Mama();
		Papa pa=new Papa();
		
		ma.setDyson(v11);		//엄마도 청소기 씀
		ma.start();//mama의 run
		
		pa.setDyson(v11);		//아빠도 청소기 씀
		pa.start();//papa의 run
		
		
		//순서를 잡아 놔 실행가능한 코드.
	}

}
