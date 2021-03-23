package quiz01;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Member {

	private int mNo;
	private String mId;
	private Date mDate;
	
	
	
	
	
	
	//lokbok을 활용한, getter,setter,constcuct 생성
	
	//Object 클래스의 toString 오버라이드
	
	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", mId=" + mId + ", mDate=" + mDate + "]";
	}
	
}
