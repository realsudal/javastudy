package ex03_join;

public class Calcul {

	int result;
	
	public void addition(int from,int to) {
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
	
	
	
	
	
	
}
