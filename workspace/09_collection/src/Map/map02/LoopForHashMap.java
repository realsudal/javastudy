package Map.map02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class LoopForHashMap {

	public static void main(String[] args) {
		Map<String, String > me= new HashMap<String, String>();
		
		
		
		me.put("name","목진경");
		me.put("age",44+"");
		me.put("phone","010-445-775");
		
		//1, 항상 for문은 key만 뺀다. (key를 알아야 value를 뺄수 있음)
		//me에서 key만 빼는 메소드 :keySet();
		Set<String> keys=me.keySet();
		for(String key:keys) {
			System.out.println(key+":"+me.get(key));
		}
		
		//2, iterator 인터페이스	
		Iterator<String> itr=keys.iterator();
		
		while(itr.hasNext()) {//set에 남이있는 요소가 있으면
			String key=itr.next();//1회용
			String value=me.get(key);
			System.out.println(key+":"+value);
		}
		
		
		/*3, 데이터 쌍 (pair)으로 뺄 수 있습니다.
		 * enty : key와 value를 묶어서 entry라고 합니다.
		 * key : getkey()
		 * value : getValue()
		 */

		
		Set<Map.Entry<String,String>> enstrys = me.entrySet();
		
		//1.for
		for(Map.Entry<String,String> entry:enstrys) {
			String key=entry.getValue();
			string value=entry.getValue();
			System.out.println(key + ":"+ value);
		}
		//2.iterator
		Iterator<Map.Entry<String, String>
		
		
	}
	

}
