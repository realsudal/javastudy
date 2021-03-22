package ex17_Object.Quiz01;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
public class Score {
	
	private int kor,eng,math;
	
	
	
	public Score(int kor,int eng,int math) {
		super();
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	public Score() {
		
	}
	
	@Override
	public String toString() {
		return "[국:"+kor+", 영 :"+eng+", 수 :"+math+"]";
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) { 	
			return true;
		}
		
		if(obj instanceof Score) {
			Score p=(Score)obj;
		
			if(kor==p.kor&& eng==p.eng&&math==p.math) {
				return true;
			}else {
				return false;
			}
		}
		
		return false;	
	}
	
	
	
}
