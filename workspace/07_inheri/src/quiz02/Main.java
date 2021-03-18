package quiz02;

public class Main {

	public static void main(String[] args) {
		//월급쟁이
		Salaryman s1=new Salaryman("yan",5000);
		
		System.out.println(s1.getName());
		System.out.println(s1.getPay());
		
		SalesMan s2=new SalesMan("mo", 20000);
		s2.setSalesAmount(50000);
		
		Alba s3=new Alba("alba", 10000);
		s3.setTimes(200);
		System.out.println(s3.getName());
		System.out.println(s3.getpay());
		
		
		
		Company c1=new Company(10);
		
		//업캐스팅이 이루어짐~~!
		Company.hireStaff(s1);//셀러리맨이 스
		Company.hireStaff(s2);									//staff에 인포 메서드가 잇지만 하위 클래스들에는 없어서 오버라이딩 시켜줘야됨.
		Company.hireStaff(s3);
		Company. staffInfo();
		
	}

}
