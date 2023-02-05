package collection;

import java.util.ArrayList;

public class ArrayListWithinArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> og=new ArrayList<>();
		
		
	
		ArrayList<Integer> n1=new ArrayList<>();
		n1.add(11);
		n1.add(12);
		n1.add(13);
		og.add(n1);
		System.out.println(og);
		System.out.println(og.contains(11));
		System.out.println(og.containsAll(n1));
		
	}

}
