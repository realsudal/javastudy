package ex07_recusive;

public class SayHello {

	//재귀호출
	/*
	 * 
	 */
	
	public void say(int n) {
		//for(int i=0;i<n;i++) {
		
		if(n>0) {
			System.out.println("hello");
			say(n-1);
		}
		//}
		
	}
}
