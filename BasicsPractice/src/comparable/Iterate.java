package comparable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterate {
public static void main(String[] args) {
	HashMap<String ,Integer> hm=new HashMap<>();
	hm.put("mayur",100);
	hm.put("asd",100);
	hm.put("asd",100);hm.put("faruq",100);
	for(Map.Entry<String,Integer> de:hm.entrySet()){
		System.out.println(de);
	}
	Iterator<Map.Entry<String ,Integer>>itr=hm.entrySet().iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
