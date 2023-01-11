package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListStrings {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		s.add("demon");
		s.add("zidane");
		s.add("henry");
		s.add("mayur");
		s.add("peter");
		s.add("Emma");
		ArrayList<String> n = new ArrayList<>();
		n.add("maitri");
		n.add("nimisha");

		System.out.println("----Inserting more than elements at index---");
		s.addAll(2, n);

		System.out.println("====Before Sorting======" + s);
		Collections.sort(s);
		System.out.println("=====After Sorting======" + s);

	}

}
