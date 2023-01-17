package written;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class NumberHashMap {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(4);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(1);
		al.add(4);
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (Integer x : al) {
			
			if (!hm.containsKey(x)) {
				int v = hm.getOrDefault(x, 1);
				v = v + 1;
				hm.put(x, v);
				
			} 
				
		}
		System.out.println(hm);

		HashMap<String, Integer> hmnew = new HashMap<>();
		for (Map.Entry<Integer, Integer> c : hm.entrySet()) {

			switch (c.getKey()) {
			case 1:
				hmnew.put("one", c.getValue());
				break;
			case 2:
				hmnew.put("two", c.getValue());
				break;
			case 3:
				hmnew.put("three", c.getValue());
				break;
			case 4:
				hmnew.put("four", c.getValue());
				break;
			}
		}
		System.out.println(hmnew);
	}
}
