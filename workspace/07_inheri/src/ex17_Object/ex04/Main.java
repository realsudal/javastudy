package ex17_Object.ex04;

public class Main {

	public static void main(String[] args) {

		Product p1=new Product();
		Product p2=new Product();
		
		p1.setModel("ca-001");
		p1.setManufacture("bio");
		p1.setDate("2021-03-01");
		
		p2.setModel("ca-001");
		p2.setManufacture("bio");
		p2.setDate("2021-03-05");
		
		/*위 두 코드는 같은 종류의 제품이다. (model,manufacture 가 모두 같은 경우)
		 * 즉 , 제품은 2개(독립적인 제품)
		 */
		
		if(p1.equals(p2)) {	//equals는 Object 클래스의 메소드라 어느 클래스에서든 다 사용가능~ ㅋ
							//또한Object의 equals 메소드는 값을 비교하지 않고, 저장된 주소의 객체인지를 구분함(=객체의 주소)
			System.out.println("같은 종류 제품");
		}else {
			System.out.println("다른 종류 제품");
		}
		
		
	}

}
