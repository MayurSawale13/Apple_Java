package august_final_test;

import java.util.HashMap;

/*17.WAP to find out frequency of each digit in given mobile number
using only single loop. [1M]*/
public class Q17 {

	public static void main(String[] args) {
		String num = "98456878654";
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < num.length(); i++) {
			Character c = num.charAt(i);
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else
				hm.put(c, 1);
		}
		System.out.println(hm);
	}

}
