package ex11_abstract;
/*
 * 	"추상클래스"를 "상속받는 서브클래스"들은
 *  	"반~드시" 모든 추상메소드를 오버라이드 해야된다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
public class SalaryMan extends Staff{

	private int salary;
	
	//생성자
	public SalaryMan(String name,int salary) {
		super(name);
		this.salary = salary;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("기본급 : "+salary);
	}
	
	// < 필 수 메 서 드 . , > 		 'staff의 자식클래스'라면 '추상클래스'를 받아야됨.
	@Override
	public int getPay() {
		return salary;
	}
	
	
}
