package quiz12;

import java.util.Scanner;

public class Consert {
	private String hallName;
	private char[] seatTypes= {'S','R','A','B'};
	private int[] seatCounts= {10,10,10,10};
	private int[] charges= {20000,15000,10000,50000};
	private SeatGroup[] seatGroups;
	private Scanner sc=new Scanner(System.in);
	
	public Consert(String hallName) {
		this.hallName=hallName;
		this.seatGroups=new SeatGroup[seatTypes.length];
		
		//SeatGroup 생성
		for(int i=0;i<seatGroups.length;i++) {
			seatGroups[i]=new SeatGroup(seatTypes[i], seatCounts[i], charges[i]);
		}
	}
	
	public void run() {
		while(true) {
			menu();
			System.out.print("입력 : ");
			int choice=sc.nextInt();
			switch (choice) {
				case 1:
					reservation();			
					break;
				case 2:
					cancle();
					break;
				case 3:
					inquiry();
					break;
				case 4:
					info();
					break;
				case 0:
					exit();
					return;
		
				default:
					System.out.println("입력을 잘못했습니다.");
					break;
			}
		}
		
	}
	
	public void menu() {
		System.out.println("==예매 프로그램==");
		System.out.println("1. 예매");
		System.out.println("2. 예매 취소");
		System.out.println("3. 예매 조회");
		System.out.println("4. 전체 예매 현황");
		System.out.println("0. 시스템 종료");
		System.out.println("============");
		
	}
	
	
	public void reservation() {
		System.out.print("예매할 좌석 타입(S,R,A,B) : ");
		char seatType=sc.next().charAt(0);
		for(int i=0;i<seatTypes.length;i++) {
			if(seatType==seatTypes[i]) {
				seatGroups[i].reservation();
			}
		}
	}
	public void cancle() {
		System.out.print("예매 취소할 좌석 선택(S,R,A,B) : ");
		char seatType=sc.next().charAt(0);
		for(int i=0;i<seatTypes.length;i++) {
			if(seatType==seatTypes[i]) {
				seatGroups[i].cancle();
			}
		}
	}
	public void inquiry() {
		System.out.print("조회할 사용자 이름 : ");
		String name=sc.next();
		for(int i=0;i<seatGroups.length;i++) {//S,R,A,B를 다 뒤짐
			
			SeatGroup seatGroup=seatGroups[i];
			Seat[] seats=seatGroup.getSeats();
			
			for(int j=0;j<seatGroups[i].getSeats().length;j++) {//seatGroups[i] = srab 좌석 , getSeats= 12345678910 (Seat값이 다른 클래스에 있으니까 메서드 호출)
				if(seats[j].getName()!=null && seats[j].getName().equals(name)) {
					System.out.print(seatTypes[i]+" 타입 "+(j+1)+"번 좌석이  "+name+"님 이름으로 예약되어있습니다.\n\n");
					return;//메소드 종료
				}
			}
			
		}//제일 밖 for문 닫음
		System.out.println(name+"님의 예매정보가 없습니다.");
	}
	public void info() {
		System.out.println("홀 : "+hallName+"\n 예매 총액 : "+getTotalCharge()+" 원"); //getTotalCharge() : 아래 작성한 메서드
		for(SeatGroup seatGroup:seatGroups) {
			seatGroup.info();
			System.out.println(" ");
		}
	}
	//전체 예약 총액 반환하는 메소드
	public int getTotalCharge() {
		int total=0;
		for(SeatGroup seatGroup:seatGroups) {
			total+=seatGroup.getTotalCharge();
			
		}
		return total;
	}
	public void exit() {
		System.out.println(hallName+" 예매 프로그램 종료");
		sc.close();
	}
}
