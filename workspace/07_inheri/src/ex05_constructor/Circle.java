package ex05_constructor;

public class Circle extends Coord{
	
	private double raius;
	
	public Circle(int x, int y,double radius) {//수퍼꺼니까 x,y를 반드시 앞에 써줘야함
		super(x,y);
		this.raius=radius;
	}
	
	public void info() {
		System.out.println("반지름 :"+raius);
		System.out.println("좌표 :["+getX()+", "+getY()+"]");
	}
	
	
	
}
