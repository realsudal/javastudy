package quiz12;

import java.util.Scanner;

public class SeatGroup {
	private char seatType; //s r a b 석
	private int charge;
	private Seat[] seats;
	private Scanner sc=new Scanner(System.in);
	
	
	public Seat[] getSeats() {
		return seats;
	}
	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}


	//생성자
	public SeatGroup(char seatType,int seatCount,int charge) {
		this.seatType=seatType;
		this.charge=charge;
		this.seats=new Seat[seatCount];	//배열 크기만 생성
		//배열의 실제 seat 생성 작업
		for(int i=0;i<seatCount;i++) {
			seats[i]=new Seat();//빈 좌석 생성
		}
	}

	
	
	
	
}
