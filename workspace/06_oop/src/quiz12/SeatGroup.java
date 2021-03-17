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

	//예약 - 결과 타입(boolean),메서드명(reservation), 매개변수 (없음)
	public boolean reservation() {
		//시트 좌석 번호(seatNo): 1~10
		//seats[]의 인덱스 : 0~9
		System.out.print("예매할 좌석 번호 입력 : ");
		int seatNo=sc.nextInt();
		//사용자가 예매하려는 시트 : seats[seatNo-1]
		//1.예매 번호 확인
		if(seatNo<1||seatNo>seats.length) {
			System.out.println(seatNo+"는 없는 좌석입니다. \n 다시 선택해주세요.");
			return false;
		}//예매 여부 확인
		if(seats[seatNo-1].isSave()) {
			System.out.print("예매자의 이름을 입력 : ");
			String name=sc.next();//공백이 없는 이름을 입력 받음
			seats[seatNo-1].setName(name);
			System.out.println(seatNo+"번 좌석이 "+name+"님의 좌석으로 예약 되었습니다.");
			return true;
			
		}else {
			System.out.println("이미 예약이 되어있는 좌석입니다.");
			return true;
		}
		
	}//reservation()메서드 닫음 
	
	//예매 취소 메소드- 결과 타입(boolean),메서드명(cancle), 매개변수 (없음)
	public boolean cancle() {
		System.out.print("예매 취소자의 이름 : ");
		String name=sc.next();
		for(int i=0;i<seats.length;i++) {
			//사용자 이름이 있고 , 받아온 정보와 예매자 목록에 값이 일치하면 if문 실행
			if(seats[i].getName()!=null && seats[i].getName().equals(name)) {
				System.out.print(name+"님의 예약을 취소하겠습니까 ?(Y/N) : ");
				String yesNo=sc.next();
				yesNo=yesNo.charAt(0)+""; //앞의 한글자만 추출, char타입+"문자" =>string타입 변환
				if(yesNo.equalsIgnoreCase("y")) {
					seats[i].cancle();
					System.out.println("예매가 취소되었습니다.");
					return true;
				}else {
					System.out.println("예매 취소가 취소되었습니다.");
					return false;
				}
			}
		}//for문 닫음
		//for의 배열 검색이 끝나면 명단에 없는것.
		System.out.println("예약자 명단에 없습니다.");
		return false;
	}//cancle() 메소드 닫음
	
	//예매 현황 출력 메소드
	public void info() {
		System.out.print(seatType+" : ");
		for(int i=0;i<seats.length;i++) {
			seats[i].info();
			System.out.print(" ");
		}
		
	}
	
	//현재 좌석 타입의 예매 총액 반환 메서드 
	public int getTotalCharge() {
		int total=0;
		for(Seat seat:seats) {
			if(!seat.isSave()) { //예약이 된 좌석
				total+=charge;
				
			}
		}
		return total;
	}
	
	
}
