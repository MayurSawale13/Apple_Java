package collection;

import java.util.ArrayList;

public class SearchElementMethods {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(61);
		al.add(62);
		al.add(63);
		al.add(64);
		al.add(65);
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(61);
		al1.add(62);
		al1.add(63);
		/*al.add(64);
		al.add(65);*/
		
		System.out.println(al.contains(63));  //search element
		System.out.println(al.containsAll(al1));//search specified list (group of element) 
		System.out.println(al.retainAll(al1)); //search sub list 
		System.out.println(al1);
	}

}
