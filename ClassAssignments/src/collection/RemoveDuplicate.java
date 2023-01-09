package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<Character> gt = new ArrayList<>();

		gt.add('d');
		gt.add('g');
		gt.add('h');
		gt.add('d');
		gt.add('d');
		gt.add('h');
		gt.add('g');

		System.out.println(gt);
		for (int i = 0; i < gt.size(); i++) {
			int count = 1;
			for (int j = i + 1; j < gt.size(); j++) {
				if (gt.get(i) == gt.get(j)) {
					count++;
					gt.set(j, '0');
				}
			}
			if (gt.get(i) != '0') {
				System.out.println(gt.get(i) + "-" + count);
			}
		}
		System.out.println(gt);

	}

}
