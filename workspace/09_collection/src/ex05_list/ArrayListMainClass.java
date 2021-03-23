package ex05_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMainClass {

	/*
	 * ArrayList 클래스 (☆☆☆☆☆)
	 * 		1.List 인터페이스를 구현한 클래스
	 * 		2. 생성방법
	 * 			1)ArrayList<E> list=new ArrayList<E>();
	 * 			2)List<E> list=new ArrayList<E>();
	 * 			3) 배열을 구현한 클래스입니다. 자동으로 길이를 조정합니다.
	 *			4) 장점: 순차적인 접근이 빠르다.
	 *			5) 단점: 중간 위치에 추가/삭제가 느리다.
	 */


		public static void main(String[] args) {
			//1. 생성
			List<String> list=new ArrayList<String>();
			
			//2. 추가 -add()    <-string
			list.add("뿡이");  
			list.add("웅이");
			list.add("앱응이");
			list.add("액희뿡");
			
			//3. 삭제 -1. Object 는 리스트 안의 값 지우기 -2. index이용은 리스트 순서 기준 지우기
			list.remove(1);
			list.remove("뿡이");
			
			//4. 크기
			System.out.println("리스트의 길이 :"+list.size()); // 리스트의 길이는 size() !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			
			//5. 포함 여부 확인-list.contains()
			if(list.contains("앱응이")) {
				System.out.println("앱응이는 존재합니다.");
			}else {
				System.out.println("앱응이는 없습니다.");
			}
			
			//6. 요소(값) 가져오기-list.get(인덱스번호)
			System.out.println("첫번째 요소 :"+list.get(0));
			System.out.println("마지막 요소 :"+list.get(list.size()-1));
			
			//7. 전체 순화
					//-1)일반 for문
			for(int i=0;i<list.size();i++) {
				System.out.println((i+1)+"번째 요소 :"+list.get(i));
			}
			
						/*
						 <바로 위 코드를 좀더 빨리 만들려면?>
						 
						  int length=list,size();   size()메소드 호출을 1번만 진행 -> 속도 빨라짐 ㅋㅎ   
						  for(int i=0;i<length;i++) {  		(== for(int i=0,length=list.size;i<legth;i++) 같이 변수를 초기값에 2개 선언해도 됨!!!!!!!!!!!!!!) 
							System.out.println((i+1)+"번째 요소 :"+list.get(i));
						}
						 */
			
			
						/*
						 s.length (=변수참조)
						list.size() (=메소드) : 배열보다 빠름(성능 향상)
						*/
			
					//-2)향상 for문
					for(String element : list) {
						System.out.println(element);
					}
			
			
			//8. 출력
					System.out.println("한번에 출력 : "+list);
					
			//9.초기화
					list.clear();
					System.out.println("초기화 :"+list);
			
		}

	}