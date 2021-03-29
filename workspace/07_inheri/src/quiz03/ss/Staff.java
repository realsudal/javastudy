
package quiz03;

import java.sql.Time;

public class Staff {

	private String name;
	//생성자
	public Staff(String name) {
		super();
		this.name = name;
	}
	//게터 세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void info() {
		System.out.println("직원명 : "+name);
	}
	
}
