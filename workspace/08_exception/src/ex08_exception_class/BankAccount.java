package ex08_exception_class;

public class BankAccount {

	// field
	private String accNo;
	private long balance;
	
	// constructor
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	// method
	public void deposit(long money) throws BankAccountException {
		if (money <= 0) {
			throw new BankAccountException(money + "원은 입금할 수 없습니다.", 1000);
		}
		balance += money;
	}
	
	// 실제로 출금된 금액을 반환하는 메소드
	public long withdraw(long money) throws BankAccountException {  // long money : 요청금액
		if (money <= 0) {
			throw new BankAccountException(money + "원은 출금할 수 없습니다.", 2000);
		} else if (money > balance) {
			throw new BankAccountException("잔액이 부족합니다.", 2001);
		}
		balance -= money;
		return money;
	}
	
	public void inquiry() {
		System.out.println("계좌번호: " + accNo + "(" + balance + "원)");
	}
	
	public void transfer(BankAccount you, long money) throws BankAccountException {
		you.deposit(withdraw(money));
	}
	
}
