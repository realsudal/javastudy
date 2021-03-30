package ex03_join;

public class Calcul extends Thread{

	private int result;
	private int from,to;
	
	@Override
	public void run() {
		addition();
	}
	
	
	public void addition() {
		//from~to까지 모든 정부 더한 결과 result에 저장
		if(from >to) {
			int temp=from;
			from=to;
			to=temp;
		}
		for(int n=from;n<=to; n++) {
			result+=n;
		}
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}


	public int getFrom() {
		return from;
	}


	public void setFrom(int from) {
		this.from = from;
	}


	public int getTo() {
		return to;
	}


	public void setTo(int to) {
		this.to = to;
	}
	
	
	
	
	
	
}
