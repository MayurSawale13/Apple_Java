package map_assignment;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer> ll1 = new LinkedList<>();
		LinkedList<Integer> ll2 = new LinkedList<>();
		LinkedList<Integer> ll3 = new LinkedList<>();
		for (int i = 1; i < 7; i++) {
			ll1.add(i);
		}
		for (int i = 11; i < 45; i++) {
			ll2.add(i);
			i = i + 10;
		}
		System.out.println(ll1);
		System.out.println(ll2);

		for (int i = 0; i < ll1.size(); i++) {

			ll3.add(ll1.get(i));
			if (i < ll2.size()) {
				ll3.add(ll2.get(i));
			}
		}
		System.out.println(ll3);
	}

}
