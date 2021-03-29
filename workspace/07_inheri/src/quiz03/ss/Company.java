package quiz03;

public class Company {

	// field
	private Staff[] staffList;
	private int idx;
	
	// constructor
	public Company(int staffCount) {
		staffList = new Staff[staffCount];
	}
	
	// method
	public void hireStaff(Staff staff) {
		if (idx == staffList.length) {
			System.out.println("직원을 모두 고용했습니다.");
			return;
		}
		staffList[idx++] = staff;
	}
	public void staffInfo() {
		for (Staff staff : staffList) {
			if (staff != null) {
				staff.info();
			}
		}
		System.out.println("SalaryMan의 급여총액: " + getSalaryManTotalPay());
	}
	// SalaryMan들에게 지급된 급여총액
	public int getSalaryManTotalPay() {
		// Staff[] staffList; 이므로 저장된 객체들이 SalaryMan인지 검사해 봐야 합니다.
		int salaryManTotalPay = 0;
		for (Staff staff : staffList) {
			if (staff instanceof SalaryMan) {
				if ( !(staff instanceof SalesMan) ) {
					salaryManTotalPay += ((SalaryMan) staff).getPay();
				}
			}
		}
		return salaryManTotalPay;
	}
	
}
