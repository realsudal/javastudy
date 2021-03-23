package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList 클래스 (☆☆☆☆☆)
 * 		1.List 인터페이스를 구현한 클래스
 * 		2. 생성방법
 * 			1)LinkedList<E> list=new LinkedList<E>();
 * 			2)List<E> list=new LinkedList<E>();
 * 			3) 배열을 구현한 클래스입니다. 자동으로 길이를 조정합니다.
 *			4) 장점: 중간 위치에 추가/삭제가 빠르다.
 *			5) 단점: 순차적인 접근이 느리다.
 */
public class LingkedListMain {
	
	public static void main(String[] args) {

		//ArrayList와 LinkedList의 사용법은 같습니다.

		//성능비교
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new LinkedList<Integer>();
		
		//1. 추가(리스트 0에 인덱스 추가)
		long start1=System.nanoTime();
		for(int n=1; n<=10000;n++) {
			list1.add(0,n);
		}
		long end1=System.nanoTime();
		System.out.println("ArrayList 삽입 소요시간 : "+(end1-start1)+"ns"); //느림
			
		
		long start2=System.nanoTime();
		for(int n=1; n<=10000;n++) {
			list1.add(0,n);
		}
		long end2=System.nanoTime();
		System.out.println("LinkedList 삽입 소요시간 : "+(end1-start1)+"ns"); //애가더 빠름
		
		
		
		//2, 순회
		long start3=System.nanoTime();
		for(int i=0,length=list1.size();i<length;i++) {
			list1.get(i);
		}
		long end3=System.nanoTime();
		System.out.println("ArrayList 삽입 순회시간 : "+(end3-start3)+"ns");//애가더 빠름
		
		
		
		long start4=System.nanoTime();
		for(int i=0,length=list2.size();i<length;i++) {
			list2.get(i);
		}
		long end4=System.nanoTime();
		System.out.println("LinkedList 삽입 순회시간 : "+(end4-start4)+"ns"); //느림
	}

}
