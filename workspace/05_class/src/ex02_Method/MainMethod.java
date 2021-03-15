package ex02_Method;

public class MainMethod {

	public static void main(String[] args) {

		Person p = new Person();
		p.set("mimi", 20, '남', true,190,80);
		
		System.out.println(p.name+" "+p.gender+"\n");
		
		p.info();
		
		System.out.println(p.getMBI());
	}

}
