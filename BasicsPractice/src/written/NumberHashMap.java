package written;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class NumberHashMap {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(4);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(1);
		ll.add(4);
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (Integer x : ll) {
			if (hm.containsKey(x)) {
				int v = hm.get(x);
				v = v + 1;
				hm.put(x, v);
			} else
				hm.put(x, 1);
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
