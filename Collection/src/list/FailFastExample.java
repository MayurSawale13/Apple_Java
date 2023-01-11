package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class FailFastExample {

	public static void main(String[] args) {
		 ArrayList<Integer> al = new ArrayList<>();
	        al.add(11);
	        al.add(2);
	        al.add(33);
	        al.add(44);
	        al.add(55);
	        Iterator<Integer> itr = al.iterator();
	        while (itr.hasNext()) {
	            if (itr.next() == 2) {
	   //can not use arrayList add,remove method while traversing         	
	                // al.remove(2);
	            	itr.remove();
	            }
	        }
	   //iterator methods:remove,hasNext,next     
	     //ListIterator Methods:nextIndex,hasNext,hasPrevious,previous,
	      //-PreviousIndex,add,remove 
	        ListIterator <Integer> li=al.listIterator();
	        while(li.hasNext())
	        {
	        	int i=li.next();
	        	System.out.println(li.nextIndex());
	        }
	}

}
