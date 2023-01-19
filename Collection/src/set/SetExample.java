package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
	//1.Hash Set:random order
	//2.:inked Hashset-inserting order
	//3.TreeSet:sorted order

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(60);
		hs.add(10);
		hs.add(80);
		hs.add(70);
		hs.add(30);
		hs.add(70);
		System.out.println(hs);
		LinkedHashSet<Integer> hl=new LinkedHashSet<>();
		hl.add(10);
		hl.add(60);
		hl.add(10);
		hl.add(80);
		hl.add(70);
		hl.add(30);
		hl.add(70);
		System.out.println(hl);
		TreeSet <Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(60);
		ts.add(10);
		ts.add(80);
		ts.add(70);
		ts.add(30);
		ts.add(70);
		System.out.println(ts);
		
		System.out.println("Traversing:");
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println("\n");
		for(Integer i:hs)
		{
			System.out.print(i+" ");
		}
		System.out.println("First:"+ts.first());
		System.out.println("Last:"+ts.last());
		System.out.println("Floor:"+ts.floor(50));
		System.out.println("Ceiling:"+ts.ceiling(35));
	}

}
