package quiz03;

import java.util.HashSet;
import java.util.Set;

//해쉬번호 6개를 hashset에 저장하기
public class Main_lotto {

	public static void main(String[] args) {

		Set<Integer> lotto=new HashSet<Integer>();
		
		while(lotto.size()!=6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		
		System.out.println(lotto);
	
		
		
	}

}
