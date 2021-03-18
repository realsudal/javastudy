package quiz01;

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
		System.out.println(s3.pay());
		
	}

}
