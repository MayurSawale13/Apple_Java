package set_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*51.Create hashset of strings. Add 10 elements to the set. 
Iterate through hashset using iterator and for each loop. */
public class IterateSet {
	void createSet(HashSet<Integer> hs){
		hs.add(10);
		hs.add(50);
		hs.add(60);
		hs.add(20);
		hs.add(90);
		hs.add(70);
		hs.add(60);
		hs.add(10);
	} 
	

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		IterateSet a=new IterateSet();
		a.createSet(hs);
	
		System.out.println(hs);
		for(Integer x:hs){
			System.out.print(x+" ");
		}
		System.out.println("\n");
		Iterator<Integer>itr=hs.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		Integer a1[]=new Integer [hs.size()];
		hs.toArray(a1);
		System.out.println(Arrays.toString(a1));
	}

}
