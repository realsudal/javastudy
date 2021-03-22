package ex17_Object.ex04;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/*
 *- Object  equals()는
 * 			1. 자체를 비교 (객체를 비교하면 객체참조값이 비교됨)!
 * 
 * -String  equals() 는 
 * 			1.object의 equals를 오버라이딩한것
 * 			2. 문자 자체, 그 값을 비교 
 */

@Getter
@Setter
@NoArgsConstructor
public class Product {

	private String model;	//모델
	private String manufacture;	//제조사
	private String date; //제조일
	@Override
	public boolean equals(Object obj) {
		if(this==obj) { 	//p1.equals.p1 아예 똑같으면!
			return true;
		}
		
		if(obj instanceof Product) {//p1.equals(p2) 와같이 (p1이아닌)다른 객체를 넣으면 이 코드를 실행  (+ instanceof : 타입변환 가능한지 알아보는 메소드)
			Product p=(Product)obj; //object타입을 이름이 p인  product로 변환
			/*모델과 제조사를 비교 -> 동일하면 true /아니면 false
			 * p1의 모델 : model(= this.model)
			 * p2의 모델 : p.model
			 */
			if(model.equals(p.model)&& manufacture.equals(p.manufacture)) { //string의 equals를 사용 //obj.model 안되나?->객체가 아니라 변수라? 
				return true;
			}else {
				return false;
			}
		}
		
		return false;	//애초에 obj가 Product 자체가 아니라는 이야기
	}
	
	
	
	
	
	
}
