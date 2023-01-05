package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StringArrayListExample {

	public static void main(String[] args) {
		ArrayList <String> months=new ArrayList<>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		//Traversing through arrayList:
		/*for(int i=0;i<months.size();i++)
		{
			if(months.get(i).contains("e"))
				System.out.println(months.get(i)+" "+months.get(i).length());
		}
		for(String s:months)
		{
			if(s.contains("e"))
				System.out.println(s.toString()+" "+s.length());
		}*/
		
		//Iterator:collections,set,queue ,only forward traverse 
		System.out.println("-------Iterator traversing------");
		Iterator<String>it=months.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-------List Iterator Backword Traversing ----");
		ListIterator <String>lit=months.listIterator(months.size());//traverse forwd and backward
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}
}
