package ex03_generic;

public class Box<T> {
	
	//private T[] items=new T[10]; 객체가 선언(=타입의 구체화) 될때 배열이 생성되지만, 그전에 배열을 만들려면 먼저 컴파일이되야되서 안댐 ㅜ
	//따라서 Object 타입으로 선언해야됨
	private T[] items;
	private int idx;
	
	public Box(int itemCount) {
		//items=new T[itemCount]; T의 타입을 몰라서, 메모리할당이 불가!!
		//items=new Object[itemCount]; T의 타입과 Object타입이 달라서 불가.
		items=(T[])(new Object[itemCount]);//따라서 Object타입을 T타입으로 변환
		
	}
	
	public void addItem(T item) {
		if(idx==items.length) {//배열이 다 차면
			System.out.println("full");
		}
		items[idx++]=item;	//배열이 남아있으면 과일과 가격넣음
	}
	
	@Override
	public String toString() {
		String result="";
		for(T item:items) {
			if(item!=null) {
				result+=item.toString(); 	//	item.toString(); 은 Fruit의 toString()
			}
		}
		return result;
	}
	
	
	
}
