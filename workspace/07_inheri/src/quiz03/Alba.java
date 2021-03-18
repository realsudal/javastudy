package quiz03;

import java.sql.Time;

public class Alba extends Staff{
	private int payPerHour;
	private int times;
	
	public Alba(String name,int payPer) {
		super(name);
		this.payPerHour=payPer;
	}
	
	public int getpay() {
		int total=payPerHour*times;
		return total;
	}

	public int getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("페이 ; "+getpay());
	}
}
