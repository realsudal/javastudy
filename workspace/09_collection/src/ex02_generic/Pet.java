package ex02_generic;

public class Pet <T,U>{

	private T name;
	private U age;
	
		public Pet(T name,U age){
			this.name=name;
			this.age=age;
		}
		
		@Override
		public String toString() {
			return "["+name+","+age+"]";
		}
		
		
		
		
}
