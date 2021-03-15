package ex05_loop;

public class Quiz04 {

	public static void main(String[] args) {
		//소원을 3개 들어준다
		//안되는 소원은 "로도 당첨" 입니다. 나머지 소원은 모두 들어준다.(continue)
		//------------------
		//
		for(int dan=1;dan<=9;dan++) {
			for(int n=2;n<=9;n++) {
				System.out.print(n+"x"+dan+"="+(dan*n)+"\t");
				
			}
			System.out.println(" ");
		}
	
	
	
	}

}
