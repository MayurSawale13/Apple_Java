package extra_prep;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListChar {

	void search(ArrayList<String> al) {
		HashMap<String, Integer> hm = new HashMap<>();
		for (String x : al) {
			String[] s = x.split("\\+");
			hm.put(s[0], Integer.parseInt(s[1]));
		}
		String s1 = "A";
		for (String x : hm.keySet()) {
			if (x.equals(s1)) {
				System.out.println(hm.get(x));
			}
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("A+2");
		al.add("B+12");
		al.add("D+5");
		al.add("DD+8");
		ArrayListChar a = new ArrayListChar();
		a.search(al);
	}
}
