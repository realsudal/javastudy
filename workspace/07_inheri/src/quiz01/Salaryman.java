package quiz01;

import javax.print.DocFlavor.STRING;

public class Salaryman extends Staff {

		private int salary;

		public Salaryman(String name,int salary) {
			super(name);//슈퍼 클래스의 staff 생성자 호출 먼저1
			this.salary = salary;
		}
		public int getPay() {
			return salary;
		}

		
}
