package ex08_casting;

public class Tv extends Elec {

	public String model;

	public Tv(int watt, String model) {
		super(watt);
		this.model = model;
	}
	
	@Override
	public void info() {
		System.out.println("tv 모델명 : "+model);
		super.info();
	}
	

	
	
	
}
