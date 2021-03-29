package Map.map02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class LoopForHashMap {

	public static void main(String[] args) {

		Map<String, String> me = new HashMap<String, String>();
		me.put("name", "민경태");
		me.put("age", 44 + "");
		me.put("phone", "010-8725-4966");
		
		// 1. 향상 for문은 Key를 뺍니다. (Key를 이용해서 Value를 빼기 때문입니다.)
		// me에서 Key만 빼는 메소드 : keySet()
		Set<String> keys = me.keySet();
		for (String key : keys) {
			System.out.println(key + ": " + me.get(key));
		}
		
		// 2. Iterator 인터페이스
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			String value = me.get(key);
			System.out.println(key + ": " + value);
		}
		
		// 3. 데이터 쌍(pair)으로 뺄 수 있습니다.
		// entry : key와 value를 묶어서 entry라고 합니다.
		// key : getKey()
		// value : getValue()
		Set<Map.Entry<String, String>> entrys = me.entrySet();
		
		// 1) for
		for (Map.Entry<String, String> entry : entrys) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		// 2) Iterator
		Iterator<Map.Entry<String, String>> itr2 = entrys.iterator();
		while (itr2.hasNext()) {
			Map.Entry<String, String> entry = itr2.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		
	
	}
	

}
