package august_eclipse_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

/*2.Flipkart maintains a list<order> from different places .
Order has (orderid,city,itemname,status).
From this create a Map which stores key has cityname and
count as no of order’s  pending in that city. Data should be sorted
according to city .*/
public class Q2 {

	void createList(ArrayList<Order> al) {
		al.add(new Order(1002, "shoe", "mumbai", "delivered"));
		al.add(new Order(1003, "bat", "mumbai", "pending"));
		al.add(new Order(1004, "shirts", "pune", "pending"));
		al.add(new Order(1005, "jeans", "banglore", "pending"));
		al.add(new Order(1006, "shirts", "mumbai", "pending"));
		al.add(new Order(1007, "shoe", "pune", "pending"));
		al.add(new Order(1008, "ball", "pune", "pending"));
		al.add(new Order(1009, "food", "surat", "pending"));
	}

	void pendingDetails(ArrayList<Order> al) {
		TreeMap<String, Integer> hm = new TreeMap<>();
		for (Order x : al) {
			if (x.status.equals("pending")) {
				if (hm.containsKey(x.city)) {
					hm.put(x.city, hm.get(x.city) + 1);
				} else
					hm.put(x.city, 1);

			}
		}
		System.out.println(hm);

	}

	public static void main(String[] args) {
		ArrayList<Order> al = new ArrayList<>();
		Q2 e = new Q2();

		e.createList(al);
		Collections.sort(al);
		System.out.println(al);
		e.pendingDetails(al);

	}

}
