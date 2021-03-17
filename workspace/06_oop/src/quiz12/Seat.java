package quiz12;

public class Seat {

	private String name;//예매자
	
	
	//예매자 이름 확인할때 씀
	public String getName() {
		return name;
	}
	//예매할때 씀
	public void setName(String name) {
		this.name = name;
	}
	
	//예매취소
	public void cancle() {
		name=null;
	}
	
	//에매 여부 확인 -예매가 된 좌석 : 예매 불가(=false), 안된좌석 : 예매가능 (=true)
	public boolean isSave() {
		return (name==null);
	}
	
	//좌석확인
	public void info() {
		if(name==null) {
			System.out.print("예매가능");
		}else {
			System.out.print(name.charAt(0)+"*"+(name.length()>2 ? name.charAt(name.length()-1): " "));
		}
	}
	
	
	
	
	
}
