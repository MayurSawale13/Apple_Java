package map_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class OrderMain {
	void addElements(ArrayList<Order> al) {
		al.add(new Order(15, "pune", "shirt", "delivered"));
		al.add(new Order(16, "banglore", "shoes", "pending"));
		al.add(new Order(20, "banglore", "mobile", "delivered"));
		al.add(new Order(17, "mumbai", "fridge", "pending"));
		al.add(new Order(11, "delhi", "shirt", "delivered"));
		al.add(new Order(5, "mumbai", "shoes", "delivered"));
		al.add(new Order(1, "banglore", "mobile", "pending"));
		al.add(new Order(6, "mumbai", "shoes", "delivered"));
		al.add(new Order(8, "banglore", "shirt", "pending"));
		al.add(new Order(9, "delhi", "mobile", "pending"));
		al.add(new Order(14, "mumbai", "shoes", "delivered"));
		al.add(new Order(12, "banglore", "mobile", "delivered"));
		al.add(new Order(10, "pune", "shirt", "pending"));
		al.add(new Order(15, "delhi", "mobile", "delivered"));
	}

	void storeMap(ArrayList<Order> al, TreeMap<String, Integer> hm) {
		for (Order o : al) {
			String s = o.city;
			if (o.status == "delivered") {
				if (hm.containsKey(s)) {
					hm.put(s, hm.get(s) + 1);
				} else
					hm.put(s, 1);
			}
		}

	}

	public static void main(String[] args) {
		ArrayList<Order> al = new ArrayList<>();
		TreeMap<String, Integer> hm = new TreeMap<>();

		OrderMain o = new OrderMain();
		o.addElements(al);

		
		System.out.println(al);
		o.storeMap(al, hm);

		System.out.println(hm);

	}

}
