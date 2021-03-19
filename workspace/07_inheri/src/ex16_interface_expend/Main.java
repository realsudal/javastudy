package ex16_interface_expend;

public class Main {

	public static void main(String[] args) {
 
			Dog dog=new	 Dog("태풍이");
			Snake snake=new Snake("뱜");
			
			Person person=new Person();
			
		
			//1.음식주기
			person.food(dog,"닭고기");
			person.food(snake,"소고기");
			
			//2. 산책하기
			person.walking(dog);
			//person.walking(snake);//컴파일 에러내고싶다.
	}

}
