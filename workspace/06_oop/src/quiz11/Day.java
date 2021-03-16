package quiz11;

public class Day {
	public String schedule;

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	
	public void info() {
		if(schedule==null||schedule.isEmpty()) {//null또는 빈문자열이면 참
			System.out.println("없음");
		}else {
			System.out.println(schedule);
		}
	}
}
