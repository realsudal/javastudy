package quiz06;

public class Customer {

	private int customerBread;
	private int customerMoney;
	Bakery bakery;
	
	
	//Customer customer = new Customer(20000);//가진돈
	Customer(int customerMoney){
		this.customerMoney=customerMoney;
		
	}
	
	
	
	
	//구매 메서드
	//customer.buy(bakery1,10);//10개 구입
	void buy(Bakery bakery,int money) {
		BreadAndChnage bnc=bakery.sell(money);
		
		
		customerBread+=(bnc.getBread());
		customerMoney+=(bnc.getChange());
		//다른 클래스 호출해서 넣어줌
		System.out.println(this.bakery+"에서 "+customerBread+"개 구입");
	}
	
	
	
	
	
}
