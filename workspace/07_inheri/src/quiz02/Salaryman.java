package quiz02;

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

		@Override
		public void info() {
			super.info(); //staff의  인포 출력 -> 이름 출력
			System.out.println("월급 : "+salary);
			
		}
		
}
