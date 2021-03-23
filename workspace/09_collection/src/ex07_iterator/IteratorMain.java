package ex07_iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorMain {
/*
 * Interator 인터페이스
 * 	1.collection(List,Set)을 순회하는 경우에 사용
 * 2."반복자"라고ㅓ함
 * 3. 순회를 하고자 하는 Collection에 iterator() 메소드를 부착해서 생성합니다.
	4. 인덱스 유무와 상관없이 사용합니다.
 */
	public static void main(String[] args) {


		Set<String> set=new HashSet<String>();
		
		set.add("movie");
		set.add("music");
		set.add("sport");
		
		//set를 순회 할 수 있는 Iterator객체 생성
		
		//iterator는 인터페이스라 new가불가(내용이 비었으니까)
		Iterator<String> itr=set.iterator(); //set이 string 이니까 iterator도 string으로 맞춰줘야함
		
		//hasNext():다음 요소가 있으면 true, 없으면 false
		//next(): 다음 요소를 가져온다.
		
		while(itr.hasNext()) {//set에 남이있는 요소가 있으면
			String str=itr.next();
			System.out.println(str);
		}
	
		//----------------------------------------
		
		List<String> list=new ArrayList<String>();
		list.add("운동");
		list.add("드개질");
		list.add("요리");
		
		
		Iterator<String> itr2=list.iterator();
		
		while(itr2.hasNext()) {//set에 남이있는 요소가 있으면
			String str2=itr2.next();
			System.out.println(str2);
		}
		 
	}

}
