package ex06_Hashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMain {
/*
 * LinkedHashSet 클래스는 저장된 요소들의 "순서"가 유지된다.
 */
	public static void main(String[] args) {

		Set<String> set=new LinkedHashSet<String>();
		set.add("html");
		set.add("css");
		set.add("js");
		set.add("html");
		set.add("css");
		set.add("js");
		
		for (String s:set) {
			System.out.println(s);
		}
	}

}
