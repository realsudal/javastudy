package ex12_abstract;

public class Circle extends Shape{

	private int x,y;
	private double radius;
	
 //생성자
	public Circle(int x, int y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	


	//게터 세터
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
	
}
