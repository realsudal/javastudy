package ex16_interface_expend;

public class Pet {

	private String name;

	//생성자
	public Pet(String name) {
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
	
	
	public void feed(String food) {
		System.out.println(name+"is eating"+ food);
	}

	
	
	
	
}
