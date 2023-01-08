package list;

import java.util.ArrayList;
import java.util.Iterator;

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
	                 al.remove(2);
	            }
	        }
	        

	}

}
