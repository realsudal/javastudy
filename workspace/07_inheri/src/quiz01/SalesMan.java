package quiz01;

public class SalesMan extends Salaryman{

	private int salesAmount;
	private double incentive;//단위 %
	
	//생성자 - 필드값은 넣지않음!	
	public SalesMan(String name, int salary) {
		super(name, salary);
	}

	//게터 세터
	public int getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
		if(salesAmount>=1000) {
			setIncentive(0.07); //실적의 7퍼센트
		}else {
			setIncentive(0.05);//실적의 5퍼센트
		}
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	public int getSalesPay() {
		return (int)(getSalesAmount()*incentive);
	}
	
	//메소드
	@Override
	public int getPay() {
		//int partM=getSalesAmount()*getIncentive();
		return super.getPay()+getSalesPay();
		
	}
	
	
}
