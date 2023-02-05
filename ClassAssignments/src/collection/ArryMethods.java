package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryMethods {
	
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
	al1.add(64);
	al1.add(65);
	//al.clear();
	
	System.out.println(al);
	System.out.println(al1.containsAll(al));
	System.out.println(al.get(2));
	System.out.println(al1.contains(10));
	/*Iterator<Integer> itr=al.iterator();
	for(int i=itr.next();itr.hasNext();)
	{
		System.out.print(itr.next());
	}*/
	
	System.out.println(al1.retainAll(al));
	System.out.println(al);
	System.out.println(al1);
//	System.out.println(al);
	al.remove("def");
	al.clear();
	for(Object x:al)
	{
		
		System.out.println(x );
	}
}
}
