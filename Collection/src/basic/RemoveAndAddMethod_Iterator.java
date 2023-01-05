package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class RemoveAndAddMethod_Iterator {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("this");
		a.add("way");
		
		a.add("Forward");
		//solving concurrent Exception using remove() of iterator
		Iterator<String> it;
		for(it=a.iterator();it.hasNext();)
		{
			if(it.next().equals("way"))
				it.remove();
			
			//System.out.println(s);
		}
		System.out.println(a);
		//add method 
		ListIterator<String> lit;
		
		for(lit=a.listIterator(a.size());lit.hasPrevious();)
		{
			if(lit.previous().contains("Forward")){
				lit.add("Way");
			}
			
		}
		System.out.println(a);

	}

}
