package ex16_interface_expend;

public class Person {
	
		//1. Pet에게 food주기
	
		public void food(Pet pet,String food) {//다른 클래스의 메서드임으로 pet타입의 pet을 받아오는 객체 생성
			pet.feed(food);
			
		}
		
		
		public void walking(Walkerable pet) {//산책하기 메서드  - dog 에만 있는 메서드 Walkerable => snake 는 걸러짐 
			System.out.println("waking with"+((Pet)pet).getName());
		}
}
