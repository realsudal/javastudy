package quiz02;

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
	}
	
	
	
	
	
	
}
