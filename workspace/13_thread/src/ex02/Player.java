package ex02;
//얘가 주된방법
public class Player implements Runnable {
	 //Runnable 인터페이스를 구현한다. (implements Runnable)
	
	// field
		private String name;

		// constructor
		public Player(String name) {
			super();
			this.name = name;
		}
		
		// method
		@Override
		public void run() {
			for (int i = 0; i < 3; i++) {
				System.out.println(name + "이(가) 게임중입니다.");
			}
		}
	
}
