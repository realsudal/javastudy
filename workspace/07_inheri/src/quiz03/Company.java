package quiz03;

public class Company {

	private Staff[] staffList;
	private int index;
	
	public Company(int staffCount) {
		staffList=new Staff[staffCount];
	}
	
	public void hireStaff(Staff staff) {
		if(index==staffList.length) {
			System.out.println("직원을 모두 고용함");
			return;
		}staffList[index++]=staff;
	}
	
	
	public void staffInfo() {
		for(Staff staff : staffList) {
			if(staff != null) {
				staff.info();
			}
		}
		System.out.println("salaryman의 급여총액 : "+ getSalaryManTotalPay());
	}
	
	
	public int getSalaryManTotalPay() {
		//staff[] stafflist; 이므로 저장된 객체들이 샐러리맨인지 검사해봐야한다.
		int salaryManTotalPay=0;
		for(Staff staff : staffList) {
			if(!(staff instanceof SalesMan)) {//샐러리맨의 객체가 스테프면 안돼서 세일즈맨의 인스턴스 아닌게 참인걸로 함.
				salaryManTotalPay+=((SalaryMan)staff).getPay();
			}
		}
		return salaryManTotalPay;
	}
	
	
	
}
