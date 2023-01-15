package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMaps {

	public static void main(String[] args) {
		HashMap<Integer,String> s=new HashMap<>();
		s.put(5, "Akhil");
		s.put(98, "Sachin");
		s.put(54, "Reetu");
		s.put(10, "Gita");
		s.put(15, "faruq");
		s.put(9, "Punit");
		
		System.out.println("=====travering using key=====");
		for(Integer i:s.keySet())
		{//Set representation of key 
			System.out.println(i);
		}

		System.out.println("======traversing using values====");
		for(String i:s.values())
		{//Set representation of values
			System.out.println(i);
		}
		
		System.out.println("======traversing using MapEntry===");
		for(Map.Entry<Integer, String> me:s.entrySet())
		{//Set representation of key values
			System.out.println(me);
		}
		
		System.out.println("====Traversing using Iterator====");
		//Generic travesing
		Iterator<Map.Entry<Integer,String>> itr=s.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//Non generic Traversing:
		//Set s=s.
	}

}
