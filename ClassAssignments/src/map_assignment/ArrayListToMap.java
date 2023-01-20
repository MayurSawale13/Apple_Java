package map_assignment;

import java.util.ArrayList;
import java.util.HashMap;

/*Eg. Items in shpping list are:
[(112,”ParleG”, 20.00, 10),(113,”GoodDay”,40.00,30),
(112,”ParleG”, 20.00, 5),(113,”GoodDay”,40.00,10)]
Then Map would be like this :{{ParleG, 15},{GoodDay,40}}*/
public class ArrayListToMap {
	void create(ArrayList<Item> al) {
		al.add(new Item(15, "Parle G", 3, 20));
		al.add(new Item(15, "Hide n seek", 1, 15));
		al.add(new Item(15, "Parle G", 4, 10));
		al.add(new Item(15, "Good Day", 3, 30));
		al.add(new Item(15, "Good Day", 2, 20));
	}

	void addMap(ArrayList<Item> al) {
		HashMap<String, Integer> hm = new HashMap<>();
		for (Item x : al) {
			String k = x.name;
			if (hm.containsKey(k)) {
				int q = hm.get(k) + x.q;
				hm.put(k, q);
			} else {
				int q = x.q;
				hm.put(k, q);
			}

		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		ArrayList<Item> al = new ArrayList<>();
		ArrayListToMap m = new ArrayListToMap();
		m.create(al);
		System.out.println(al);
		m.addMap(al);

	}

}
