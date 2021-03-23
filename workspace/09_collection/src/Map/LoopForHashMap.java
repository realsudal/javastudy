package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LoopForHashMap {

	Map<String, String > me= new HashMap<String, String>();
	
	
	
	me.put("name","목진경");
	me.put("age",44+"");
	me.put("phone","010-445-775");
	
	//1, 항상 for문은 key만 뺀다. (key를 알아야 value를 뺄수 있음)
	//me에서 key만 빼는 메소드 :keySet();
	Set<string> keys=me.keySet();
	
	
	//2, iterator 인터페이스
	
	
	
	Iterator<String> itr2=me.iterator();
	
	while(itr2.hasNext()) {//set에 남이있는 요소가 있으면
		String str2=itr2.next();
		System.out.println(str2);
	}
	
}
