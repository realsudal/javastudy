package ex07_override;

public class SweetPotatoPizza extends Pizza{

	private String goguma;

	public SweetPotatoPizza(String dough, int cheese, String goguma) {
		super(dough, cheese);
		this.goguma = goguma;
	}
	
	//고구마 정보의 출력을 위해서 피자의 정보를 다시 만듦  -> 오버라이딩
	@Override
	public void info() {
		super.info();
		System.out.println(goguma);
	}
	
	
}
