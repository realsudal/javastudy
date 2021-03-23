package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
/*
 * HashMap 클래스
 * 		1. Map 인터페이스를 구현한 클래스
 * 		2. 데이터를 쌍(pair)으로 저장하는 클래스
 * 		3.키(Key)-값(value)의 쌍으로 저장
 * 			-키 : 중복이 불가능
 * 			-값 :  중복가능
 * 		4.인덱스의 역할을 키(Key)가 수행
 */
	
	
	/*
	 * www.naver.com   -DNS-> 111.222.3333(ip주소)
	 */
	public static void main(String[] args) {

		Map<String, Integer> score= new HashMap<String, Integer>();
		//1. 요소 추가하기 .put(  ,   );
		score.put("지구력", 80);
		score .put("근력",70);
		score.put("인내력",90);
		
		score.put("지구력", 100);//기존 지구력을 덮어쓰기
		
		//2.삭제 : .remove(key)
		score.remove("근력");
		
		//3. 요소 가져오기 : .get(key)
		System.out.println("지구력 : "+score.get("지구력"));
		System.out.println("인내력 : "+score.get("인내력"));
		
		//4. 크기 : .size()
		System.out.println("저장된 데이터 개수 : "+score.size());
		
		//5. 출력 
		System.out.println(score);
		
		//6. 순회는 방법이 많아서 따로진행
		
	}

}
