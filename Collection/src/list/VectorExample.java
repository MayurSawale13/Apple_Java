package list;

import java.util.Vector;
import java.util.Enumeration;

public class VectorExample {

	private static final String Enumeration = null;

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();// fail fast,but thread safe
		vec.add(50);
		vec.add(20);
		vec.add(80);
		vec.add(60);
		vec.add(30);
		vec.add(20);
		vec.add(10);
		vec.add(70);
		vec.add(50);

		Enumeration<Integer> e = vec.elements();// fail safe iterator i.e
												// Enumeration
		while (e.hasMoreElements()) {
			if (e.nextElement() == 50)
				vec.add(90);
		}
		System.out.println(vec);

	}

}
