package comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;

/*1.WAP to sort the elements of List that contains
String objects.Print ArrayList.Sort using 
Collections.sort(list) method. Print ArrayList.
2.WAP to sort the elements of List that contains 
Integer objects.Print ArrayList.Sort using
Collections.sort(list) method.Print ArrayList*/
public class SortArrayListWithString_Integer {

	void addElements(ArrayList<Integer> al,ArrayList<String> al2)
	{
		al.add(50);
		al.add(30);
		al.add(20);
		al.add(40);
		al.add(10);
		al2.add("sam");
		al2.add("zeeshan");
		al2.add("mayur");
		al2.add("ankit");
		al2.add("jack");
	}
	public static void main(String[] args) {
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<String> al2=new ArrayList<>();
		SortArrayListWithString_Integer sa=new SortArrayListWithString_Integer();
		sa.addElements(al1, al2);
		System.out.println("----Before Sorting-----");
		System.out.println(al1);
		System.out.println(al2);
		Collections.sort(al1);
		Collections.sort(al2);
		System.out.println("---After sorting(Wrapper,String implements Comparable) ----");
		System.out.println(al1);
		System.out.println(al2);
	}

}
