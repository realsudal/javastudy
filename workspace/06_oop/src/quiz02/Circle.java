package quiz02;

public class Circle {

	
	private Coordinates center;
	private double radius;
	
	Circle(Coordinates center,double radius){
		this.center=center;
		this.radius=radius;
	}
	Circle(int x,int y,double radius){
		this.center=new Coordinates(x, y);  //좀 어렵구만 ㅎ
		this.radius=radius;
		
		//new를 붙이면 생성자를 부르는 역할같음 
	}
	
	
	
	
	
	
	void info(){
		System.out.print("\n 중심 :");
		center.info();
		System.out.print(", 반지름 :"+radius+", 넓이 :"+Math.pow(radius, 2)*Math.PI);
	}
	
	
	
}
