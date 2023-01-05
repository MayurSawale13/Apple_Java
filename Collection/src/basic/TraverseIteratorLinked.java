package basic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TraverseIteratorLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> names=new LinkedList<>();
		names.add("Akhil");
		names.add("Amit");
		names.add("Apasra");
		names.add("Amit");
		names.add("Balaji");
		names.add("Casper");
		System.out.println();
		/*System.out.println("----Try remove all occurances(Concurrent Exception)---");
		for(String s:names)
		{
			if(s.contains("Amit"))
			{
				boolean b=names.remove("Amit");
				System.out.print(b+" Removed");
			}
		}*/
		System.out.println("----------Iterator traversing----");
		Iterator<String> lis=names.iterator();
		while(lis.hasNext())
		{
			System.out.println(lis.next());
		}
		System.out.println("-----List Iterator Traversing Forward----");
		ListIterator <String> lls=names.listIterator();
		while(lls.hasNext())
		{
			System.out.println(lls.next());
		}
		System.out.println("-----List iterator Backwrd Traversing----");
		ListIterator <String> llb=names.listIterator(names.size());
		while(llb.hasPrevious())
		{
			System.out.println(llb.previous());
		}
	}

}
