package list;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChar {

	public static void main(String[] args) {

		ArrayList<Character> al = new ArrayList<>();
		al.add('a');
		al.add('b');
		al.add('a');
		al.add('e');
		al.add('j');
		al.add('a');
		al.add('e');
		al.add('a');
		al.add('b');
		System.out.println(Collections.frequency(al, 'b'));

		for (int i = 0; i < al.size(); i++) {
			int cnt = 1;

			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i) == al.get(j)) {
					cnt++;
					al.set(j, '0');
				}
			}
			if (al.get(i) != '0') {
				System.out.println(al.get(i) + " " + cnt);
			}

		}

		System.out.println(al);

	}

}
