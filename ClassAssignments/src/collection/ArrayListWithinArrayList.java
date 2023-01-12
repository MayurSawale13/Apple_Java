package collection;

import java.util.ArrayList;

public class ArrayListWithinArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> og=new ArrayList<>();
		og.add(16);
		og.add(11);
		og.add(15);
		og.add(13);
		ArrayList<Integer> n1=new ArrayList<>();
		n1.add(11);
		n1.add(12);
		n1.add(13);
		System.out.println(og.contains(11));
		System.out.println(og.containsAll(n1));
		}

}
