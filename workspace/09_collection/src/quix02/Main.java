package quix02;

import java.util.ArrayList;
import java.util.List;

public class Main {
/*
 * 1-10000사이 값을 가지고 있는 arraylist 를 2개만들고   
 * 모든요소를 하나씩 삭제
 * 1.가장 성능 좋은
 * 2.가장 선능나쁜 ->댕겨오는 작업이 많을수록 안좋음
 */
	public static void main(String[] args) {

		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		
		
		long start1=System.nanoTime();
		//앞부터 삭제
		for(int n=1; n<10000;n++) {
			list1.add(n);
		}
		
		for(int i=0,length=list1.size();i<length;i++) {
			list1.remove(0);
		}
		long end1=System.nanoTime();
		System.out.println("ArrayList1 삽입 순회시간(나쁨) : "+(end1-start1)+"ns");//애가느림
		
		
		
		long start2=System.nanoTime();
		//끝쪽부터 삭제
		for(int n=1; n<=10000;n++) {
			list2.add(n);
		}
		for(int n=list2.size()-1; n>-1;n--) {
			list2.remove(n);
		}
		long end2=System.nanoTime();
		System.out.println("ArrayList2 삽입 순회시간(좋음) : "+(end2-start2)+"ns");//애가더 빠름
		
		
		
		
		
	}

}
