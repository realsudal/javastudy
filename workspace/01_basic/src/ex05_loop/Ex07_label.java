package ex05_loop;

public class Ex07_label {

	public static void main(String[] args) {
		//label
		//1.소스코드의 특정위치를 지정하는 방법
		//2.label:소스코드
		
		outer:for(int dan=2;dan<=9;dan++) {
			inner:for(int n=1;n<=9;n++) {
				System.out.println(dan+"x"+n+"="+(dan*n));
				if(dan==5 && n==5) {
					break outer;
				}
			}
		}
		
		
		
		
		//2단부터 9단까지 (위 inner,outer와 같은 코드)
		//dan X n = (dan*n)
		/*
		for(int dan=2; dan<=9; dan++) {
			
			for(int n=1;n<=9;n++) {
				if(dan==5 && n==5) {
					break;
				}
				System.out.println(dan+"x"+n+"="+(dan*n));
				
			}
			if(dan==5) {
				break;
			}
		}*/
		
		
	}

}
